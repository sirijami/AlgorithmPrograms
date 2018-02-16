package SingleLinkedListPackage;

import java.util.Scanner;

public class SingleLinkedList {
	public Node start;
	public SingleLinkedList(){
		start = null;
	}

	public void displayList(){
		Node p;
		if(start == null){
			System.out.println("List is empty");
			return;
		}
		p = start;
		while(p != null){
			System.out.print(p.info + " ");
			p = p.link;
		}
		System.out.println();
	}
	
	public void countNode(){
		int count = 0;
		Node p = start;
		while(p != null){
			count++;
			p = p.link;
		}
		System.out.println("No of nodes: " + count);
	}
	
	public void search(int x){
		int position = 1;
		Node p = start;
		while(p != null){
			if(p.info == x){
				break;
			}
			p = p.link;
			position++;
		}
		if(p == null){
			/*Reached end of list*/
			System.out.println("Item not found ");
		}else {
			System.out.println(x +" is at position " + position);
		}
	}
	
	public void insertInBeginning(int data){
		Node temp = new Node(data);
		temp.link = start;
		start = temp;
	}
	
	public void insertAtEnd(int data){
		Node temp = new Node(data);
		Node p;
		if(start == null){
			start = temp;
			return;
		}
		p = start;
		while(p.link != null){
			p = p.link;
		}
		p.link = temp;
	}
	
	public void createList(){
		int data;
		Scanner scan = new Scanner(System.in);
		System.out.println("number of node: " );
		int numberOfNodes = scan.nextInt();
		
		if(numberOfNodes == 0){
			return;
		}
		for(int i = 0 ; i < numberOfNodes; i++){
			System.out.println("Enter the element to insert");
			data = scan.nextInt();
//			insertAtEnd(data);
			insertInOrder(data);
		}
		
	}
	public void insertAfterNode(int data,int x){
		Node p = start;
		while(p != null){
			if(p.info == x){
				break;
			}
			p = p.link;
		}
		if(p == null){
			System.out.println(x + " not found in the list");
		}else {
			Node temp = new Node(data);
			temp.link = p.link;
			p.link = temp;			
		}	
	}
	
	public void insertBeforeNode(int data, int x){
		Node temp;
		if(start == null){
			System.out.println("list is empty");
			return;
		}
		if(start.info == x){
			temp = new Node(data);
			temp.link = start;
			start = temp;
			return;
		}
		
		Node p = start;
		while(p!= null){
			if(p.link.info == x){
				break;
			}
			p = p.link;
		}
		if(p == null){
			System.out.println(x + " not found in the list");
		}else {
			temp = new Node(data);
			temp.link = p.link;
			p.link = temp;			
		}
	
	}
	
	public void insertAtK(int data, int k){
		Node temp;
		if(k == 0){
			temp = new Node(data);
			insertInBeginning(temp.info);
			return;
		}
		int count = 0;
		Node p = start;
		while(count < k-1 && p != null){
			count++;
			p = p.link;			
		}
		temp = new Node(data);
		temp.link = p.link;
		p.link = temp;		
	}

    /* Deletion of Node */
	public void deleteFirstNode(){
		if(start == null){
			return;
		}
		start = start.link;
	}
	
	public void deleteLastNode(){
		if(start == null){
			return;
		}
		if(start.link == null){
			start = null;
			return;
		}
		Node p = start;
		while(p.link.link != null){
			p = p.link;
		}
		p.link = null;
	}
	public void deleteNode(int data){
		if(start == null){
			return;
		}
		if(start.link == null){
			start = null;
			return;
		}
		Node p = start;
		while(p.link != null){
			if(p.link.info == data){
				break;
			}else {
				p = p.link;
			}
		}
		if(p.link == null){
			System.out.println("no element found");
		}else {
		p.link = p.link.link;
		}
	}
	
	public void reverseList(){
		Node prev = null;
		Node p = start;
		Node next;
		while(p != null){
			next = p.link;
			p.link = prev;
			prev = p;
			p = next;
		}
		start = prev;
	}
	
	public void sortUsingBubblesort(){
		Node p, q, end;
		for(end = null ; end != start.link; end = p){
			for(p = start; p.link!= end ; p = p.link){
				q = p.link;
				if(p.info > q.info){
					int temp = p.info;
					p.info = q.info;
					q.info = temp;
				}
			}
		}		
	}
	
	public void sortUsingBubblesortLink(){
		Node p, q, end, r,temp;
		for(end = null ; end != start.link; end = p){
			for(r = p = start; p.link!= end ; r=p ,p = p.link){
				q = p.link;
				if(p.info > q.info){
					p.link = q.link;
					q.link = p;
					if(p!= start){
						r.link = q;						
					}else{
						start = q;
					}
					temp = p;
					p = q;
					q = temp;
				}
			}
		}		
	}
	
	public SingleLinkedList mergeList(SingleLinkedList l){
		SingleLinkedList mergedList = new SingleLinkedList();
		mergedList.start = mergedList(start, l.start);
		return mergedList;		
	}

	private Node mergedList(Node p1, Node p2) {
		Node startM;
		if(p1.info < p2.info){
			startM = new Node(p1.info);
			p1 = p1.link;
		}else{
			startM = new Node(p2.info);
			p2 = p2.link;
		}
		Node pM = startM;
		
		while(p1 != null && p2 != null){
			if(p1.info < p2.info){
				startM = new Node(p1.info);
				p1 = p1.link;
			}else{
				startM = new Node(p2.info);
				p2 = p2.link;
			}
			pM = pM.link;
		}
		
		while(p1 != null){
			pM.link = new Node(p1.info);
			p1 = p1.link;
			pM = pM.link;
		}
		while(p2 != null){
			pM.link = new Node(p2.info);
			p2 = p2.link;
			pM = pM.link;
		}	
		return startM;
	}
	
	public boolean hasCycle(){
		if(findCycle() == null){
			return false;
		}
		return true;
	}
	
	public Node findCycle(){
		if(start == null || start.link == null){
			return null;
		}
		Node slow = start;
		Node fast = start;
		/*fast == null for even other is for odd number*/
		while(fast == null || fast.link != null){
			slow = slow.link;
			fast = fast.link.link;
			if(slow == fast){
				System.out.println("slow "+ slow);
				return slow;
			}
		}
		return null;		
	}
	
	public void insertCycle(int x){
		if(start == null){
			return;
		}
		Node p = start;
		Node prev = null, px = null;
		while(p != null){
			if(p.info == x){
				px = p;
			}
				prev = p;
				p = p.link;				
		}
		if(px != null){
			prev.link = px;
		}else{
			System.out.println(x + " is not present");
		}
	}
	
	public void removeCycle(){
		Node c = findCycle();
		if(c == null){
			System.out.println("No cycle exists");
			return;
		}
		System.out.println("Node at which cycle is detected is " + c.info);
		Node p = c, q = c;
		int lengthOfCycle = 0;
		do{
			lengthOfCycle++;
			q = q.link;
		}while (p != q);
		System.out.println("length of the cycle " + lengthOfCycle);
		
		int lengthOfRemainingList = 0;
		p = start;
		while(p != q){
			lengthOfRemainingList++;
			p = p.link;
			q = q.link;
		}
		System.out.println("Length of remaining list " + lengthOfRemainingList);
		int listLength = lengthOfCycle + lengthOfRemainingList;
		System.out.println("Total list length "+ listLength);
		
		p = start;
		for(int i = 0; i < listLength; i++){
			p = p.link;
		}
		p.link = null;
	}
	public void insertInOrder(int data){
		Node temp = new Node(data);
		if(start == null || data < start.info){
			temp.link = start;
			start = temp;
			return;
		}
		Node p = start;
		while(p.link != null && p.link.info <= data){
			p = p.link;
		}
		temp.link = p.link;
		p.link = temp;
		
	}

}
