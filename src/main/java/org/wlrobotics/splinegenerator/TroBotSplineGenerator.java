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

		AutonCenter_HCL_CL3 HCL_CL3 = new AutonCenter_HCL_CL3(config);
		HCL_CL3.generate();
		HCL_CL3 = null;

		AutonCenter_HCR_CR3 HCR_CR3 = new AutonCenter_HCR_CR3(config);
		HCR_CR3.generate();
		HCR_CR3 = null;

		AutonRight_HR1_HCR HR1_HCR = new AutonRight_HR1_HCR(config);
		HR1_HCR.generate();
		HR1_HCR = null;

		AutonLeft_HL1_HCL HL1_HCL = new AutonLeft_HL1_HCL(config);
		HL1_HCL.generate();
		HL1_HCL = null;
	}
}
