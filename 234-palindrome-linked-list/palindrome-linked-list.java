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
    private static ListNode midNode(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast = head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    } 
    private static ListNode reverseLL(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode curr=head;
        ListNode ford=null;
        while(curr!=null){
            ford=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ford;
        }
        return prev;
    
    }
    public boolean isPalindrome(ListNode head) {
         if(head==null||head.next==null){
            return true;
        }
        ListNode mid = midNode(head);
        ListNode nhead=mid.next;
        mid.next=null;
        nhead=reverseLL(nhead);
        ListNode c1= head;
        ListNode c2=nhead;
        boolean res=true;
        while(c2!=null){
            if(c1.val!=c2.val){
                res=false;
                break;
            }
            c1=c1.next;
            c2=c2.next;
        }
        nhead=reverseLL(nhead);
        mid.next=nhead;
        return res;
    }
}