package org.team2399.robot.subsystems;

import com.ctre.CANTalon;

public class DriveTrainSide {

	private final CANTalon motor;
	private final int forward;
	
	public DriveTrainSide(int motorID, int fwd) {
		motor = new CANTalon(motorID);
		forward = fwd;
	}
	
	public void drivePercent(double percent) {
		motor.set(percent * forward);
	}
	
}
