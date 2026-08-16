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
    private static int length(ListNode node){
        ListNode curr=node;
        int len=0;
        while(curr!=null){
            curr=curr.next;
            len++;
        }
        return len;
    }
    static ListNode th=null;
    static ListNode tt=null;
    private static void addFirst(ListNode node){
        if(th==null){
            th=node;
            tt=node;
        }
        else{
            node.next=th;
            th=node;
        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head!=null&&head.next!=null&&k==0){
            return head;
        }
        ListNode oh=null, ot=null;
        int len=length(head);
        ListNode curr=head;
        while(len>=k){
            int tempk=k;
            while(tempk-- >0){
                ListNode ford = curr.next;
                curr.next=null;
                addFirst(curr);
                curr=ford;
            }
            if(oh==null){
                oh=th;
                ot=tt;
            }
            else{
                ot.next=th;
                ot=tt;
            }
            th=null;
            tt=null;
            len-=k;
        }
        ot.next=curr;
        return oh;
    }
}