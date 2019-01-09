package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import static frc.robot.RobotMap.*;

public class MechanumDrive {
    private final TalonSRX left1;
    private final TalonSRX left2;
    private final TalonSRX right1;
    private final TalonSRX right2;

    public MechanumDrive() {
        this.left1 = new TalonSRX(LEFT_MOTOR_1);
        this.left2 = new TalonSRX(LEFT_MOTOR_2);
        this.right1 = new TalonSRX(RIGHT_MOTOR_1);
        this.right2 = new TalonSRX(RIGHT_MOTOR_2);
    }

    public void stop() {
        this.left1.set(ControlMode.PercentOutput, 0);
        this.left2.set(ControlMode.PercentOutput, 0);
        this.right1.set(ControlMode.PercentOutput, 0);
        this.right2.set(ControlMode.PercentOutput, 0);
    }
}
