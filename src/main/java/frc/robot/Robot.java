/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {
    private final MechanumDrive drive = new MechanumDrive();

    public static Robot newRobot() {
        return new Robot();
    }

    @Override
    public void robotInit() {
        System.out.println("Robot initialization");
    }

    @Override
    public void robotPeriodic() {
    }

    @Override
    public void autonomousInit() {
        System.out.println("Auton initialization");
    }

    @Override
    public void autonomousPeriodic() {
    }

    @Override
    public void teleopInit() {
        System.out.println("Teleop initialization");
    }

    @Override
    public void teleopPeriodic() {
    }
}