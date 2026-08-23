/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int k = listLength(head) - n;
        ListNode curr = head;
        ListNode prev = null;

        while (k > 0 && curr != null) {
            prev = curr;
            curr = curr.next;
            k--;
        }

        if (listLength(head) <= 1) return null;

        prev.next = curr.next;
        return head;

    }

    private int listLength(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }

        return count;
    }
}
