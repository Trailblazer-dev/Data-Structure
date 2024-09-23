package com.Trailblazer.Algorithms.linkedList;

import java.util.List;

/**
 * a linked list is a linear data structure where elements are stored in nodes that
 * are linked together using pointer
 * a single linked : Each node contains a data value and a reference to the next node.
 * The last node points to null
 *
 */
public class Singlelinkedlist {
    /**
     * this is Private ListNode variable by the name head
     */
    private ListNode head;

    /**
     * THis is a ListNode class
     */
    private static class  ListNode{
        private int data;
        private ListNode next;

        /**
         * THis is a constructor for the ListNode class
         * @param data This is the only parameter it takes from the ListNode class
         */
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    /**
     * This method is used to display linked list
      */
    public void display(){

        ListNode current =head;
        while(current!=null){

            System.out.print(current.data+" ===> ");
            current = current.next;

        }
        System.out.println("null");
    }

    public int length(){
        if(head==null){
            return 0;
        }
        int count=0;
        ListNode current =head;
        while(current!= null){
            count++;
            current = current.next;

        }
        return count;
    }

    public static void main(String[] args) {
        Singlelinkedlist sll= new Singlelinkedlist();//instance of the class
        sll.head= new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode four = new ListNode(11);
//        now we will connect them together to form a chain
        sll.head.next= second;
        second.next=third;
        third.next=four;

        sll.display();
        System.out.println("Length of the node list is "+sll.length());

    }
}
