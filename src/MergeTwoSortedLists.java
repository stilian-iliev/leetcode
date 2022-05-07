public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode p = head;
        while (list1 != null || list2 != null) {
            if (list1 == null){
                p.next = new ListNode(list2.val);
                list2 = list2.next;
            } else if(list2 == null) {
                p.next = new ListNode(list1.val);
                list1 = list1.next;
            } else if (list1.val <= list2.val){
                p.next = new ListNode(list1.val, new ListNode(list2.val));
                list1 = list1.next;
            } else {
                p.next = new ListNode(list2.val, new ListNode(list1.val));
                list2 = list2.next;
            }
            p = p.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        mergeTwoLists(list1, list2);
    }
}
