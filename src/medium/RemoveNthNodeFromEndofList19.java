package medium;

public class RemoveNthNodeFromEndofList19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode start = head;
        while (start != null) {
            count++;
            start = start.next;
        }
        if (count == n)
            return head.next;
        int nav = count - n;
        int i = 1;
        start = head;
        while (i < nav) {
            start = start.next;
            i++;
        }
        start.next = start.next.next;
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}