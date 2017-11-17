//package demo;
//
//import java.awt.List;
//import java.util.LinkedList;
//
//import com.sun.corba.se.impl.orbutil.graph.Node;
//
//public class linkedList{
//	
//	private ListNode head;
//		
//	public class ListNode {
//		int val;
//		ListNode next;
//		
//		ListNode(int x) { 
//			val = x;
//			next = null;
//		}
//	}
//	
//	public void addToTheLast(ListNode node) {
//		 
//		  if (head == null) {
//		   head = node;
//		  } else {
//		   ListNode temp = head;
//		   while (temp.next != null)
//		    temp = temp.next;
//		 
//		   temp.next = node;
//		  }
//	}
//	
//	public ListNode reverseList(ListNode head) {
//        ListNode prev = null;
//		ListNode current = head;
//		ListNode next = null;
//		
//		if(head == null || head.next == null){
//			return head;
//		}
//		while( current != null){
//			next = current.next;
//			current.next = prev;
//			prev = current;
//			current = next;
//		}
//		head = prev;
//		return head;
//	}
//	
//	
//	public void printList(ListNode node){
//		while(node != null){
//			System.out.print(node.val + " ");
//			node = node.next;
//		}
//		System.out.println();
//	}
//
//	public static void main(String[] args) {
//		linkedList ll = new linkedList();
//		ListNode head = new ListNode(10);
//		ll.addToTheLast(head);
//		ll.addToTheLast(new ListNode(20));
//		ll.addToTheLast(new ListNode(30));
//		
//
//
//		
//
//
//	}
//
//}
