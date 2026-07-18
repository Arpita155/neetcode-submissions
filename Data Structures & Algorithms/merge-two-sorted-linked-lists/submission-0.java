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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }else if(list2==null){
            return list1;
        }
        ListNode head = null;
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        if(list1.val <= list2.val){
            head = list1;
            curr1 = curr1.next;
        }else{
            head = list2;
            curr2 = curr2.next;
        }

        ListNode curr = head;
        while(curr1!=null && curr2!=null){
            if(curr1.val <= curr2.val){
                curr.next = curr1;
                curr1 = curr1.next;
                curr = curr.next;
            }else{
                curr.next = curr2;
                curr2 = curr2.next;
                curr = curr.next;
            }
        }
        while(curr1 != null){
            curr.next = curr1;
            curr1 = curr1.next;
            curr = curr.next;
        }
        while(curr2!=null){
            curr.next = curr2;
            curr2 = curr2.next;
            curr = curr.next;
        }

        return head;
    }
}