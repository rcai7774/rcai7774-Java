package test;
import guava.math.Stats;

public class TestStats {
    public static void main(String [] args){
        double m1 = 0, m2 = 0, m3 = 0;
        m1 = Stats.meanOf(1,2, 3);
        System.out.println(m1);
        m2 = Stats.minOf(1,2,3,4,5,6,7,8,9,0);
        System.out.println(m2);
        m3 = Stats.maxOf(1,2,3,4,9,5,6,7,8,0);
        System.out.println(m3);
    }
}
