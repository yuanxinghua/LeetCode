package array;

/**
 * Created by xinyuan on 2017/7/10.
 */
public class MediumArray {
    public static void main(String[] args){

        int[] nums = new int[]{7,8,1,2,3};
        System.out.print(searchInRotatedSortedArray(nums,8));
//        for(int i = 0; i < nums.length; i++){
//            System.out.println(nums[i]);
//        }
    }
    public static int searchInRotatedSortedArray(int[] nums, int t){
        if(nums == null) return -1;
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == t){
                return mid;
            }
            else if(nums[mid] < t){
                if(nums[mid] < nums[low]){
                    high = mid - 1;
                }else{
                    if(t < nums[low]){
                        low = mid + 1;
                    }else{
                        high = mid - 1;
                    }
                }

            }else{
                if(nums[mid] > nums[low]){
                    low = mid + 1;
                }else{
                    if(t >= nums[low]){
                        high = mid - 1;
                    }else{
                        low = mid + 1;
                    }
                }
            }
        }
        return -1;
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
