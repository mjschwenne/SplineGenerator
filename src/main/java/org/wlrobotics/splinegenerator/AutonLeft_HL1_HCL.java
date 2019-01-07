package org.wlrobotics.splinegenerator;

import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Trajectory;
import jaci.pathfinder.Waypoint;

class AutonLeft_HL1_HCL extends BaseAutonGenerator {

  AutonLeft_HL1_HCL (Trajectory.Config conf) {
    this.config = conf;
    baseFileName = this.getClass().getSimpleName();
    gnuPlotString = "plot '%s' using 2:3 w lp lt rgb 'blue'";
  }

  private Trajectory gen_Auton_HL1_HCL_01() {
		Waypoint[] points = new Waypoint[] {
      new Waypoint(1.50, 5.00, Pathfinder.d2r(0)),
      new Waypoint(5.00, 6.00, Pathfinder.d2r(0)),
      new Waypoint(6.66, 5.20, Pathfinder.d2r(90)),
      new Waypoint(6.66, 4.70, Pathfinder.d2r(90))
		};
		return (Pathfinder.generate(points, config));
    }

    private Trajectory gen_Auton_HL1_HCL_02(){
      Waypoint[] points = new Waypoint[] {
        new Waypoint(6.66, 4.70, Pathfinder.d2r(-90)),
        new Waypoint(6.66, 5.20, Pathfinder.d2r(-90)),
        new Waypoint(4.00, 7.00, Pathfinder.d2r(165)),
        new Waypoint(0.45, 7.33, Pathfinder.d2r(180)),
        new Waypoint(0.00, 7.33, Pathfinder.d2r(180))
      };
      return (Pathfinder.generate(points, config));
    }

    private Trajectory gen_Auton_HL1_HCL_03(){
      Waypoint[] points = new Waypoint[] {
        new Waypoint(0.00, 7.33, Pathfinder.d2r(0)),
        new Waypoint(0.45, 7.33, Pathfinder.d2r(0)),
        new Waypoint(5.66, 4.25, Pathfinder.d2r(0))
      };
      return (Pathfinder.generate(points, config));
    }

    private Trajectory gen_Auton_HL1_HCL_04(){
      Waypoint[] points = new Waypoint[] {
        new Waypoint(5.66, 4.25, Pathfinder.d2r(180)),
        new Waypoint(0.45, 7.33, Pathfinder.d2r(180))
      };
      return (Pathfinder.generate(points, config));
    }

  void generate () {
    segments.add (gen_Auton_HL1_HCL_01());
    segments.add (gen_Auton_HL1_HCL_02());
    segments.add (gen_Auton_HL1_HCL_03());
    segments.add (gen_Auton_HL1_HCL_04());
    write();
  }
}