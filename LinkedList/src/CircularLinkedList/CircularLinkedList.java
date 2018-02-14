package CircularLinkedList;

import java.util.Scanner;

public class CircularLinkedList {
	private Node last;
	public CircularLinkedList(){
		last = null;
	}
	
	public void displayList(){
		Node p;
		if(last == null){
			System.out.println("Empty list");
			return;
		}
		p = last.link;
		do{
			System.out.print(p.info + " ");
			p = p.link;
		}while(p != last.link);
		System.out.println();
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

	private void insertAtEnd(int data) {
		Node temp;
		if(last == null){
			temp = new Node(data);
			last = temp;
			last.link = last;
			return;			
		}
		temp = new Node(data);
		temp.link = last.link;
		last.link = temp;
		last = temp;			
	}
	
	public void insertAfter(int nodeData, int existingNode){
		Node p = last.link;
		do{
			if(p.info == existingNode){
				break;
			}else{
				p = p.link;
			}			
		}while(p != last.link);
		
		if(p == last.link && p.info != existingNode){
			System.out.println(existingNode + " does not exists");
		}else{
			Node temp = new Node(nodeData);
			temp.link = p.link;
			p.link = temp;
			if(p == last){
				last = temp;
			}			
		}		
	}
	/* Deletion of Nodes */
	public void deleteFirstNode(){
		if(last == null){
			return;
		}
		if(last.link == last){
			last = null;
			return;
		}
		last.link = last.link.link;
	}
	public void deleteLastNode(){
		if(last == null){
			return;
		}
		if(last.link == last){
			last = null;
			return;
		}
		Node p = last.link;
		while(p.link != last){
			p = p.link;			
		}
		p.link = last.link;
		last = p;		
	}
	public void deleteNode(int nodeData){
		if(last == null){
			return;
		}
		if(last.link == last && last.info == nodeData){
			last = null;
			return;
		}
		/* Deletion of first node*/
		if(last.link.info == nodeData){
			last.link = last.link.link;
			return;
		}
		Node p = last.link;
		while(p.link != last.link){
			if(p.link.info == nodeData){
				break;
			}else{
				p = p.link;
			}
		}
		if(p.link == last.link){
			System.out.println("element not found");
		}else{
			p.link = p.link.link;
			if(last.info == nodeData){
				last = p;
			}
		}
	}
	

}
