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
    public boolean hasCycle(ListNode head) {
        ListNode slwPtr = head;
        ListNode fastPtr = head;

        while (slwPtr != null && fastPtr.next != null) {
            slwPtr = slwPtr.next;
            fastPtr = fastPtr.next.next;
            if (slwPtr == fastPtr) return true;
        }
        return false;
        
    }
}
