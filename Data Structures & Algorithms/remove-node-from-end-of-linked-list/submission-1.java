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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        if(head.next==null && n==1){
            return null;
        }
        ListNode curr = head;
        int c = 0;
        while(curr != null){
            c++;
            curr=curr.next;
        }

        int k = c-n;
        if(k == 0){
            return head.next;
        }
        curr = head;
        for(int i=0;i<c-1;i++){
            if((i+1) == k){
                curr.next=curr.next.next;
                break;
            }
            curr = curr.next;
        }
        

        return head;
    }
}
