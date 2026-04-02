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
    public ListNode partition(ListNode head, int x) {
        ListNode lessXHead = new ListNode();
        ListNode biggerXHead = new ListNode();
        ListNode lessX = lessXHead;
        ListNode biggerX = biggerXHead;
        ListNode current = head;

        while (current != null) {
            if (current.val < x) {
                lessX.next = current;
                lessX = lessX.next;
            } else {
                biggerX.next = current;
                biggerX = biggerX.next;
            }
            current = current.next;
        }

        lessX.next = biggerXHead.next;
        biggerX.next = null;

        return lessXHead.next;
    }
}