package org.team2399.robot.commands;

import java.util.function.DoubleSupplier;

import org.team2399.command.Command;
import org.team2399.robot.subsystems.DriveTrain;

/**
 *
 */
public class TankDrive extends Command {
	
	private final DoubleSupplier leftPercent;
	private final DoubleSupplier rightPercent;
	
	private final DriveTrain driveTrain;

    public TankDrive(DoubleSupplier lt, DoubleSupplier rt, DriveTrain dt) {
        leftPercent = lt;
        rightPercent = rt;
        driveTrain = dt;
        
        requires(driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	driveTrain.drivePercentLeft(leftPercent.getAsDouble());
    	driveTrain.drivePercentRight(rightPercent.getAsDouble());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
