package SingleLinkedList;

public class SingleLinkedList {
	Node head;
	
	public void printList() {
		if(head == null){
			System.out.println("Emplty List");
			return ;
		}
		Node p = head;
		while(p.next != null){
			System.out.print(p.data + " -> ");
			p = p.next;
		}
		System.out.println(p.data + " -> null");		
	}
	
	public void printList(Node head){
		if(head == null){
			System.out.println("Emplty List");
			return ;
		}
		Node p = head;
		while(p.next != null){
			System.out.print(p.data + " -> ");
			p = p.next;
		}
		System.out.println(p.data + " -> null");			
	}
	
	public int countNodes(){
		int count = 0;
		if(head == null){
			System.out.println("Emplty List");
			return count;
		}
		Node p = head;
		while(p != null){
			count++;
			p = p.next;
		}
		return count;
	}
	
	/* Return the middle element of the linked list */
	public int findMiddleElementInLinkedList(){
		Node slow_pt = head;
		Node fast_pt = head;
		
		if(head == null){
			System.out.println("Emplty List");
			return -1;			
		}else if (countNodes() == 1){
			return head.data;
		}else {
			while(fast_pt != null && fast_pt.next != null){
				slow_pt = slow_pt.next;
				fast_pt = fast_pt.next.next;
			}			
		}		
		return slow_pt.data;
	}
	
	/* find Middle element and swap it with last element */	
	public void findMiddleElementAndSwapWithLast(){
		Node slow_pt = head;
		Node fast_pt = head;
		
		if(head == null){
			System.out.println("Emplty List");
			return;			
		}
        if(head.next != null){       	
			while(fast_pt != null && fast_pt.next != null){
				slow_pt = slow_pt.next;
				fast_pt = fast_pt.next.next;
			}
			int temp = slow_pt.data;
			
			if(fast_pt == null){
				slow_pt.data = slow_pt.next.data;
				slow_pt.next.data = temp;
			}else {
				slow_pt.data = fast_pt.data;
				fast_pt.data = temp;
			}

		}		
	}
	
	/* Delete the middle element from the linked list */
	public void deleteMiddleElement(){
		Node slow_pt = head;
		Node fast_pt = head;
		Node prev = null;
		
		if(head == null){
			System.out.println("Empty list");
			return;
		}

		if(head.next != null){
			while(fast_pt != null && fast_pt.next != null){
				prev = slow_pt;
				slow_pt = slow_pt.next;
				fast_pt = fast_pt.next.next;
			}
			prev.next = slow_pt.next;
			slow_pt = null;			
		}
	}
	
	/* Remove duplicates in sorted linked list */
	public void removeDuplicates(){
		if(head == null){
			System.out.println("Empty list");
			return;
		}
		
		Node p = head;
		while(p != null && p.next != null){
			if(p.data == p.next.data){
				p.next = p.next.next;
			}else {
				p = p.next;
			}
		}
		
	}
	
	/* Linked list is palindrome or not */
	public boolean isPalindrome(){
		Node left = head;
		boolean result = helper(head);
		return result;		
	}

	private boolean helper(Node right) {
		
		return false;
	}
	
	/* plus One in linked list:
	 * Steps: reverse the list and add 1
	 * if the there is a carry then move to next node 
	 * then reverse the modified list and return the head */
	
	public void plusOne(){
		Node temp = reverse(head);
		printList(temp);
		
		while(temp.next != null){
			if(temp.data + 1 <= 9){
				temp.data = temp.data + 1;
	            break;
			}else {
				temp.data = 0;
				System.out.println(temp.data);
					if(temp.next == null){
						temp.next = new Node(1);
						break;
					}
				temp = temp.next;
			}
		}
		printList(temp);
		Node n1 = reverse(temp);
		printList(n1);
	}

	public Node reverse(Node head) {
		if(head == null){
			return head;
		}
		
		Node curr = head;
		Node next = head.next;
		while(next != null){
			Node temp = next.next;
			next.next = curr;
			curr = next;
			next = temp;
		}
        
		head.next = null;
		return curr;
		
	}
	
	
	

        

}
