import java.util.*;
public class Mode {
    public static void main(String[] args){
        int[] nums = {5,5,3,3,3,4,4,4,5,5,5,5,5,5,5,5,5};
        System.out.println(Mode.findMode(nums));
    } 
    public static int findMode(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int comp = nums.length / 2;
        int answer = 0;
        for(int i = 0; i < nums.length; i++){
            int count = map.containsKey(nums[i]) ? map.get(nums[i]) : 0;
            if(map.get(nums[i])!= null){
                map.put(nums[i], count + 1);
            } else{
                map.put(nums[i], 1);
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) >= comp){
                answer = nums[i];
            }
        }
        return answer;
    }
}
