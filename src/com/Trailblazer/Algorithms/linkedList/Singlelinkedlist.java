package com.Trailblazer.Algorithms.linkedList;

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
}
