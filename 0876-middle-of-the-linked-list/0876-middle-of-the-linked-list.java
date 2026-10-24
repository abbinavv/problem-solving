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
    public ListNode middleNode(ListNode head) {
        if(head==null){
            return null;
        }
        int count =0;
        ListNode curr;
        for(curr=head;curr!=null;curr=curr.next){
            count++;
        }
        curr=head;
        for(int i =0;i<count/2;i++){
            curr=curr.next;
        }
        return curr;
    }
}