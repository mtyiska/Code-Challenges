/**
21. Merge Two Sorted Lists
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
*/

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
class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode mergedList = new ListNode();
        ListNode head = mergedList;
        if(l1 == null){
            return l2;
        }
        if(l2 == null)
            return l1;
        
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                mergedList.next = l1;
                l1 = l1.next;
                
            }else{
                mergedList.next = l2;
                l2 = l2.next;
            }
            mergedList = mergedList.next;
        }
        if(l1 != null)
            mergedList.next = l1;
        if(l2 != null)
            mergedList.next = l2;
        
        return head.next;
    }
}