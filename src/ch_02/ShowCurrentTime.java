package ch_02;

public class ShowCurrentTime {
    public static void main(String[] args){
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliSeconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliSeconds / 1000; // Milli Seconds to seconds

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

        // Display The Current Time
        System.out.println("The current time is " + currentHour + ":"
                + currentMinute + ":" + currentSecond + " GMT");
    }


}
