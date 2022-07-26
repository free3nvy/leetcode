//给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。 
//
// 我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。 
//
// 
// 
//
// 必须在不使用库的sort函数的情况下解决这个问题。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [2,0,2,1,1,0]
//输出：[0,0,1,1,2,2]
// 
//
// 示例 2： 
//
// 
//输入：nums = [2,0,1]
//输出：[0,1,2]
// 
//
// 
//
// 提示： 
//
// 
// n == nums.length 
// 1 <= n <= 300 
// nums[i] 为 0、1 或 2 
// 
//
// 
//
// 进阶： 
//
// 
// 你可以不使用代码库中的排序函数来解决这道题吗？ 
// 你能想出一个仅使用常数空间的一趟扫描算法吗？ 
// 
// Related Topics 数组 双指针 排序 👍 1342 👎 0



public class SortColors{
    public static void main(String[] args) {
        Solution solution = new SortColors().new Solution();
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void sortColors(int[] nums) {
        // 双指针法的判断条件不同以往
        int p0 = 0;
        for (int i = 0, p2 = nums.length - 1; i <= p2; i++){
            // 放动作！
            while (nums[i] == 2 && i < p2){
                int temp = nums[p2];
                nums[p2] = 2;
                nums[i] = temp;
                --p2;
            }
            if (nums[i] == 0){
                int temp = nums[p0];
                nums[p0] = 0;
                nums[i] = temp;
                ++p0;
            }
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}