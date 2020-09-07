package ch_01;

public class Q_11 {
    public static void main(String[] args){
        double currentPopulation = 312032486.0;
        int daysToSeconds = 365 * 24 * 60 * 60;
        for(int i = 1; i <6; i++){
           currentPopulation += daysToSeconds/7 - daysToSeconds / 13 + daysToSeconds / 45;
           System.out.println("Year " + i + " population is "+ currentPopulation);
        }
    }
}
