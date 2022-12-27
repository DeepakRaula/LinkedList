package linkedList;

import java.util.Scanner;

public class DeleteNodeInLinkedList {
	public static int lengthOfLinkedList(Node<Integer> head) {
		int count = 0;
		
		Node<Integer>  temp = head;
		
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
		//Your code goes here
        if (head ==null)
        {
            return head;
        }
            
        else if(pos==0)
        {
            head=head.next;
        }
        else
        {
            Node<Integer> n = head,delNode=null;
            for (int i=0;i<pos-1 && n!=null;i++)
            {
                n=n.next;
            }
            if (n!=null && n.next!=null)
            {
                if (n.next!=null)
                {
                    n.next=n.next.next;
                }
                else
                {
                    n.next=null;
                }
                
            }
        }
        return head;
	}
	
	 public static void printLinkedList(Node<Integer> head) {
		    Node<Integer> temp = head;
		    while (temp != null) {
		      System.out.print(temp.data + " ");
		      temp = temp.next;
		    }
		    System.out.println();

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
			deleteNode(head,lengthOfLinkedList(head)-1 );
			printLinkedList(head);
			
		}


}
