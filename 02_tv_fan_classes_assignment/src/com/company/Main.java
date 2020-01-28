package com.company;

import com.sun.source.tree.TryTree;

class TV{
       /*
    Class TV has attributes & methods by default:
    ATTRIBUTES
    ----------
    1. CHANNELS: 1 (int)
    2. VOLUME: 5 (int)
    3. ON: (boolean)

    METHODS
    -------
    1. toString (Override): String
    2. turnOn: void
    3. turnOff: void
    4. setChannel: void
    5. setVolume: void
    6. channelUp: void
    7. channelDown: void
    8. volumeUp: void
    9. volumDown: void
     */

    // ATTRIBUTES
    public int CHANNELS = 1;       // 1-120 Channels
    public int VOLUME = 1;         // Volume level upto 1-7
    public boolean ON;             // Indicate that either TV is ON/OFF

    // METHIODS
    @Override
    public String toString(){
        return  "==============================" + "\n" +
                "State:   "   + this.ON          + "\n" +
                "Channel: "   + this.CHANNELS    + "\n" +
                "Volume:  "   + this.VOLUME      + "\n";
    }

    public void turnOn(){
        /*
        To let the TV on
        Parameter
        ---------
        None

        Return
        ------
        None
         */
        this.ON = true;
    }

    public void turnOff(){
        /*
        To let the TV of
        PArameter
        ---------
        None

        Return
        ------
        None
         */
        this.ON = false;
        this.CHANNELS = 0;
        this.VOLUME = 0;
    }

    public void setChannel(int newChannel){
        /*
        To set channel by prescribe exact channel
        Parameter
        ---------
        newChannel: int

        Return
        ------
        None
         */
        if (newChannel >= 1 && newChannel <= 120) {
            this.CHANNELS = newChannel;
        }
        else{
            if (newChannel < 1) {
                System.out.println("Channel is at 1");
            }
            else{
                System.out.println("Channel 120 no more");
            }
        }
    }

    public void setVolume(int newVolumeLevel){
        /*
        To set volume.
        Parameter
        ---------
        newVolumeLevel: int

        Return
        ------
        None
         */
        if (newVolumeLevel >= 1 && newVolumeLevel <= 7) {
            this.VOLUME = newVolumeLevel;
        }
        else{
            if (newVolumeLevel < 1) {
                System.out.println("Mute");
            }
            else{
                System.out.println("Full volume");
            }
        }
    }

    public void channelUp(){
        /*
        To let channel to the next channel.
        Parameters
        ----------
        None

        Return
        ------
        None
         */
        if (this.CHANNELS < 120) {
            this.CHANNELS += 1;
        }
        else{
            System.out.println("Channel 120 no more");
        }
    }

    public void channelDowm(){
        /*
        To let channel to the previous channel.
        Parameters
        ----------
        None

        Return
        ------
        None
         */
        if (this.CHANNELS > 0) {
            this.CHANNELS -= 1;
        }
        else {
            System.out.println("Channel is at 1");
        }
    }

    public void volumeUp(){
        /*
        To let the volume up.
        PArameters
        ----------
        None

        Return
        ------
        None
         */
        if (this.VOLUME < 7){
            this.VOLUME += 1;
        }
        else{
            System.out.println("Full volume");
        }
    }
    public void volumeDown(){
        /*
        To let the volume down.
        Parameters
        ----------
        None

        Return
        ------
        None
         */
        if (this.VOLUME < 7){
            this.VOLUME -= 1;
        }
        else{
            System.out.println("Mute");
        }
    }
}

class Fan{
    /*
     Class Fan has attributes & methods by default:
     ATTRIBUTES
     ----------
     1. State of fan: off
     2. Radius: 5
     3. Color: BLUE
     4. Modes of fan SPEED:
        a. FAST: 3
        b. MEDIUM: 2
        C. SLOW: 1

    METHODS
    -------
    1. toString (Override): String
    2. speed: int
    3. on: boolean
    4. radius: double
    5. color: String
     */


    // ATTRIBUTES
    private boolean ON = false;
    private double RADIUS = 5;
    public String COLOR = "BLUE";

    /// Modes for fan speed
    public final int  SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;

    public int SPEED = SLOW;

    // MOTHODS
    @Override
    public String toString(){
        /* Detail of fan
         Parameteres
         -----------
         None
         Return
         ------
         (print statement) : String
         */
        return  "========================\n" +
                "State:  " + this.ON + "\n" +
                "Radius: " + this.RADIUS + "\n" +
                "Color:  " + this.COLOR + "\n" +
                "Speed:  " + this.SPEED + "\n";
    }

    public int speed(int pace){
        /*
        To specify speed
        Parameter
        ---------
        pace: int

        Return
        ------
        this.SPEED: int
         */
        return this.SPEED = pace;
    }

    public boolean on(){
        /* To switch TV on
        Paramter
        --------
        None

        Return
        ------
        this.ON: boolean
         */
        return this.ON = true;
    }

    public double radius(int radii){
        /* To specify radius
        Parameteres
        -----------
        radii: int

        Return
        ------
        this.RADIUS: double
         */
        return this.RADIUS = radii;
    }

    public String color(String color){
        /* To specify color
        Parameters
        ----------
        color: String

        Return
        ------
        this.COLOR: String
         */
        return this.COLOR = color;
    }
}

public class Main {

    public static void main(String[] args) {
//	    // ///////////////Class TV
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setVolume(7);
        tv1.volumeUp();
        tv1.volumeDown();
        tv1.setChannel(120);
        tv1.channelUp();
        tv1.channelDowm();
        tv1.turnOff();

        System.out.println(tv1.toString());

        // ////////////////Class Fan
        Fan fan1 = new Fan();
        // Print statement
        System.out.println(fan1.toString());

        //Call the methods using fan1 object
        fan1.COLOR = "GREEN";
        fan1.speed(fan1.FAST);
        fan1.on();

        //Print statement
        System.out.println(fan1.toString());
    }
}

