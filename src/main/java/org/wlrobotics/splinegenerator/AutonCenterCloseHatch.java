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

    private Trajectory gen_Auton_CloseHatch_02(){
      Waypoint[] points = new Waypoint[] {
        new Waypoint(5.66, 4.25, Pathfinder.d2r(180)),
        new Waypoint(1.00, 6.00, Pathfinder.d2r(180))
      };
      return (Pathfinder.generate(points, config));
    }

    private Trajectory gen_Auton_CloseHatch_03(){
      Waypoint[] points = new Waypoint[] {
        new Waypoint(1.00, 6.00, 0),
        new Waypoint(3.00, 6.00, 0),
        new Waypoint(4.00, 5.00, Pathfinder.d2r(90))
      };
      return (Pathfinder.generate(points, config));
    }

    private Trajectory gen_Auton_CloseHatch_04(){
      Waypoint[] points = new Waypoint[] {
        new Waypoint(4.00, 5.00, Pathfinder.d2r(-90)),
        new Waypoint(6.50, 6.00, Pathfinder.d2r(0)),
        new Waypoint(7.75, 5.20, Pathfinder.d2r(-90)),
        new Waypoint(7.75, 4.66, Pathfinder.d2r(-90))
      };
      return (Pathfinder.generate(points, config));
    }

  void generate () {
    segments.add (gen_Auton_CloseHatch_01());
    segments.add (gen_Auton_CloseHatch_02());
    segments.add (gen_Auton_CloseHatch_03());
    segments.add (gen_Auton_CloseHatch_04());
    write();
  }
}
