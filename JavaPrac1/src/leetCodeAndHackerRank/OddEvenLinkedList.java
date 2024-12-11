package leetCodeAndHackerRank;

import java.util.List;

public class OddEvenLinkedList {

    public static ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode oddNode = head;
        ListNode evenNode= head.next;
        ListNode evenHead = evenNode; // to store head of even

        while(evenNode!= null && evenNode.next!= null){
            oddNode.next = evenNode.next;
            oddNode = oddNode.next;

            evenNode.next = oddNode.next;
            evenNode = evenNode.next;

        }
        oddNode.next = evenHead;
        return head;


    }
    public static void main(String[] args) {

    }
}
