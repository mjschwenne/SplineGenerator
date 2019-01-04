package org.wlrobotics.splinegenerator;

import java.io.File;
import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Trajectory;
import jaci.pathfinder.Waypoint;
import java.util.*;

class AutonSwitchRight extends BaseAutonGenerator {

  AutonSwitchRight (Trajectory.Config conf) {
    this.config = conf;
    baseFileName = this.getClass().getSimpleName();
    gnuPlotString = "plot '%s' using 2:3 w lp lt rgb 'dark-green'";
  }

  private Trajectory gen_SwitchRight_01() {
		Waypoint[] points = new Waypoint[] {
			new Waypoint(0, 4, 0),
			new Waypoint(.25, 4, 0),
			new Waypoint(2.5, 2.6, 0),
			new Waypoint(3.6, 2.6, 0) };
		return (Pathfinder.generate(points, this.config));
	}

	private Trajectory gen_SwitchRight_02() {
		Waypoint[] points = new Waypoint[] {
			new Waypoint(3.6, 2.6, 0),
			new Waypoint(2.00, 2.6, 0),
			new Waypoint(1.25, 3.3, Pathfinder.d2r(90)),
			new Waypoint(2.00, 4, 0),
			new Waypoint(2.5, 4, 0) };
		return (Pathfinder.generate(points, this.config));
	}

  private Trajectory gen_SwitchRight_03() {
		Waypoint[] points = new Waypoint[] {
			new Waypoint(2.50, 4.00, 0),
			new Waypoint(2.00, 4.00, 0),
			new Waypoint(1.25, 3.30, Pathfinder.d2r(90)),
      new Waypoint(2.00, 2.60, 0),
      new Waypoint(3.60, 2.60, 0)
			};
		return (Pathfinder.generate(points, this.config));
	}


  void generate () {
    this.segments.add (gen_SwitchRight_01());
    this.segments.add (gen_SwitchRight_02());
    this.segments.add (gen_SwitchRight_03());
    this.write();
  }
}
