package dupe;
import java.util.*;
public class Duplicates {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8,9,10,1};
        System.out.println(Duplicates.containsDupes(nums));
    }
    public static boolean containsDupes(int[] nums){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(list.contains(nums[i])){
                return true;
            } else{
                list.add(nums[i]);
            }
        }
        return false;
    }
}
