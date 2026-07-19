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
    public ListNode modifiedList(int[] nums, ListNode head) {
        int[]freq = new int[100001];
        for(int num : nums)freq[num]++;

        while(freq[head.val] > 0)head = head.next;

        ListNode ith = head, prev = null;

        while(ith!=null){
            if(freq[ith.val] == 0){
                prev = ith;
            } else {
                prev.next = ith.next;
            }
            ith = ith.next;
        }

        return head;
    }
}