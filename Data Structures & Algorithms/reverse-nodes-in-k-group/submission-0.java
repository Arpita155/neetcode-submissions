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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }
        
        // Dummy node to handle head changes and simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode groupPrev = dummy;
        
        while (true) {
            // 1. Locate the k-th node of the current group
            ListNode kth = getKthNode(groupPrev, k);
            if (kth == null) {
                break; // Fewer than k nodes remaining, leave them as they are
            }
            
            // 2. Keep track of the starting node of the next group
            ListNode groupNext = kth.next;
            
            // 3. Reverse the current group of k nodes
            ListNode prev = kth.next; // Connect the tail of reversed group to groupNext
            ListNode curr = groupPrev.next;
            
            while (curr != groupNext) {
                ListNode tmp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = tmp;
            }
            
            // 4. Update connections for the surrounding segments
            ListNode tmp = groupPrev.next; // The original head of the group becomes the new tail
            groupPrev.next = kth;          // Connect previous segment to the new head
            groupPrev = tmp;               // Move groupPrev to the tail of the reversed group
        }
        
        return dummy.next;
    }
    
    // Helper function to find the k-th node ahead
    private ListNode getKthNode(ListNode start, int k) {
        while (start != null && k > 0) {
            start = start.next;
            k--;
        }
        return start;
    }
}
