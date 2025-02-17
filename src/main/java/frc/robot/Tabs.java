package frc.robot;

import edu.wpi.first.networktables.GenericEntry;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;

//We're going to try to use Shuffleboard tabs for testing in order to keep the main tab more organized
//  For each Subsystem, we have a tab and GenericEntry for every value we want to read/set
//  We then have a display function to just display it to shuffleboard
//  We also have a get function that reads the value from shuffleboard to give the subsystem in a command
public final class Tabs {
    public static final ShuffleboardTab Test = Shuffleboard.getTab("Test");
    public static class Arm{
        public static final ShuffleboardTab tab = Shuffleboard.getTab("Arm");

        private static GenericEntry extendSpeed = tab.add("Arm Speed", 0).getEntry();

        private static GenericEntry setExtendNU = tab.add("Extend NU", 0).getEntry();
        private static GenericEntry setExtendM = tab.add("Extend Meters", 0).getEntry();
        private static GenericEntry dispExtendNU = tab.add("Actual Extend NU", 0).getEntry();
        private static GenericEntry dispExtendM = tab.add("Actual Extend Meters", 0).getEntry();
        private static GenericEntry extendStator = tab.add("Extend Stator", -1).getEntry();
        private static GenericEntry extendSupply = tab.add("Extend Supply", -1).getEntry();

        private static GenericEntry pivotNU = tab.add("Pivot NU", 0).getEntry();
        private static GenericEntry pivotRad = tab.add("Pivot Angle", 0).getEntry();
        private static GenericEntry pivotStator = tab.add("Pivot Stator", -1).getEntry();
        private static GenericEntry pivotSupply = tab.add("Pivot Supply", -1).getEntry();

        public static void displayExtendNU(double NU){
            dispExtendNU.setDouble(NU);
        }
        public static void displayExtendM(double m){
            dispExtendM.setDouble(m);
        }
        public static void displayExtendSpeed(double speed){
            extendSpeed.setDouble(speed);
        }
        public static void displayExtendCurrent(double stator, double supply){
            extendStator.setDouble(stator);
            extendSupply.setDouble(supply);
        }
        public static void displayPivotNU(double NU){
            pivotNU.setDouble(NU);
        }
        public static void displayPivotAngle(double angle){
            pivotRad.setDouble(angle);
        }
        public static void displayPivotCurrent(double stator, double supply){
            pivotStator.setDouble(stator);
            pivotSupply.setDouble(supply);
        }

        public static double getExtendNU(){
            return setExtendNU.getDouble(0);
        }
        public static double getExtendM(){
            return setExtendM.getDouble(0);
        }
        public static double getPivotNU(){
            return pivotNU.getDouble(0);
        }
        public static double getPivotAngle(){
            return pivotRad.getDouble(0);
        }
    }
    
    public static class Grabber{
        public static final ShuffleboardTab tab = Shuffleboard.getTab("Grabber");

        private static GenericEntry topRollerSpeed = tab.add("Top Roller Speed", 0).getEntry();
        private static GenericEntry topRollerStator = tab.add("Top Roller Stator", 0).getEntry();
        private static GenericEntry bottomRollerSpeed = tab.add("Top Roller Speed", -1).getEntry();
        private static GenericEntry bottomRollerStator = tab.add("Top Roller Stator", -1).getEntry();

        private static GenericEntry setOrienterNU = tab.add("Wrist NU", 0).getEntry();
        private static GenericEntry setOrienterRad = tab.add("Wrist Angle", 0).getEntry();
        private static GenericEntry orienterStator = tab.add("Wrist Stator", -1).getEntry();
        private static GenericEntry dispOrienterNU = tab.add("Actual Wrist NU", 0).getEntry();
        private static GenericEntry dispOrienterRad = tab.add("Actual Wrist Angle", 0).getEntry();


        public static void displayTopStator(double stator){
            topRollerStator.setDouble(stator);
        }
        public static void displayBotStator(double stator){
            bottomRollerStator.setDouble(stator);
        }
        public static void displayOrientStator(double stator){
            orienterStator.setDouble(stator);
        }
        public static void displayOrienterNU(double NU){
            dispOrienterNU.setDouble(NU);
        }
        public static void displayOrienterAngle(double angle){
            dispOrienterRad.setDouble(angle);
        }

        public static double getTopSpeed(){
            return topRollerSpeed.getDouble(0);
        }
        public static double getBotSpeed(){
            return bottomRollerSpeed.getDouble(0);
        }
        public static double getOrienterNU(){
            return setOrienterNU.getDouble(0);
        }
        public static double getOrienterRad(){
            return setOrienterRad.getDouble(0);
        }
    }
}
