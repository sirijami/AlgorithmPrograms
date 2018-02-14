class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}
public class CircularLinkedList {
	Node head;
	public CircularLinkedList() {
		head = null;
	}


	private void sortedInsert(Node newNode) {
		Node currentNode = head;
		if(currentNode == null){
			newNode.next = newNode;
			head = newNode;
		} else if (currentNode.data > newNode.data){
			while(currentNode.next != head){
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
			newNode.next = head;
			head = newNode;
		} else {
			while(currentNode.next != head && currentNode.next.data < newNode.data){
				currentNode = currentNode.next;
			}
			newNode.next = currentNode.next;
			currentNode.next = newNode;
		}
		
	}

	private void printcircularList() {
		if(head != null){
			Node t = head;
			do{
				System.out.print(t.data + " ");
				t = t.next;	
			}
			while(t != head);
		}
		
	}
	
	public static void main(String[] args) {
		CircularLinkedList clist = new CircularLinkedList();
		int arr[] = new int[]{25,1,12,89,7,53,22,10};
		Node temp = null;
		for(int i = 0; i < arr.length; i++){
			temp = new Node(arr[i]);
			clist.sortedInsert(temp);
		}
            clist.printcircularList();
	}


}
