package DoubleLinkedListPackage;

import java.util.Scanner;

public class DoubleLinkedList {
	private Node start;
	
	public DoubleLinkedList(){
		start = null;
	}
	public void createList(){
		int n, data;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of nodes");
		n = scan.nextInt();
		if(n == 0){
			return;
		}
		
		for(int i = 0; i < n; i++){
			System.out.println("Enter the element");
			data = scan.nextInt();
			insertAtEnd(data);
		}		
	}
	
	public void displayList(){
		if(start == null){
			System.out.println("No element added/empty list");
			return;
		}
		Node p = start;
		while(p != null){
			System.out.print(p.info+ " ");
			p = p.next;
		}
		System.out.println();
	}
	
	public void insertInBegining(int data){
		Node temp = new Node(data);
		temp.next = start;
		start.prev = null;
		start = temp;
	}
	
	public void insertAtEnd(int data){
		Node temp ;
		if(start == null){
			temp = new Node(data);
			start = temp;
			return;
		}
		Node p = start;
		while(p.next != null){
			p = p.next;
		}
		temp = new Node(data);
		p.next = temp;
		temp.prev = p;
		
	}
	
	public void inserAfterNode(int data, int x){
		Node temp;
		if(start == null){
			temp = new Node(data);
			start = temp;
			return;
		}
		temp = new Node(data);
		Node p = start;
		/*breaking condition*/
		while(p != null){
			if(p.info == x){
				break;
			}
			p = p.next;
		}
		if(p == null){
			System.out.println("element does not exists");
		}else{
			temp.prev = p;
			temp.next = p.next;
			p.next.prev = temp;
			p.next = temp;				
		}
	
	}
	
	public void insertBeforeNode(int data, int x){
		Node temp;
		if(start == null){
			return;
		}
		if(start.info == x){
			temp = new Node(data);
			temp.next = start;
			start.prev = temp;
			start = temp;
			return;
			
		}
		temp = new Node(data);
		Node p = start;
		while(p != null){
			if(p.info == x){
				break;
			}
			p = p.next;
		}
		if(p == null){
			System.out.println("Element doesn't exists");
		}else{
			temp.prev = p.prev;
			temp.next = p;
			p.prev.next = temp;
			p.prev = temp;			
		}		
	}
	/* Delete operations*/
	public void deleteFirstNode(){
		if(start == null){    /* List is empty */
			return;
		}
		if(start.next == null){  /* Only one element */
            start = null;
            return;
		}
		start = start.next;
		start.prev = null;
	}
	
	public void deleteOnlyNode(){
		start = null;
	}
	
	public void deleteAnyNode(int data){
		if(start == null){
			return;
		}
		/*List has only one node*/
		if(start.next == null){
			if(start.info == data){
				start = null;
			}else{
				System.out.println("Element does not exist");
			}
			return;
		}
		/*Deletion of first node*/
		if(start.info == data){
			start = start.next;
			start.prev = null;
			return;
		}

		Node p = start;
		while(p.next != null){
			if(p.info == data){
				break;
			}
			p = p.next;
		}
		/*Node is in between */
		if(p.next != null){
			p.prev.next = p.next;
			p.next.prev = p.prev;
		}else{
			/* Last node is to deleted */
			if(p.info == data){
				p.prev.next = null;
			}else{
				System.out.println(data + " Not found");
			}
		}
	}
	public void deleteLastNode(){
		if(start == null){    /* List is empty */
			return;
		}
		if(start.next == null){  /* Only one element */
            start = null;
            return;
		}
		Node p = start;
		while(p.next != null){
			p = p.next;
		}
		p.prev.next = null;
	}
	/* By changing linking */
	public void reverseList(){
		if(start == null){
			return;
		}
		Node p1 = start;
		Node p2 = p1.next;
		p1.next = null;
		p1.prev = p2;
		while(p2 != null){
			p2.prev = p2.next;
			p2.next = p1;
			p1 = p2;
			p2 = p2.prev;
		}
		start = p1;
	}

}
