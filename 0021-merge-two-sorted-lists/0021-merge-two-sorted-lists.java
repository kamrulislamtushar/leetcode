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
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        ListNode mergedList = null;
        ListNode prevNode = null;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                if (mergedList == null) {
                    mergedList = list1;
                    prevNode = list1;
                } else {
                    prevNode.next = list1;
                    prevNode = prevNode.next;
                }
                list1 = list1.next;
            } else {
                if (mergedList == null) {
                    mergedList = list2;
                    prevNode = list2;
                } else {
                    prevNode.next = list2;
                    prevNode = prevNode.next;
                }
                list2 = list2.next;
            }

        }
        if (list1 != null) {
            prevNode.next = list1;
        }
        if (list2 != null) {
            prevNode.next = list2;
        }
        return mergedList;
    }
}