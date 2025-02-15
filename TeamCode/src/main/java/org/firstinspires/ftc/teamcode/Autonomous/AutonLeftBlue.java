package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "AutonLeftBlue", group = "LinearOpMode")
public class AutonLeftBlue extends LinearOpMode{
    ShaanAutonomousMethods s = new ShaanAutonomousMethods();
    public void runOpMode() throws InterruptedException {
        //duck delivery; front facing red side; hugging border
        // of robot placed on right side of (0,3)
        s.forward(60);
        s.LeftTurn(90);
        //turn carousel servo
        s.backward(24);
        //parked inside storage unit
        s.forward(6);
        s.strafeRight(35);
        //deliver preload


    }
}
