package com.Trailblazer.Algorithms.linkedList;

import javax.swing.event.ListDataEvent;
import java.util.List;

/**
 * a linked list is a linear data structure where elements are stored in nodes that
 * are linked together using pointer
 * a single linked : Each node contains a data value and a reference to the next node.
 * The last node points to null
 */
public class Singlelinkedlist {
    /**
     * this is Private ListNode variable by the name head
     */
    private ListNode head;

    /**
     * THis is a ListNode class
     */
    private static class ListNode {
        private int data;
        private ListNode next;

        /**
         * THis is a constructor for the ListNode class
         *
         * @param data This is the only parameter it takes from the ListNode class
         */
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * This method is used to display linked list
     */
    public void display() {

        ListNode current = head;
        while (current != null) {

            System.out.print(current.data + " ===> ");
            current = current.next;

        }
        System.out.println("null");
    }

    /**
     * THis is a method to display the length of linked list
     *
     * @return
     */
    public int length() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;

        }
        return count;
    }

    /**
     * A method to insert a node at the beginning of the linked list
     *
     * @param value value to be added to the linked list
     */
    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    /**
     * This is a method to insert
     *
     * @param position
     * @param value
     */
    public void insert(int position, int value) {
        ListNode node = new ListNode(value);

        if (position == 1) {
            node.next = head;
            head = node;

        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next=node;
            node.next=current;
        }
    }

    /**
     * a method to insert a value to  the last position
     *
     * @param value is the number to be added
     */
    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }

        ListNode current = head;
        while (null != current.next) {
            current = current.next;

        }
        current.next = newNode;

    }

    /**
     * This is a method which deletes teh linked list  of teh first attempt
     * @return
     */
    public ListNode deleteFirst(){
        if(head==null){
            return null;
        }
        ListNode temp = head;
        head=head.next;
        temp.next=null;
        return temp;
    }

    /**
     * THis method deletes the last node is the linked list
     * @return it returns the deleted node
     */
    public ListNode deleteLast(){
        if(head==null ||head.next==null){
            return head;
        }
        ListNode current=head;
        ListNode previous=null;
        while(current.next != null){
            previous= current;
            current=current.next;
        }
        previous.next=null;
        return current;
    }

    /**
     * This is method to delete a linked list node at a given position
     * @param position the positon of the linked list node you want to delete
     * @return
     */
    public ListNode delete(int position){
        ListNode current=head;
        if(position==1){
            head=head.next;
            return current;
        }
        ListNode active=null;
        int count=1;
        while(count<position-1){
            current=current.next;
            active=current.next;
            count++;
        }
        current.next=active.next;
        active.next=null;
        return active;
    }

    /**
     * This is method used to search for a value inside the single linked list
     * @param head
     * @param searchKey
     * @return a boolean value
     */
    public boolean find(ListNode head,int searchKey){
        if(head==null){
            return false;
        }
        ListNode current =head;
        while(current !=null){
            if(current.data == searchKey){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public ListNode reverse(ListNode head){
        if(head==null){
            return head;
        }
        ListNode current =head;
        ListNode previous=null;
        ListNode next= null;
        while(current!=null){
            next= current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }
    public static void main(String[] args) {
        Singlelinkedlist sll = new Singlelinkedlist();//instance of the class
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode four = new ListNode(11);
//        now we will connect them together to form a chain
        sll.head.next = second;
        second.next = third;
        third.next = four;

        sll.display();
        System.out.println("Length of the node list is " + sll.length());
//I want to inset a new node at the beginning of the node list
        /*
        *This is the first attempt
        ListNode ultimate=new ListNode(200);
        ultimate.next=sll.head;
        sll.head=ultimate;
*/
        System.out.println("Updated node list ");
        sll.display();
//        let me add another linked list
        /*
        ListNode premium = new ListNode(20);
        premium.next=ultimate;
        sll.head=premium;
        System.out.println("Updated node list ");
        sll.display();

         */
        sll.insertFirst(20);//I am using a function to insert at the beginning of the linked list
        sll.display();
        sll.insert(4,1);
        sll.display();
        System.out.println("Deleted value is"+sll.deleteFirst().data);
        sll.display();
        System.out.println("Deleted last value is "+ sll.deleteLast().data);
        sll.display();
        sll.insertLast(32);
        sll.display();
        System.out.println("The delete node linked list is "+sll.delete(1).data);
        sll.display();
        Singlelinkedlist singly= new Singlelinkedlist();
        if(singly.find(sll.head,1)){
            System.out.println("Search Key Found !!!");
        }
        else{
            System.out.println("Search Key not found !!!");
        }


    }
}
