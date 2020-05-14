/**
160. Intersection of Two Linked Lists
Write a program to find the node at which the intersection of two singly linked lists begins.

For example, the following two linked lists:
*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        
        while(curA != curB){

            if(curA == null){
                curA = headA;
            }else{
                curA = curA.next;
            }
            if(curB == null){
                curB = headB;
            }
            else{
                curB = curB.next;
            }
        }
        return curA;
    }
}