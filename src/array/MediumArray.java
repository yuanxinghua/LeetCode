package array;

/**
 * Created by xinyuan on 2017/7/10.
 */
public class MediumArray {
    public static void main(String[] args){

        int[] nums = new int[]{1,3};
        nextPermutation(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
    public static void nextPermutation(int[] nums){
        int p = nums.length - 1;
        while (p > 0){
            if(nums[p - 1] < nums[p]){
                break;
            }
            p--;
        }
        p--;
        if(p == -1){
            reverse(nums, 0, nums.length - 1);
            return;
        }
        int j = nums.length - 1;
        while (j > p){
            if(nums[j] > nums[p]){
                swap(nums, j, p);
                reverse(nums, p + 1, nums.length - 1);
                break;
            }
        }

    }
    private static void reverse(int[] nums, int low, int high){
        while (low < high){
            swap(nums, low++, high--);
        }

    }
    private static void swap(int[] nums, int p1, int p2){
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
}
