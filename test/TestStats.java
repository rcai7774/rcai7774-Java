package test;
import guava.math.Stats;

public class TestStats {
    public static void main(String [] args){
        double m1 = 0;
        double m2 = 0;
        m1 = Stats.meanOf(1,2, 3);
        System.out.println(m1);
        m2 = Stats.minOf(1,2,3,4,5,6,7,8,9,0);
        System.out.println(m2);
    }
}
