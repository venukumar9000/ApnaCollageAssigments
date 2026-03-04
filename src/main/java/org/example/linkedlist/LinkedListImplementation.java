package org.example.linkedlist;

import java.util.LinkedList;

public class LinkedListImplementation {
     public static Node first;

     public static Node last;

     public int size=0;


     class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(first==null){
            first=last=newNode;
        }
        newNode.next=first;
        first=newNode;
        size++;
    }
    public void addLast(int data){
         Node newNode = new Node(data);
         if(first==null){
             first=last=newNode;
         }
         last=newNode;
         last.next=null;

    }


    public static void main(String[] args) {
        LinkedListImplementation linkedListImplementation = new LinkedListImplementation();

      linkedListImplementation.addFirst(50);

      linkedListImplementation.addFirst(60);


    }
}
