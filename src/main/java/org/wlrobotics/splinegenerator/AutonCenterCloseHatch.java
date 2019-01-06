package org.wlrobotics.splinegenerator;

import java.io.File;
import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Trajectory;
import jaci.pathfinder.Waypoint;
import java.util.*;

class AutonCenterCloseHatch extends BaseAutonGenerator {

AutonCenterCloseHatch (Trajectory.Config conf) {
    this.config = conf;
    baseFileName = this.getClass().getSimpleName();
    gnuPlotString = "plot '%s' using 2:3 w lp lt rgb 'red'";
  }

  private Trajectory gen_Auton_CloseHatch_01() {
		Waypoint[] points = new Waypoint[] {
			new Waypoint(1.50, 4.00, 0),
			new Waypoint(5.66, 4.25, 0)
		};
		return (Pathfinder.generate(points, config));
    }

  void generate () {
    segments.add (gen_Auton_CloseHatch_01());
    write();
  }
}
