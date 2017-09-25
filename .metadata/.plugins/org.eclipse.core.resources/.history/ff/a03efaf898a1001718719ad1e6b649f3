public class mergeSortedLinkedList {
	static Node list1, list2, head;
	public static class Node{
		int data;
		Node next;		
		Node(int d){
			data = d;
			next = null;			
		}		
	}
	public static void main(String[] args) {
		mergeSortedLinkedList ll = new mergeSortedLinkedList();
		ll.list1 = new Node(3);
		ll.list1.next = new Node(5);
		ll.list1.next.next = new Node(20);
		ll.list1.next.next.next = new Node(35);
		
		ll.list2 = new Node(2);
		ll.list2.next = new Node(6);
		ll.list2.next.next = new Node(22);
		ll.list2.next.next.next = new Node(27);
		
		Node result = ll.sortedMerge(list1, list2);
		ll.printLinkedList(result);		
	}
	private void printLinkedList(Node result) {
		while(result != null){
			System.out.print(result.data + " -> ");
			result = result.next;
		}
		System.out.print("NULL");		
	}
	private static Node sortedMerge(Node list1, Node list2) {
		if(list1 == null){
			return list1;
		}
		if(list2 == null){
			return list2;
		}		
		if(list1.data < list2.data){
			head = list1;			
		}else {
			head =list2;
			list2 = list1;
			list1 = head;			
		}		
		while(list1.next != null && list2 != null){
			if(list1.next.data < list2.data){
				list1 = list1.next;
			}else {
				Node tmp = list1.next;
				list1.next = list2;
				list2 = tmp;
			}
		}
		if(list1.next == null)
			list1.next = list2;
		return head;		
	}
}
