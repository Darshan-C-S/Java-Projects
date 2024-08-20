package DSA;

// Linked list video https://youtu.be/oAja8-Ulz6o?si=lbeHZUYAho5xr31J
// Chat GPT https://chatgpt.com/c/c50826eb-a234-4519-9f01-6c18da8c486c


import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LL {
Node head;
private int size;
  LL(){
    this.size =0;
}

    class Node{
        String data;
        Node next;

        Node(String data ){
            this.data = data;
            this.next = null;
//       Increase the size as node is created
            size++;
        }

    }
//    add operation
//    add first
    public void addFirst(String data){
        Node newNode = new Node(data);
//  Checks if node is empty if its empty it will add the newNode directly to head else
//  If it's not empty the current head value will be given to newNode.next and value of newNode becomes head
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
//    add last
    public void addLast(String data){
        Node newNode = new Node(data);
//        checks for head == null like above
        if(head == null){
            head = newNode;
            return;
        }
/*
* Take a pointer variable which can be used to traverse the list ,initially point it to head to start from first
* Later check if the next node is null if not shift to next node and continue the operation
* until you get null value i.e. when we get last node
* */
        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
//        When we get currentNode.next node as null i..e when we get the last node
//        we will make currentNode.next equals to new node whi
        currentNode.next = newNode;
    }

    public void printList(){

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data +" -> ");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }


//    delete operations
 public void deleteFirst(){
//        to delete the first element just need to point head to head.next and the head value
//        will be removed by garbage collector
        if (head == null){
            System.out.println("List is empty");
            return;
        }
//        decries the size cunt as the node is deleted
        size--;
        head = head.next;
 }

 public  void deleteLast(){
     if (head == null){
         System.out.println("List is empty");
         return;
     }
     size --;
//     Initially check if the head is null if so we print list is empty
//     If we have single head node then we delete it by making it null
     if(head.next == null){
         head = null;
     }
// Create two pointer nodes secondLastNode and lastNode pointing to head and head.next
// travers both the pointer forward until getting lastNode.next == 0
// lastNode.next == 0 means lastNode is having last value and secondLastNode.next is pointing to it
//  make secondLastNode.next null which deletes the value of lastNode and make secondLastNode the new lastNode
     Node secondLastNode = head;
     Node lastNode = head.next;
     while (lastNode.next != null){
         lastNode = lastNode.next;
         secondLastNode = secondLastNode.next;
     }
     secondLastNode.next = null;
 }

 public void reverse(){
      if(head == null || head.next == null){
          return;
      }
      Node previos = null;
      Node current = head;
      Node next = null;

      while(current != null){
          next = current.next;
          current.next = previos;
          previos = current;
          current= next ;
      }
      head = previos;

 }

 public void sort(){
      if(head == null || head.next == null){
          return;
      }

//    Use Array List to store the data in the list
     ArrayList<String> ar = new ArrayList<>();

     Node currentNode = head;
     while(currentNode != null){
         ar.add(currentNode.data);
         currentNode = currentNode.next;
     }

     Collections.sort(ar);
     int index = 0;
     while (currentNode != null) {
         currentNode.data = ar.get(index);
         currentNode = currentNode.next;
         index++;
     }


 }

 public int getSize(){
      return size;
 }

    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst("A");
        list.addFirst("B");
        list.printList();

        list.addLast("Last");
        list.printList();

        list.addFirst("Prime");
        list.printList();

        list.addFirst("This");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        list.reverse();
        list.printList();

        list.sort();
        list.printList();

        System.out.println(list.getSize());

    }
}
