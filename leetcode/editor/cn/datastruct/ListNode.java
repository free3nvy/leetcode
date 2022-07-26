package datastruct;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode link(int[] num){
        ListNode head = new ListNode();
        ListNode cur = head;
        for (int i = 0; i < num.length; i++){
            ListNode a = new ListNode(num[i]);
            cur.next = a;
            cur = cur.next;
        }
        return head.next;
    };


    public void put(int[] a){
        for (int i = 0; i<a.length;i++){
            ListNode Sites = new ListNode(2);
        }
    }

};



