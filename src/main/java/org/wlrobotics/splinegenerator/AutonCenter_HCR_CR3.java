package org.wlrobotics.splinegenerator;

import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Trajectory;
import jaci.pathfinder.Waypoint;

class AutonCenter_HCR_CR3 extends BaseAutonGenerator {

AutonCenter_HCR_CR3 (Trajectory.Config conf) {
    this.config = conf;
    baseFileName = this.getClass().getSimpleName();
    gnuPlotString = "plot '%s' using 2:3 w lp lt rgb 'orange'";
  }

  private Trajectory gen_Auton_HCR_CR3_01() {
	Waypoint[] points = new Waypoint[] {
		new Waypoint(1.50, 4.00, Pathfinder.d2r(0)),
		new Waypoint(5.66, 3.75, Pathfinder.d2r(0))
	  };
	  return (Pathfinder.generate(points, config));
    }

    private Trajectory gen_Auton_HCR_CR3_02(){
      Waypoint[] points = new Waypoint[] {
        new Waypoint(5.66, 3.75, Pathfinder.d2r(180)),
        new Waypoint(1.00, 2.00, Pathfinder.d2r(180))
      };
      return (Pathfinder.generate(points, config));
    }

    private Trajectory gen_Auton_HCR_CR3_03(){
      Waypoint[] points = new Waypoint[] {
        new Waypoint(1.00, 2.00, 0),
        new Waypoint(3.00, 2.00, 0),
        new Waypoint(4.00, 3.00, Pathfinder.d2r(90))
      };
      return (Pathfinder.generate(points, config));
    }

    private Trajectory gen_Auton_HCR_CR3_04(){
      Waypoint[] points = new Waypoint[] {
        new Waypoint(4.00, 3.00, Pathfinder.d2r(-90)),
        new Waypoint(6.50, 2.00, Pathfinder.d2r(0)),
        new Waypoint(7.75, 2.80, Pathfinder.d2r(-90)),
        new Waypoint(7.75, 3.33, Pathfinder.d2r(-90))
      };
      return (Pathfinder.generate(points, config));
    }

  void generate () {
    segments.add (gen_Auton_HCR_CR3_01());
    segments.add (gen_Auton_HCR_CR3_02());
    segments.add (gen_Auton_HCR_CR3_03());
    segments.add (gen_Auton_HCR_CR3_04());
    write();
  }
}
