package com.bk.karma.algorithm;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther dcb
 * @Date 2020/8/17
 */
@Slf4j
public class KidsWithCandies {

    public static void main(String[] args) {

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> list = kidsWithCandies(candies, extraCandies);
        System.out.println(JSON.toJSONString(list));
    }

    /**
     * 给你一个数组 candies 和一个整数 extraCandies ，其中 candies[i] 代表第 i 个孩子拥有的糖果数目。
     *
     * 对每一个孩子，检查是否存在一种方案，将额外的 extraCandies 个糖果分配给孩子们之后，此孩子有 最多 的糖果。注意，允许有多个孩子同时拥有 最多 的糖果数目。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 输入：candies = [2,3,5,1,3], extraCandies = 3
     * 输出：[true,true,true,false,true]
     * 解释：
     * 孩子 1 有 2 个糖果，如果他得到所有额外的糖果（3个），那么他总共有 5 个糖果，他将成为拥有最多糖果的孩子。
     * 孩子 2 有 3 个糖果，如果他得到至少 2 个额外糖果，那么他将成为拥有最多糖果的孩子。
     * 孩子 3 有 5 个糖果，他已经是拥有最多糖果的孩子。
     * 孩子 4 有 1 个糖果，即使他得到所有额外的糖果，他也只有 4 个糖果，无法成为拥有糖果最多的孩子。
     * 孩子 5 有 3 个糖果，如果他得到至少 2 个额外糖果，那么他将成为拥有最多糖果的孩子。
     * 示例 2：
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List list = new ArrayList<Boolean>(candies.length);
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int j = 0; j < candies.length; j++) {
            if (candies[j] + extraCandies >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }

    public static List<Boolean> kwc(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>(candies.length);
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int j = 0; j < candies.length; j++) {
            if (candies[j] + extraCandies >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list ;
    }
}
