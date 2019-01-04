package org.wlrobotics.splinegenerator;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Trajectory;
import jaci.pathfinder.Waypoint;
import static java.lang.System.*;
import java.io.IOException;

class SplineWriter extends Object {
  String baseFileName = "gnuPlotCommands.txt";

  void writePlotCommand(String cmd){
    try {
      //File cmdFile = new File (baseFileName);
      BufferedWriter writer = new BufferedWriter(new FileWriter(baseFileName, true));
      writer.append(cmd + "\n");
      writer.close();
    }
    catch(IOException ex) {
      System.out.println(String.format("Could not write to file %s", baseFileName));
    }
  }

  void writeTrajectory (Trajectory trajectory, File trajFile){
  	Pathfinder.writeToCSV(trajFile, trajectory);
  }
}
