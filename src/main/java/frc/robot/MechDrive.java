/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.kauailabs.navx.frc.AHRS;

public class MechDrive {

    private TalonSRX motor1;
    private TalonSRX motor2;
    private TalonSRX motor3;
    private TalonSRX motor4;

    public MechDrive(int port1, int port2, int port3, int port4) {
        motor1 = new TalonSRX(port1);
        motor2 = new TalonSRX(port2);
        motor3 = new TalonSRX(port3);
        motor4 = new TalonSRX(port4);
    }

    public void stop() {
        motor1.set(ControlMode.PercentOutput, 0);
        motor2.set(ControlMode.PercentOutput, 0);
        motor3.set(ControlMode.PercentOutput, 0);
        motor4.set(ControlMode.PercentOutput, 0);
    }
}