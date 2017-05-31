package org.team2399.robot.subsystems;

import org.team2399.command.Subsystem;
import static org.team2399.robot.RobotMap.DriveTrainConstants;

/**
 *
 */
public class DriveTrain extends Subsystem {
	
	private final DriveTrainSide dtLeft;
	private final DriveTrainSide dtRight;

    public DriveTrain() {
    	dtLeft = new DriveTrainSide(DriveTrainConstants.leftMotorCanID, DriveTrainConstants.leftMotorFwd);
    	dtRight = new DriveTrainSide(DriveTrainConstants.rightMotorCanID, DriveTrainConstants.rightMotorFwd);
    }
    
    public void drivePercentLeft(double percent)
    {
    	dtLeft.drivePercent(percent);
    }
    
    public void drivePercentRight(double percent)
    {
    	dtRight.drivePercent(percent);
    }
}

