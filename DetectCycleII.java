/**
142. Linked List Cycle II
Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.

Note: Do not modify the linked list.

 

Example 1:

Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.
**/


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class DetectCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = null;
        if(head == null){
            return head;
        }
        while(fast != null &&  fast.next != null){
            temp = head;
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){ 
                while(slow != temp){
                    slow = slow.next;
                    temp = temp.next;
                }
                return temp;
            }
        }
        return null;
    }
}