package org.team2399.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public static class DriveTrainConstants {
		public static final int leftMotorCanID = 1;
		public static final int rightMotorCanID = 2;
		
		public static final int leftMotorFwd = -1;
		public static final int rightMotorFwd = 1;
	}
	
	public static class OIConstants {
		public static final int stick0YFwd = -1;
		public static final int stick1YFwd = -1;
	}
}
