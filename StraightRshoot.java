package org.firstinspires.ftc.robotcontroller.internal;

import android.app.DownloadManager;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.I2cAddr;
@Autonomous(name="StRShoot")
public class StraightRshoot extends LinearOpMode {
    DcMotor frontLeft;
    DcMotor frontRight;
    DcMotor backLeft;
    DcMotor backRight;
    DcMotor LaunchL;
    DcMotor LaunchR;
    DcMotor load;
    DcMotor Zip;



    @Override
    public void runOpMode() {
        frontLeft = hardwareMap.dcMotor.get("FrontLeft");
        frontRight = hardwareMap.dcMotor.get("FrontRight");
        backLeft = hardwareMap.dcMotor.get("BackLeft");
        backRight = hardwareMap.dcMotor.get("BackRight");
        load = hardwareMap.dcMotor.get("load");
        LaunchL = hardwareMap.dcMotor.get("LaunchL");
        LaunchR = hardwareMap.dcMotor.get("LaunchR");
        Zip = hardwareMap.dcMotor.get("Zip");
        frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        backLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        frontRight.setDirection(DcMotorSimple.Direction.FORWARD);
        backRight.setDirection(DcMotorSimple.Direction.FORWARD);
        load.setDirection(DcMotorSimple.Direction.FORWARD);
        Zip.setDirection(DcMotorSimple.Direction.REVERSE);
        LaunchR.setDirection(DcMotorSimple.Direction.REVERSE);
        LaunchL.setDirection(DcMotorSimple.Direction.FORWARD);
        frontLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        frontRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        LaunchL.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        LaunchR.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        load.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        Zip.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        LaunchR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        LaunchL.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        load.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Zip.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        while (!isStarted()) ;
        LaunchL.setPower(0);
        LaunchR.setPower(0);
        Zip.setPower(0);
        load.setPower(0);
        frontLeft.setPower(1);
        frontRight.setPower(1);
        backLeft.setPower(1);
        backRight.setPower(1);
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            telemetry.addData("Error", "Failed to Sleep");
        }
        frontLeft.setPower(0);
        frontRight.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
        LaunchL.setPower(1);
        LaunchR.setPower(1);
        load.setPower(0);
        Zip.setPower(0);
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            telemetry.addData("Error", "Failed to Sleep");
        }
        load.setPower(1);
        Zip.setPower(1);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            telemetry.addData("Error", "Failed to Sleep");
        }
        frontLeft.setPower(1);
        frontRight.setPower(1);
        backLeft.setPower(1);
        backRight.setPower(1);
        LaunchL.setPower(0);
        LaunchR.setPower(0);
        load.setPower(0);
        Zip.setPower(0);
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            telemetry.addData("Error", "Failed to Sleep");
        }
    }
}