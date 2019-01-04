package splineGenerator;

import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Waypoint;

public class SplineSettings {
	//System Settings
	static final double deltaTime = 0.02;
	static final double maxJerk   = 5.00;
	static final double maxVel    = 3.00;
	static final double maxAccel  = 2.50;
	
	//2 cube switch right
	public static final String start2switchFile = "Auton_CenterRight_01.csv";
	public static final Waypoint[] start2switchPoints = new Waypoint[] {
			new Waypoint(0.00, 4.00, 0),
			new Waypoint(0.25, 4.00, 0),
			new Waypoint(2.50, 2.60, 0),
			new Waypoint(3.60, 2.60, 0) };
	public static final String switch2cubeFile = "Auton_CenterRight_02.csv";
	public static final Waypoint[] switch2cubePoints = new Waypoint[] {
			new Waypoint(3.60, 2.60, 0),
			new Waypoint(2.00, 2.60, 0),
			new Waypoint(1.25, 3.30, Pathfinder.d2r(90)),
			new Waypoint(2.00, 4.00, 0),
			new Waypoint(2.50, 4.00, 0) };
	public static final String cubeB2switchFile = "Auton_CenterRight_03.csv";
	public static final Waypoint[] cubeB2switchPoints = new Waypoint[] {
			new Waypoint(2.50, 4.00, 0),
			new Waypoint(2.00, 4.00, 0),
			new Waypoint(1.25, 3.30, Pathfinder.d2r(90)),
			new Waypoint(2.00, 2.60, 0),
			new Waypoint(3.60, 2.60, 0) };
}
