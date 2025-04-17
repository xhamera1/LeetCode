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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int val1 = 0;
        int val2 = 0;

        int sumStart = l1.val + l2.val + carry;
        carry = sumStart / 10;
        ListNode newListNodeStart = new ListNode(sumStart%10);
        if (l1 != null) {
            l1 = l1.next;
        }
        if (l2 != null) {
            l2 = l2.next;
        }

        ListNode currentListNode = newListNodeStart;
        while(true) {
            if (l1 == null && l2 == null) {
                break;
            }
            if (l1 == null) {
                val1 = 0;
            }
            else {
                val1 = l1.val;
            }

            if (l2 == null) {
                val2 = 0;
            }
            else {
                val2 = l2.val;
            }

            int sum = val1 + val2 + carry;
            carry = sum / 10;

            ListNode newListNode = new ListNode(sum%10);
            currentListNode.next = newListNode;
            currentListNode = newListNode;


            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

        
        }

        if (carry == 1) {
            ListNode ln = new ListNode(1);
            currentListNode.next = ln;
        }

        return newListNodeStart;
    }
}