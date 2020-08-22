/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode a) {
    
    ListNode slow = a;
    ListNode fast = a;
    
    while(fast != null && fast.next != null )
    {
        fast = fast.next.next;
        slow = slow.next;
        if(fast == slow)
            break;
    }
    
    if(fast == null || fast.next == null)
        return null;
    
    slow = a;
    
    while(slow != fast)
    {
        fast = fast.next;
        slow = slow.next;
    }
        
        
    return slow;
        
    }
}
