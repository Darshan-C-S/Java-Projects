package leetCodeAndHackerRank;


class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class merjSortedList {

    public ListNode mergeTwoListsRecursive(ListNode l1, ListNode l2) {

        if(l1 == null) return l2;
        if (l2 == null) return l1;

        if(l1.val <l2.val){
            l1.next = mergeTwoListsRecursive(l1.next , l2);
            return l1;
        }else {
            l2.next = mergeTwoListsRecursive(l1 , l2.next);
            return l2;
        }

    }
    public void printList (ListNode node){
        ListNode curr = node;
        while (curr !=null){
            System.out.println(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        merjSortedList merger = new merjSortedList();

       ListNode nodes =  merger.mergeTwoListsRecursive(l1,l2);

        System.out.println("the Merged recurcive List is ");

        merger.printList(nodes);


    }
}
