package linkedList;

import java.util.Scanner;

public class PositionOfIthElement {
	
	public static void positionOfIthElement(Node<Integer> head,int element) {
		int count = 0;
		if(head == null) {
			System.out.println();
			return;
		}
		Node<Integer> temp = head;
		while(temp != null) {
			count++;
			temp = temp.next;
			if(count == element) {
				System.out.println(temp.data);
			}
		}
	}
	
	public static void printLinkedList(Node<Integer> head) {
	    Node<Integer> temp = head;
	    while (temp != null) {
	      System.out.print(temp.data + " ");
	      temp = temp.next;
	    }
	    System.out.println();

	  }
	
	
	public static int lengthOfLinkedList(Node<Integer> head) {
		int count = 0;
		
		Node<Integer>  temp = head;
		
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	  public static Node<Integer> takeInput(){
	    Scanner s = new Scanner(System.in);
	    int data = s.nextInt();
	    Node<Integer> head = null, tail = null;
	    while(data != -1){
	      Node<Integer> currentNode = new Node<Integer>(data);
	      if(head == null){
	        head = currentNode;
	        tail = currentNode;
	      }else{
	        tail.next = currentNode;
	        tail = currentNode;
	    }
	      data = s.nextInt();
	  }
	    return head;

	  }

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		printLinkedList(head);
		System.out.println(lengthOfLinkedList(head));
	}


}
