
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head, next = null, prev = null;
        int count = 0;

        if (head == null || k == 1) return head;

        ListNode temp = head;
        while (count < k && temp != null) {
            temp = temp.next;
            count++;
        }

        if (count < k) return head;

        curr = head;
        prev = null;
        count = 0;

        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        head.next = reverseKGroup(next, k);

        return prev;
    }
}
