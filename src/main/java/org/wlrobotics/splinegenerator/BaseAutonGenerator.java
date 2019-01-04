package org.wlrobotics.splinegenerator;

import java.io.File;
import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Trajectory;
import jaci.pathfinder.Waypoint;
import java.util.*;
import static java.lang.System.*;

abstract class BaseAutonGenerator extends Object {
  Trajectory.Config config = null;
  String baseFileName = "unknown";
  String gnuPlotString = "plot '%s' using 2:3 w lp lt rgb 'black'";
  SplineWriter splineWriter = new SplineWriter();
  double totalRunTime = 0.0;
  ArrayList<Trajectory> segments = new  ArrayList<Trajectory>();

  void setBaseFileName(String fName) {
    baseFileName = fName;
  }

  String getBaseFileName () {
    return baseFileName;
  }

  void write (){
    int fileCounter = 0;
    for (Trajectory trajectory:segments){
      String trajFileName = this.baseFileName + "_" +  String.format("%02d", fileCounter) + ".cvs";
      File trajFile = new File(trajFileName);
  	  splineWriter.writeTrajectory(trajectory, trajFile);
      splineWriter.writePlotCommand(String.format(gnuPlotString, trajFileName));
      estSplineRunTime(trajectory.length(), trajFileName);
      fileCounter ++;
     }
     System.out.println(String.format("TOTAL:  % 3.02f\n", totalRunTime));
  }

  void estSplineRunTime (int pointCount, String fName) {
    double runtime = config.dt * pointCount;
    String line = String.format("RUNTIME:% 3.02f %s", runtime, fName);
    totalRunTime += runtime;
    System.out.println(line);
  }

  abstract void generate();
}
