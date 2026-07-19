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
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null) return null;

        int cnt = countnodes(head);
        int l = cnt - k + 1;

        ListNode n1 = head;
        ListNode n2 = head;
        
        for(int i = 1; i<k; i++) n1 = n1.next;
        for(int j = 1; j<l; j++) n2 = n2.next;


        int temp = n1.val;
        n1.val = n2.val;
        n2.val = temp;


        return head;
        
    }

    private int countnodes(ListNode node){
        int c = 0;
        while(node != null){
            c++;
            node = node.next;
        }
        return c;
    }
}