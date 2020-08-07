package com.bk.karma.algorithm;

import groovy.util.logging.Slf4j;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 来自leetcode
 *
 * @Auther dcb
 * @Date 2020/8/1
 * 两数之和
 */
@Slf4j
public class Solution {

    public static void main(String[] args) {
//        int[] nums = {2, 7, 11, 15};
//        int target = 9;
//        System.out.println(twoSum(nums, target)[0]);
//        System.out.println(twoSum(nums, target)[1]);
//        int a[] = twoSum(nums, target);
//
//        int[] newnums = {1, 2, 3, 4};
//        int[] b = runningSum(newnums);
//        for (int i = 0; i < b.length; i++) {
//            System.out.println(b[i]);
//        }
        //
        int[] nums = {1, 2, 3, 1, 1, 3};
        int count = numIdenticalPairs(nums);
        System.out.println(count);
    }

    /**
     * 解题思路
     * 遍历数组中数据目标数据减去该值，如果集合中存在则打印该数组下标
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int nums[], int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int com = target - nums[i];
            if (map.containsKey(com)) {
                return new int[]{map.get(com), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("两数之和错误");
    }

    /**
     * 一维数组的动态和
     *
     * @param nums
     * @return
     */
    public static int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sums[i] = sum;
        }
        return sums;
    }

    /**
     * 好数对的数目
     *
     * @param nums
     * @return
     */
    public static int numIdenticalPairs(int[] nums) {
        if (nums == null && nums.length <= 1) {
            return 0;
        }
        Arrays.sort(nums);
        int res = 0;
        int i = 1;
        while (i <= nums.length - 1) {
            int count = 0;
            while (nums[i] == nums[i - 1]) {
                count++;
                i++;
                if (i == nums.length)
                    break;
            }
            //高斯求和公式
            res += ((count + 1) * count) / 2;
            i++;
        }
        return res;
    }
}
