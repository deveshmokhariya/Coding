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
public class Solution {
    public ListNode detectCycle(ListNode head) {
      ListNode slow = head;
      ListNode fast = head;
      while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            slow = head;
            int index = 0;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
                index++;
            }
            System.out.println("tail connects to node index " + index);
            return slow;
        }
      }
     return null;
    }
}