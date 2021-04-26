package guava.math;

public class Stats {
    public static double meanOf(double... values){
        double mean = values[0];
        for(int i = 1; i < values.length; i++){
            mean = mean + values[i];
        }
        return mean / values.length;
    }
    public static double minOf(double... values){
        double min = values[0];
        for(int i = 1; i < values.length; i++){
            if(min > values[i]){
                min = values[i];
            }
        }
        return min;
    }
    public static double maxOf(double... values){
        double max = values[0];
        for(int i = 1; i < values.length; i++){
            if(max < values[i]){
                max = values[i];
            }
        }
        return max;
    }
}