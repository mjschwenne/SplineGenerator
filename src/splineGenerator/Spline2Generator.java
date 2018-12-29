//package splineGenerator;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import grpl.pathfinder.Vec2;
//import grpl.pathfinder.path.HermiteCubic;
//import grpl.pathfinder.path.HermiteFactory;
//
//public class Spline2Generator {
//	
//	public static void main(String[] args) {
//		
//		List<HermiteCubic.Waypoint> waypoints = new ArrayList<>();
//			waypoints.add(new HermiteCubic.Waypoint(Vec2.cartesian(0, 0), Vec2.polar(1, 0)));
//			waypoints.add(new HermiteCubic.Waypoint(Vec2.cartesian(1, 1), Vec2.polar(1, 0)));
//		
//		
//		List<HermiteCubic> cubics = HermiteFactory.generateCubic(waypoints);
//		
//	}
//}