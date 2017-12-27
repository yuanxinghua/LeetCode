package array;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by xinyuan on 2017/6/22.
 */
public class SimpleArrayProblem {

    /**第一个问题：TwoSum
     * 数组中有两组满足条件的数时，两种方法结果会不同，如numbers为{2,4,5,7,9}，target 为9，
     * twoSumDoubleCycle 返回 1,4
     * twoSumHashMap 返回 2,3
     * */
    /**TwoSum解法1*/
    public int[] twoSumDoubleCycle(int[] numbers, int target){
        if(numbers == null){
            return null;
        }

        int[] result = new int[]{0,0};
        label:for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[i] + numbers[j] == target){
                    result[0] = i + 1;
                    result[1] = j + 1;
                    break label;
                }
            }
        }
        System.out.println(result[0]);
        System.out.println(result[1]);
        return result;
    }
    /**TwoSum解法2*/
    public int[] twoSumHashMap(int[] numbers, int target){
        if(numbers == null){
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            if(map.containsKey(target - numbers[i])){
                System.out.println(map.get(target - numbers[i]));
                System.out.println(i + 1);
                return new int[]{map.get(target - numbers[i]), i + 1};

            }else {
                map.put(numbers[i], i + 1);  //数组中有重复元素则会被覆盖
            }
        }
        return null;

    }
    /**mergeTwoSortedArray_1: merge后的存入新的数组中*/
    public static int[] mergeTwoSortedArray_1(int nums1[], int nums2[]){
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] nums3 = new int[len1 + len2];
        int i = 0, j = 0, k = 0;
        while (i < len1 && j < len2){
//            if(nums1[i] < nums2[j]){
//                nums3[k++] = nums1[i];
//                i++;
//            }else {
//                nums3[k++] = nums2[j];
//                j++;
//            }
            nums3[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        }
        if(i == len1){
            while (j < len2){
                nums3[k++] = nums2[j++];
            }
        }
        if(j == len2){
            while (i < len1){
                nums3[k++] = nums1[i++];
            }
        }
        return nums3;
    }

    /**remove zeros*/
    /**mergeTwoSortedArray*/
    /**有序数组中插入元素使数组保持有序*/

    public static void printArray(int[] nums){
        for(int num: nums){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
//        int[] numbers = new int[]{2,3,5,7,9};
//        int target = 9;
//        (new SimpleArrayProblem()).twoSumDoubleCycle(numbers, target);
//        (new SimpleArrayProblem()).twoSumHashMap(numbers, target);
        int[] nums1 = new int[]{1,2,5};
        int[] nums2 = new int[]{2,4};
        int[] nums3 = mergeTwoSortedArray_1(nums1, nums2);
        printArray(nums3);
    }
}
