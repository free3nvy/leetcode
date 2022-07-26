//给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。 
//
// 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。 
//
// 
//
// 示例 1: 
//
// 
//输入: [3,2,1,5,6,4] 和 k = 2
//输出: 5
// 
//
// 示例 2: 
//
// 
//输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
//输出: 4 
//
// 
//
// 提示： 
//
// 
// 1 <= k <= nums.length <= 10⁴ 
// -10⁴ <= nums[i] <= 10⁴ 
// 
// Related Topics 数组 分治 快速选择 排序 堆（优先队列） 👍 1740 👎 0



public class KthLargestElementInAnArray{
    public static void main(String[] args) {
        Solution solution = new KthLargestElementInAnArray().new Solution();
        int[] nums = new int[]{3,2,3,1,2,4,5,5,6};
        solution.findKthLargest(nums, 4);
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // 堆的大小
        int heapSize = nums.length;
        // 从底部往前面进行遍历！
        buildMaxHeap(nums, heapSize);

        // 这下面是个啥循环？
        for (int i = nums.length - 1; i >= nums.length - k + 1; --i) {
            swap(nums, 0, i);
            --heapSize;
            maxHeapify(nums, 0, heapSize);
        }
        return nums[0];

    }

    private void buildMaxHeap(int[] nums, int heapSize) {
        // 建立堆排序！
        for (int i = heapSize / 2; i >= 0; i--){
            maxHeapify(nums, i, heapSize);
        }

    }

    private void maxHeapify(int[] nums, int i, int heapSize) {
        // 建立每一层的大根堆
        int l = i * 2 + 1, r = i * 2 + 2, largest = i;
        // 进行判断子节点是否大于父节点
        if (l < heapSize && nums[l] > nums[largest]){
            largest = l;
        }
        if (r < heapSize && nums[r] > nums[largest]){
            largest = r;
        }
        // 如果发生变更 进行堆更新
        if (largest != i){
            swap(nums, i, largest);
            // 你已经发生交换了
            maxHeapify(nums, largest, heapSize);
        }

    }

    private void swap(int[] nums, int i, int largest) {
        int temp = nums[i];
        nums[i] = nums[largest];
        nums[largest] = temp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}