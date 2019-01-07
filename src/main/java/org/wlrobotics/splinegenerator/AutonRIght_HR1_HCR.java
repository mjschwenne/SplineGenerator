package org.wlrobotics.splinegenerator;

import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Trajectory;
import jaci.pathfinder.Waypoint;

class AutonRight_HR1_HCR extends BaseAutonGenerator {

  AutonRight_HR1_HCR (Trajectory.Config conf) {
    this.config = conf;
    baseFileName = this.getClass().getSimpleName();
    gnuPlotString = "plot '%s' using 2:3 w lp lt rgb 'royalblue'";
  }

  private Trajectory gen_Auton_HR1_HCR_01() {
		Waypoint[] points = new Waypoint[] {
      new Waypoint(1.50, 3.00, Pathfinder.d2r(0)),
      new Waypoint(5.00, 2.00, Pathfinder.d2r(0)),
      new Waypoint(6.66, 2.80, Pathfinder.d2r(90)),
      new Waypoint(6.66, 3.30, Pathfinder.d2r(90))
		};
		return (Pathfinder.generate(points, config));
    }

    private Trajectory gen_Auton_HR1_HCR_02(){
      Waypoint[] points = new Waypoint[] {
        new Waypoint(6.66, 3.30, Pathfinder.d2r(-90)),
        new Waypoint(6.66, 2.80, Pathfinder.d2r(-90)),
        new Waypoint(4.00, 1.00, Pathfinder.d2r(195)),
        new Waypoint(0.45, 0.66, Pathfinder.d2r(180)),
        new Waypoint(0.00, 0.66, Pathfinder.d2r(180))
      };
      return (Pathfinder.generate(points, config));
    }

    private Trajectory gen_Auton_HR1_HCR_03(){
      Waypoint[] points = new Waypoint[] {
        new Waypoint(0.00, 0.66, Pathfinder.d2r(0)),
        new Waypoint(0.45, 0.66, Pathfinder.d2r(0)),
        new Waypoint(5.66, 3.75, Pathfinder.d2r(0))
      };
      return (Pathfinder.generate(points, config));
    }

    private Trajectory gen_Auton_HR1_HCR_04(){
      Waypoint[] points = new Waypoint[] {
        new Waypoint(5.66, 3.75, Pathfinder.d2r(180)),
        new Waypoint(0.45, 0.66, Pathfinder.d2r(180))
      };
      return (Pathfinder.generate(points, config));
    }

  void generate () {
    segments.add (gen_Auton_HR1_HCR_01());
    segments.add (gen_Auton_HR1_HCR_02());
    segments.add (gen_Auton_HR1_HCR_03());
    segments.add (gen_Auton_HR1_HCR_04());
    write();
  }
}
