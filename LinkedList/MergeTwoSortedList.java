/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
         if(head1 == null) return head2;
        if(head2 == null) return head1;

        ListNode m ;
        ListNode temp ;

  

      if (head1.val <= head2.val){
        m=head1;
        head1=head1.next;
      }else{
        m = head2;
        head2 = head2.next;
      }
        
      temp = m;
        
      while(head1 != null && head2 != null)
        {
          if(head1.val<=head2.val)
            {
              temp.next=head1;
              temp=temp.next;
              head1 = head1.next;
            }
          else
            {
              temp.next=head2;
              temp = temp.next;
              head2 = head2.next;
            }
        }
        
      if(head1 != null)
          temp.next=head1;
      else
          temp.next=head2;
     
        
        return m;
    }
}
