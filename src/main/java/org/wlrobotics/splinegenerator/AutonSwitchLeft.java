package org.wlrobotics.splinegenerator;

import java.io.File;
import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Trajectory;
import jaci.pathfinder.Waypoint;
import java.util.*;

class AutonSwitchLeft extends BaseAutonGenerator {

  AutonSwitchLeft (Trajectory.Config conf) {
    this.config = conf;
    baseFileName = this.getClass().getSimpleName();
    gnuPlotString = "plot '%s' using 2:3 w lp lt rgb 'sea-green'";
  }

  private Trajectory  gen_Auton_CenterLeft_01() {
		Waypoint[] points = new Waypoint[] {
			new Waypoint(0.00, 4.00, 0),
			new Waypoint(0.50, 4.00, 0),
			new Waypoint(2.50, 5.30, 0),
			new Waypoint(3.60, 5.30, 0) };
		return (Pathfinder.generate(points, this.config));
	}

	private Trajectory  gen_Auton_CenterLeft_02() {
		Waypoint[] points = new Waypoint[] {
			new Waypoint(3.60, 5.30, 0),
			new Waypoint(2.00, 5.30, 0),
			new Waypoint(1.20, 4.50, Pathfinder.d2r(-90)),
			new Waypoint(2.00, 4.00, 0),
			new Waypoint(2.50, 4.00, 0) };
		return (Pathfinder.generate(points, this.config));
	}

  private Trajectory  gen_Auton_CenterLeft_03() {
    Waypoint[] points = new Waypoint[] {
      new Waypoint(2.50, 4.00, 0),
      new Waypoint(2.00, 4.00, 0),
      new Waypoint(1.20, 4.50, Pathfinder.d2r(-90)),
      new Waypoint(2.00, 5.30, 0),
      new Waypoint(3.60, 5.30, 0)
      };
    return (Pathfinder.generate(points, this.config));
  }


  void generate () {
    segments.add (gen_Auton_CenterLeft_01());
    segments.add (gen_Auton_CenterLeft_02());
    segments.add (gen_Auton_CenterLeft_03());
    write();
  }
}
