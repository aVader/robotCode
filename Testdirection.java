package org.firstinspires.ftc.robotcontroller.internal;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.I2cAddr;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.ColorSensor;


@TeleOp(name="", group="freshmen2k16")
public class Testdirection extends OpMode {
    //DcMotors Variables
    private DcMotor FrontLeft;
    private DcMotor FrontRight;
    private DcMotor BackLeft;
    private DcMotor BackRight;
    private DcMotor LaunchL;
    private DcMotor LaunchR;
    private DcMotor load;
    private DcMotor Zip;
    ColorSensor Color;

    @Override
    public void init() {
        //dcMotors setting
        FrontLeft = hardwareMap.dcMotor.get("FrontLeft");
        FrontRight = hardwareMap.dcMotor.get("FrontRight");
        BackLeft = hardwareMap.dcMotor.get("BackLeft");
        BackRight = hardwareMap.dcMotor.get("BackRight");
        LaunchL = hardwareMap.dcMotor.get("LaunchL");
        LaunchR = hardwareMap.dcMotor.get("LaunchR");
        load = hardwareMap.dcMotor.get("load");
        Zip = hardwareMap.dcMotor.get("Zip");
        Color = hardwareMap.colorSensor.get("Color");
        Color.setI2cAddress(I2cAddr.create7bit(0x1f));

        /*BeaconL = hardwareMap.dcMotor.get("BeaconL");
        BeaconR = hardwareMap.dcMotor.get("BeaconR");*/
        //Motor direction setting
        FrontLeft.setDirection(DcMotorSimple.Direction.FORWARD);
        BackLeft.setDirection(DcMotorSimple.Direction.FORWARD);
        FrontRight.setDirection(DcMotorSimple.Direction.REVERSE);
        BackRight.setDirection(DcMotorSimple.Direction.REVERSE);
        LaunchL.setDirection(DcMotorSimple.Direction.FORWARD);
        LaunchR.setDirection(DcMotorSimple.Direction.REVERSE);
        load.setDirection(DcMotorSimple.Direction.FORWARD);
        Zip.setDirection(DcMotorSimple.Direction.REVERSE);
        /*BeaconL.setDirection(DcMotorSimple.Direction.FORWARD);
        BeaconR.setDirection(DcMotorSimple.Direction.REVERSE);*/
        FrontLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        BackLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        FrontRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        BackRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        LaunchR.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        LaunchL.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        load.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        Zip.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        /*BeaconL.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        BeaconR.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);*/
        FrontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        FrontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        BackLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        BackRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        LaunchL.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        LaunchR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        load.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Zip.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        /*BeaconL.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        BeaconR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);*/
        telemetry.addData("Init", "Init Completed");
        Color.enableLed(false);
    }
    @Override
    public void start() {

    }

    @Override
    public void loop () {
    if(gamepad1.a) {
        FrontLeft.setPower(-1);
        BackLeft.setPower(-1);
        FrontRight.setPower(-1);
        BackRight.setPower(-1);

    }
        if(gamepad1.b) {
            FrontLeft.setPower(1);
            BackLeft.setPower(-1);
            FrontRight.setPower(-1);
            BackRight.setPower(1);

        }if(gamepad1.x) {
            FrontLeft.setPower(-1);
            BackLeft.setPower(1);
            FrontRight.setPower(1);
            BackRight.setPower(-1);

        }if(gamepad1.y) {
            FrontLeft.setPower(1);
            BackLeft.setPower(1);
            FrontRight.setPower(1);
            BackRight.setPower(1);

        }
        telemetry.addData("Loop", "Running" );
    }

}