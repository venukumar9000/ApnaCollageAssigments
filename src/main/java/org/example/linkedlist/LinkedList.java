package org.example.linkedlist;



public class LinkedList {
    public static Node first;
    public static Node last;
    public int size;

    public LinkedList(int size) {
        this.size = 0;
    }

    class Node {

        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(first ==null){
            first=last=newNode;
            return;
        }

        newNode.next= first;
        first=newNode;
        size++;


    }
   public void addLast(int data){
        Node newNode = new Node(data);
        if(first==null){
            first=last=newNode;
            return;
        }

        last.next=newNode;
        last=newNode;
        size++;

   }
   public void print(){
        Node temp = first;
        while (temp !=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
       System.out.println("null");
   }
   public void addMiddle(int data, int idx){
    if(idx==0){
        addFirst(data);
        size++;
        return;
    }
    if(idx>=size){
        addLast(data);
        size++;
        return;
    }
    Node newNode = new Node(data);
    Node temp =first;
    for (int i=0;i<idx-1;i++){
        temp=temp.next;
    }
    newNode.next=temp.next;
    temp.next=newNode;
    size++;
   }
   public int removeFirst(){
        if(size ==0){
            System.out.println("ll is empty");
            return Integer.MAX_VALUE;
        }
        else if(size ==1){
            int val = first.data;
            first=last=null;
            size=0;
            return val;

        }
        int val =first.data;
        first=first.next;
        return val;

   }
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = first.data; // Can also use last.data
            first = last = null;
            size = 0; // Correctly sets size to 0
            return val;
        }

        Node temp = first;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        int val = temp.next.data; // This is 'last.data'
        temp.next = null; // Remove the link to the last node
        last = temp; // Update 'last' to the new last node
        size--; // Correct: Decrement size when an element is removed
        return val;
    }

    public int itrSearch(int key){
      Node temp =first;
      int i=0;
      while(temp !=null){
          if(temp.data==key){
              return i;
          }
          temp=temp.next;
          i++;

      }
      return -1;
    }
    public void reverseLL(){
        Node prev =null;
        Node curr = last=first;
        Node next;

        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        first=prev;

    }




    public static void main(String[] args) {

        LinkedList ll = new LinkedList(200);
          ll.addFirst(10);
          ll.addFirst(20);
          ll.addFirst(30);
          ll.print();
          ll.addLast(50);
          ll.addMiddle(100,2);
          ll.removeFirst();
        System.out.println("___________");
        System.out.println(ll.itrSearch(10));
        System.out.println("___________");
//          ll.removeLast();
        ll.reverseLL();
          ll.print();

          ll.removeLast();
          ll.print();

    }
}
