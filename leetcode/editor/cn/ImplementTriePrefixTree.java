//Trie（发音类似 "try"）或者说 前缀树 是一种树形数据结构，用于高效地存储和检索字符串数据集中的键。这一数据结构有相当多的应用情景，例如自动补完和拼
//写检查。 
//
// 请你实现 Trie 类： 
//
// 
// Trie() 初始化前缀树对象。 
// void insert(String word) 向前缀树中插入字符串 word 。 
// boolean search(String word) 如果字符串 word 在前缀树中，返回 true（即，在检索之前已经插入）；否则，返回 
//false 。 
// boolean startsWith(String prefix) 如果之前已经插入的字符串 word 的前缀之一为 prefix ，返回 true ；否
//则，返回 false 。 
// 
//
// 
//
// 示例： 
//
// 
//输入
//["Trie", "insert", "search", "search", "startsWith", "insert", "search"]
//[[], ["apple"], ["apple"], ["app"], ["app"], ["app"], ["app"]]
//输出
//[null, null, true, false, true, null, true]
//
//解释
//Trie trie = new Trie();
//trie.insert("apple");
//trie.search("apple");   // 返回 True
//trie.search("app");     // 返回 False
//trie.startsWith("app"); // 返回 True
//trie.insert("app");
//trie.search("app");     // 返回 True
// 
//
// 
//
// 提示： 
//
// 
// 1 <= word.length, prefix.length <= 2000 
// word 和 prefix 仅由小写英文字母组成 
// insert、search 和 startsWith 调用次数 总计 不超过 3 * 10⁴ 次 
// 
// Related Topics 设计 字典树 哈希表 字符串 👍 1219 👎 0



public class ImplementTriePrefixTree{
    public static void main(String[] args) {
        Trie solution = new ImplementTriePrefixTree().new Trie();
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Trie {
    private Trie[] children;
    private boolean isEnd;

    public Trie() {
        // 上头声明 下头定义26个类型为trie的数组空间
        // 初始化定义
        // 一个Trie对象下属26个Trie对象 并且包含一个终止boolean
        children = new Trie[26];
        isEnd = false;
    }

    // for example:word = goog
    public void insert(String word) {
        // 如何插入呢？？
        // 指针指向当前对象
        Trie node = this;
        // 写个
        for (int i = 0; i < word.length(); i++) {
            // charAt 返回char g o o g
            char ch = word.charAt(i);
            // index为其差值 get minus do what？
            int index = ch - 'a';
            // 如果下属的children节点没有该节点 则直接新建一个节点
            // 里面并没有val值 如果有下标 则代表存在
            if (node.children[index] == null) {
                node.children[index] = new Trie();
            }
            // 递归！层层往下！
            node = node.children[index];
        }
        // 进行终止符标示
        node.isEnd = true;

    }
    // 返回boolean 判断完全搜索
    public boolean search(String word) {
        Trie node = searchPrefix(word);
        // 和头部匹配有点difference
        // 有终止点 && node并不为空！
        return node != null && node.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        // 下述函数返回一个Trie 节点
        return searchPrefix(prefix) != null;
    }

    // 前缀匹配 私有 返回一个Trie的数据结构 传入一个待匹配的String
    private Trie searchPrefix(String prifix){
        // 指向这个节点
        Trie node = this;
        for (int i = 0; i < prifix.length(); i++){
            char ch = prifix.charAt(i);
            int index = ch - 'a';
            // 如果判断子节点的下标并不存在 直接返回null
            if (node.children[index] == null) {
                return null;
            }
            // 递归进去！
            node = node.children[index];
        }
        // 上述无null 则返回一个node！
        return node;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
//leetcode submit region end(Prohibit modification and deletion)

}