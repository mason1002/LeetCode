package TwoSum_1;
/*
     Author:Mason
     2018/1/19 16:18
*/

import org.omg.CORBA.INTERNAL;
import sun.rmi.server.InactiveGroupException;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
/**
 * Brute Force
 */
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] == target - nums[i]) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//
//    }

/**
 * Two-pass Hash Table
 */
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (map.containsKey(complement) && map.get(complement) != i) {
//                return new int[]{i, map.get(complement)};
//            }
//        }

/**
 * One-pass Hash Table
 */
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }


        throw new IllegalArgumentException("No two sum solution");
    }
}


