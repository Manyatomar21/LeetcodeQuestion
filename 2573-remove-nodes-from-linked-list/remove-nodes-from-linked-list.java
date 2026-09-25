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
    public ListNode removeNodes(ListNode head) {
        ListNode before= null;
        ListNode actual= head;
        while(actual!=null){
            ListNode nextNode= actual.next;
            actual.next= before;
            before= actual;
            actual= nextNode;
        }
        head= before;
        int max=0;
        actual= head;
        ListNode beforeNode= null;
        while(actual!=null){
            if(actual.val>=max){
                max= actual.val;
                beforeNode= actual;
            } else{
                beforeNode.next= actual.next;
            }
            actual= actual.next;
        }
        before= null;
        actual= head;
        while(actual!=null){
            ListNode nextNode= actual.next;
            actual.next= before;
            before= actual;
            actual= nextNode;
        }
        return before;
    }
}