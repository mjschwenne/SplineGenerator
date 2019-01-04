package org.wlrobotics.splinegenerator;

import java.io.File;
import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Trajectory;
import jaci.pathfinder.Waypoint;
import static java.lang.System.*;

public class TroBotSplineGenerator extends Object {

	static final double deltaTime = 0.02;
	static final double maxJerk   = 5.00;
	static final double maxVel    = 2.80;
	static final double maxAccel  = 2.50;

	public static void main(String[] args) {
		System.out.println("");

		Trajectory.Config config = new Trajectory.Config(Trajectory.FitMethod.HERMITE_CUBIC,
				Trajectory.Config.SAMPLES_HIGH, deltaTime, maxVel, maxAccel, maxJerk);

		AutonSwitchRight autoSwitchRight = new AutonSwitchRight(config);
		autoSwitchRight.generate();
		autoSwitchRight = null;

		AutonSwitchLeft autoSwitchLeft = new AutonSwitchLeft(config);
		autoSwitchLeft.generate();
		autoSwitchLeft = null;

		AutonScaleRight_2Cube right2Cube = new AutonScaleRight_2Cube(config);
		right2Cube.generate();
		right2Cube = null;

		Trajectory.Config configSlow = new Trajectory.Config(Trajectory.FitMethod.HERMITE_CUBIC,
				Trajectory.Config.SAMPLES_HIGH, deltaTime, maxVel/2.5, maxAccel, maxJerk);

		AutonScaleRight_CrossCourt rightCrossCourt = new AutonScaleRight_CrossCourt(configSlow);
		rightCrossCourt.generate();
		rightCrossCourt = null;

	}
}
