import java.util.Arrays;

public class MaxiMini07 {
    public static void main(String[]args){
        int[] nums = {6,9,-7,-4,2,-9};
        Arrays.sort(nums);
        System.out.println("Minimum =" + nums[0]);
        System.out.println("Maximum =" + nums[nums.length-1]);
    }
}
