package org.wlrobotics.splinegenerator;

import java.io.File;
import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Trajectory;
import jaci.pathfinder.Waypoint;
import java.util.*;

class AutonScaleRight_CrossCourt extends BaseAutonGenerator {

  AutonScaleRight_CrossCourt (Trajectory.Config conf) {
    this.config = conf;
    baseFileName = this.getClass().getSimpleName();
    gnuPlotString = "plot '%s' using 2:3 w lp lt rgb 'navy'";
  }

  	private Trajectory gen_Auton_RightCrossCourt_01() {
  		Waypoint[] points = new Waypoint[] {
  			new Waypoint(0.00, 1.00, 0),
  			new Waypoint(5.00, 1.00, Pathfinder.d2r(0)),
  			new Waypoint(6.00, 2.25, Pathfinder.d2r(90)),
  			new Waypoint(6.00, 5.00, Pathfinder.d2r(90)),
  			new Waypoint(7.70, 6.00, Pathfinder.d2r(0))
  		};
  		return (Pathfinder.generate(points, config));
  	}

  void generate () {
    segments.add (gen_Auton_RightCrossCourt_01());
    write();
  }
}
