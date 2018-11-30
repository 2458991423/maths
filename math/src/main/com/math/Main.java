package main.com.math;

public class Main {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) {
            return null;
        }
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        ListNode head = new ListNode(0);
        ListNode sums = head;
        while (l1 != null && l2 != null) {
            int var = l1.val + l2.val;
            //本位
            int x = var % 10;
            //进位
            int y = var / 10;
            sums.val = x;
            if(y > 0) {
                ListNode temp = new ListNode(y);
                sums = sums.next = temp;

            }else {
                sums = sums.next = new ListNode(0);
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return head;
    }
}
