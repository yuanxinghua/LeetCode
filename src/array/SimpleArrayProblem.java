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

    /**remove zeros*/


    public static void main(String[] args){
        int[] numbers = new int[]{2,3,5,7,9};
        int target = 9;
        (new SimpleArrayProblem()).twoSumDoubleCycle(numbers, target);
        (new SimpleArrayProblem()).twoSumHashMap(numbers, target);


    }
}
