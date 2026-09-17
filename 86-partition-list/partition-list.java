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
    public ListNode partition(ListNode head, int x) {
        ListNode smaller= new ListNode(0);
        ListNode larger= new ListNode(0);
        ListNode small= smaller;
        ListNode large= larger;
        ListNode initial= head;
        while(initial!=null){
            if(initial.val<x){
                small.next= initial;
                small= small.next;
            } else{
                large.next= initial;
                large= large.next;
            }
            initial= initial.next;
        }
        large.next= null;
    small.next= larger.next;
    return smaller.next;
}
}