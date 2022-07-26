//给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。 
//
// 你可以按任意顺序返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [2,7,11,15], target = 9
//输出：[0,1]
//解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [3,2,4], target = 6
//输出：[1,2]
// 
//
// 示例 3： 
//
// 
//输入：nums = [3,3], target = 6
//输出：[0,1]
// 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 10⁴ 
// -10⁹ <= nums[i] <= 10⁹ 
// -10⁹ <= target <= 10⁹ 
// 只会存在一个有效答案 
// 
//
// 进阶：你可以想出一个时间复杂度小于 O(n²) 的算法吗？ 
// Related Topics 数组 哈希表 👍 14650 👎 0


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum{

    public static void main(String[] args) {
       Solution solution = new TwoSum().new Solution();
       int[] nums = {9, 11, 55, 70};
       int target = 125;
       int[] out = solution.twoSum(nums, target);
       System.out.println(Arrays.toString(out));


    }


class Solution {
    public int[] twoSum(int[] nums, int target){
        // 做一个返回的列表
        int[] results = new int[2];
        // hashmap
        HashMap<Integer, Integer> Sites = new HashMap<>();
        // 做一个循环检测判断
        // 赋值和运算顺序要搞清
        for (int i = 0; i < nums.length; i++) {
            if(Sites.containsKey(nums[i])){
                results[0] = i;
                results[1] = Sites.get(nums[i]);
                return results;
            }
            Sites.put(target - nums[i], i);
        }
        // return最后的结果
        return results;


        // // 双重循环 循环极限为(n^2-n)/2
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = nums.length - 1; j > i; j --){
        //         if(nums[i]+nums[j] == target){
        //            indexs[0] = i;
        //            indexs[1] = j;
        //            return indexs;
//                 }
//             }
//         }
        }

}
//leetcode submit region end(Prohibit modification and deletion)

}