package org.wlrobotics.splinegenerator;

import java.io.File;
import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Trajectory;
import jaci.pathfinder.Waypoint;
import java.util.*;

class AutonScaleRight_2Cube extends BaseAutonGenerator {

  AutonScaleRight_2Cube (Trajectory.Config conf) {
    this.config = conf;
    baseFileName = this.getClass().getSimpleName();
    gnuPlotString = "plot '%s' using 2:3 w lp lt rgb 'blue'";
  }

  private Trajectory gen_Auton_RightScale_01() {
		Waypoint[] points = new Waypoint[] {
			new Waypoint(0.00, 1.00, 0),
			new Waypoint(6.00, 1.00, 0),
			new Waypoint(7.70, 1.80, Pathfinder.d2r(45))
		};
		return (Pathfinder.generate(points, config));
	}

	private Trajectory  gen_Auton_RightScale_02() {
		Waypoint[] points = new Waypoint[] {
			new Waypoint(7.70, 1.80, Pathfinder.d2r(45)),
			//new Waypoint(6.50, 0.7, Pathfinder.d2r(-30)),
			new Waypoint(5.60, 2.3, Pathfinder.d2r(0)),
			new Waypoint(5.40, 2.3, Pathfinder.d2r(0))
		};
		return (Pathfinder.generate(points, config));

	}

	private Trajectory gen_Auton_RightScale_03() {
		Waypoint[] points = new Waypoint[] {
			new Waypoint(5.40, 2.3, Pathfinder.d2r(0)),
			new Waypoint(5.60, 2.3, Pathfinder.d2r(0)),
			new Waypoint(6.50, 1.0, Pathfinder.d2r(-30)),
			new Waypoint(8.00, 0.70, Pathfinder.d2r(45)),
			new Waypoint(8.35, 1.80, Pathfinder.d2r(90))
		};
		return (Pathfinder.generate(points, config));
	}

  void generate () {
    segments.add (gen_Auton_RightScale_01());
    segments.add (gen_Auton_RightScale_02());
    segments.add (gen_Auton_RightScale_03());
    write();
  }
}
