import java.io.ObjectInputStream.GetField;


public class intersectionLinkedList {
	static Node head1, head2;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		intersectionLinkedList ll = new intersectionLinkedList();
		
		ll.head1 = new Node(2);
		ll.head1.next = new Node(15);
		ll.head1.next.next = new Node(19);
		ll.head1.next.next.next = new Node(12);
		ll.head1.next.next.next.next = new Node(23);
		
		ll.head2 = new Node(10);
		ll.head2.next = new Node(12);
		ll.head2.next.next = new Node(23);
		
		
		if(ll.getNode() == -1){
			System.out.println("No intersection existes between both lists");
		} else {
			System.out.println("Intersection node is " + ll.getNode());
		}
		

	}

	private int getNode() {
		int list1Length = getLength(head1);
		int list2length = getLength(head2);
		int lengthDiff ;
		
		if(list1Length < list2length){
			lengthDiff = list2length - list1Length;
			return getIntersectionNode( lengthDiff, head2, head1);
		} else {
			lengthDiff = list1Length - list2length;
			return getIntersectionNode( lengthDiff, head1, head2);
		}
	}

	private int getIntersectionNode(int lengthDiff, Node LargestList, Node smallestList) {
		for(int i = 0; i < lengthDiff ; i++){
			if(LargestList == null){
				return -1;
			}
			LargestList = LargestList.next;			
		}
		while( LargestList != null && smallestList != null){
			if(LargestList.data == smallestList.data){
				return LargestList.data;
			}
			LargestList = LargestList.next;
			smallestList = smallestList.next;
		}
		return -1;

	}

	private int getLength(Node node) {
		int length = 0;
		while(node != null){
			length++;
			node = node.next;
		}
		return length;
	}

}
