package org.team2399.robot;

import org.team2399.command.Command;
import org.team2399.robot.commands.TankDrive;
import org.team2399.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;

import static org.team2399.robot.RobotMap.OIConstants;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	private final Joystick stick0;
	private final Joystick stick1;
	
	public OI() {
		stick0 = new Joystick(0);
		stick1 = new Joystick(1);
	}
	
	public Command defaultDrive(DriveTrain dt) {
		return new TankDrive(() -> (OIConstants.stick0YFwd * stick0.getAxis(Joystick.AxisType.kY)), 
							 () -> (OIConstants.stick1YFwd * stick1.getAxis(Joystick.AxisType.kY)),
							 dt);
	}
}
