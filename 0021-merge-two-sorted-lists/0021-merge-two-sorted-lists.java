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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        } 
        if (list2 == null) {
            return list1;
        }

        ListNode startNode = null;
        ListNode current1;
        ListNode current2;
        if (list1.val < list2.val) {
            startNode = list1;
            current1 = list1.next;
            current2 = list2;
        }
        else {
            startNode = list2;
            current1 = list1;
            current2 = list2.next;
        }

        ListNode refStartNode = startNode;
        ListNode currentNode = startNode;

        ListNode nextNode = null;
        while (currentNode != null) {
            if (current1 == null && current2 == null) {
                return refStartNode;
            }

            if (current1 == null) {
                currentNode.next = current2;
                return refStartNode;
            }
            else if (current2 == null) {
                currentNode.next = current1;
                return refStartNode;
            }

            if (current1.val < current2.val) {
                currentNode.next = current1;
                currentNode = currentNode.next;
                current1 = current1.next;
            }
            else {
                currentNode.next = current2;
                currentNode = currentNode.next;
                current2 = current2.next;
            }
        }
        return refStartNode;
    }
}