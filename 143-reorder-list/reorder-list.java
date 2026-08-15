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
    private  static ListNode midofLL(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast =head;
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    } 
    private static ListNode reverseofLL(ListNode head){
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
    public void reorderList(ListNode head) {
        ListNode mid =midofLL(head);
        ListNode nhead=mid.next;
        mid.next=null;
        nhead = reverseofLL(nhead);
        
        ListNode c1 = head;
        ListNode c2=nhead;
        ListNode f1=null;
        ListNode f2=null;
        while(c2!=null){
            f1=c1.next;
            f2=c2.next;

            c1.next=c2;
            c2.next=f1;

            c1=f1;
            c2=f2;
        }
    }
}