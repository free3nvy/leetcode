//给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 
//输入: s = "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 
//输入: s = "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 5 * 10⁴ 
// s 由英文字母、数字、符号和空格组成 
// 
// Related Topics 哈希表 字符串 滑动窗口 👍 7730 👎 0



public class LongestSubstringWithoutRepeatingCharacters{
  public static void main(String[] args) {
       String a = "abcabc";
       Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
       solution.lengthOfLongestSubstring(a);

//       solution(a);
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        // create 128 -1, windows first , res
        int[] index = new int[128];
        for (int i = 0; i < 128; i++){
            index[i] = -1;
        }
        int start = 0;
        int res = 0;
        int length = s.length();

        for (int i = 0; i < length; i++){
            int ascii = s.charAt(i);

            start = Math.max(start, index[ascii] + 1 );
            res = Math.max(res, i - start + 1);

            index[ascii] = i;

        }
        return res;

        //
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

//    public int lengthOfLongestSubstring(String s) {
//        int[] last = new int[128];
//        for(int i = 0; i < 128; i++) {
//            last[i] = -1;
//        }
//        int n = s.length();
//
//        int res = 0;
//        int start = 0; // 窗口开始位置
//        for(int i = 0; i < n; i++) {
//            int index = s.charAt(i);
//            start = Math.max(start, last[index] + 1);
//            res   = Math.max(res, i - start + 1);
//            last[index] = i;
//        }
//
//        return res;
//    }