////////////给你一个字符串 s，找到 s 中最长的回文子串。 
////////////
//////////// 
////////////
//////////// 示例 1： 
////////////
//////////// 
////////////输入：s = "babad"
////////////输出："bab"
////////////解释："aba" 同样是符合题意的答案。
//////////// 
////////////
//////////// 示例 2： 
////////////
//////////// 
////////////输入：s = "cbbd"
////////////输出："bb"
//////////// 
////////////
//////////// 
////////////
//////////// 提示： 
////////////
//////////// 
//////////// 1 <= s.length <= 1000 
//////////// s 仅由数字和英文字母组成 
//////////// 
//////////// Related Topics 字符串 动态规划 👍 5383 👎 0
//////////
////////
//////
////
//



public class LongestPalindromicSubstring{
    public static void main(String[] args) {
        Solution solution = new LongestPalindromicSubstring().new Solution();
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution1 {
    public String longestPalindrome(String s) {
        // 如果空的话 则输出空
        if (s == null || s.length() == 0) {
            return "";
        }
//         保存起始位置，测试了用数组似乎能比全局变量稍快一点
        int[] range = new int[2];
        // 转换成字符数组
        char[] str = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
//             把回文看成中间的部分全是同一字符，左右部分相对称
//             找到下一个与当前字符不同的字符
            i = findLongest(str, i, range);
        }
        return s.substring(range[0], range[1] + 1);
    }

    public int findLongest(char[] str, int low, int[] range) {
//         查找中间部分
        int high = low;
        // 如果
        while (high < str.length - 1 && str[high + 1] == str[low]) {
            high++;
        }
//         定位中间部分的最后一个字符
        int ans = high;
//         从中间向左右扩散 非边界判断 左右扩散判断同
        while (low > 0 && high < str.length - 1 && str[low - 1] == str[high + 1]) {
            low--;
            high++;
        }
//         记录最大长度 如果说前面的记录距离后面的记录距离小 则update
        if (high - low > range[1] - range[0]) {
            range[0] = low;
            range[1] = high;
        }
        return ans;
    }
}

class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
//         保存起始位置，测试了用数组似乎能比全局变量稍快一点
        int[] range = new int[2];
        // 转换成字符数组
        char[] str = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
//             把回文看成中间的部分全是同一字符，左右部分相对称
//             找到下一个与当前字符不同的字符
            i = findLongest(str, i, range);
        }
        return s.substring(range[0], range[1] + 1);
    }

    public int findLongest(char[] str, int low, int[] range) {
//         查找中间部分
        int high = low;
        // 如果
        while (high < str.length - 1 && str[high + 1] == str[low]) {
            high++;
        }
//         定位中间部分的最后一个字符
        int ans = high;
//         从中间向左右扩散 非边界判断 左右扩散判断同
        while (low > 0 && high < str.length - 1 && str[low - 1] == str[high + 1]) {
            low--;
            high++;
        }
//         记录最大长度 如果说前面的记录距离后面的记录距离小 则update
        if (high - low > range[1] - range[0]) {
            range[0] = low;
            range[1] = high;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}