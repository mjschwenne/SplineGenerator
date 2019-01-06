package org.wlrobotics.splinegenerator;

import jaci.pathfinder.Trajectory;

public class TroBotSplineGenerator extends Object {

	static final double deltaTime = 0.02;
	static final double maxJerk   = 5.00;
	static final double maxVel    = 3.25;
	static final double maxAccel  = 3.00;
	public static void main(String[] args) {
		System.out.println("");

		Trajectory.Config config = new Trajectory.Config(Trajectory.FitMethod.HERMITE_CUBIC,
				Trajectory.Config.SAMPLES_HIGH, deltaTime, maxVel, maxAccel, maxJerk);

		AutonCenterCloseHatch closeHatch = new AutonCenterCloseHatch(config);
		closeHatch.generate();
		closeHatch = null;

		AutonRight_HR1_HCR HR1_HCR = new AutonRight_HR1_HCR(config);
		HR1_HCR.generate();
		HR1_HCR = null;

	}
}
