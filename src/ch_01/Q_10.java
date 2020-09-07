package ch_01;

public class Q_10 {
    public static void main(String[] args){
        double distanceInKM = 14;
        double timeInHours = ((45.0 * 60.0) + 30.0) / 3600.0;
        System.out.println("This trip took " + timeInHours + " hours");
        averageSpeed(distanceInKM, timeInHours);
    }

    private static void averageSpeed(double distanceInKM, double time) {
        double distanceInMiles = distanceInKM / 1.6 ;
        double averageSpeed = distanceInMiles / time ;
        System.out.println("The average speed in miles/hour is " + averageSpeed);
    }
}
