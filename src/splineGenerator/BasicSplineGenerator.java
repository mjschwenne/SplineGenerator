package splineGenerator;

import java.io.File;

import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Trajectory;
import jaci.pathfinder.Waypoint;

public class BasicSplineGenerator {

	public static void main(String[] args) {
		genRCubeSwitch();
	}

	static void genRCubeSwitch() {
		genSpline(SplineSettings.start2switchPoints, SplineSettings.start2switchFile);
		genSpline(SplineSettings.switch2cubePoints, SplineSettings.switch2cubeFile);
		genSpline(SplineSettings.cubeB2switchPoints, SplineSettings.cubeB2switchFile);
	}

	static void genSpline(Waypoint[] points, String fileName) {
		Trajectory.Config config = new Trajectory.Config(Trajectory.FitMethod.HERMITE_CUBIC,
				Trajectory.Config.SAMPLES_HIGH, SplineSettings.deltaTime, SplineSettings.maxVel,
				SplineSettings.maxAccel, SplineSettings.maxJerk);

		Trajectory trajectory = Pathfinder.generate(points, config);

		File splineFile = new File(fileName);
		Pathfinder.writeToCSV(splineFile, trajectory);
	}
}
