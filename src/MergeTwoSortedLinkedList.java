import java.util.*;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode pointer;
        
        if(l1 == null)
        {
            return l2;
        }
        else if(l2 == null)
        {
            return l1;
        }
        
        if(l1.val <= l2.val)
        {
            pointer = l1;
            l1 = l1.next;
        }
        else
        {
            pointer = l2;
            l2 = l2.next;
        }
        ListNode head = pointer;
        
        
        while(l1 != null || l2 != null)
        {
             if(l1 == null)
            {
                pointer.next = l2;
                return head;
            }
            if(l2 == null)
            {
                pointer.next = l1;
                return head;
            }
           if(l1.val <= l2.val)
           {
               pointer.next = l1;
               pointer = l1;
               l1 = l1.next;
               
           }
            else
            {
                pointer.next = l2;
                pointer = l2;
                l2 = l2.next;
                
            }
           
           
        }
        
         return head;

    }
}