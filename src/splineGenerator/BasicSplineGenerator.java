package splineGenerator;

import java.io.File;

import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Trajectory;
import jaci.pathfinder.Waypoint;

public class BasicSplineGenerator {
	public static void main(String[] args) {
		Waypoint[] points = new Waypoint[] {
			    new Waypoint(3.6, 2.6, 0), 
			    new Waypoint(2.25, 2.6, 0),
			    new Waypoint(1.75, 3.3, Pathfinder.d2r(90)),
			    new Waypoint(2.25, 4, 0),
			    new Waypoint(2.5, 4, 0)
			};

			Trajectory.Config config = new Trajectory.Config(Trajectory.FitMethod.HERMITE_CUBIC, Trajectory.Config.SAMPLES_HIGH, 0.02, 1.7, 2.0, 60.0);
			Trajectory trajectory = Pathfinder.generate(points, config);
			
			File test_spline = new File("spline_cube.cvs");
			Pathfinder.writeToCSV(test_spline, trajectory);
	}
}
