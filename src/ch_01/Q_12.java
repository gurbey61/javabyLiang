package ch_01;

public class Q_12 {
    public static void main(String[] args){
        double distanceInMiles = 24;
        double timeInHours = ((60.0 * 60.0) + 40.0 * 60.0 + 35.0) / 3600.0;
        System.out.println("This trip took " + timeInHours + " hours");
        averageSpeed(distanceInMiles, timeInHours);
    }

    private static void averageSpeed(double distanceInMiles, double time) {
        double distanceInKM = distanceInMiles * 1.6 ;
        double averageSpeed = distanceInKM / time ;
        System.out.println("The average speed in Km/hour is " + averageSpeed);
    }
}
