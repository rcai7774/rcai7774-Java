package dupe;
import java.util.*;
public class Triples {
    public static void main(String[] args){
        int[] nums = {1,1,1,2,2,2,3,3,3,4,4,4,5};
        System.out.println(Triples.findSingle(nums));
    } 
    public static int findSingle(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int answer = 0;
        for(int i = 0; i < nums.length; i++){
            if(list.get(nums[i])!= null){
                list.set(nums[i], list.get(nums[i]++));
            } else{
                list.add(nums[i], 1);
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(list.get(nums[i]) == 1){
                answer = nums[i];
            }
        }
        return answer;
    }
}
