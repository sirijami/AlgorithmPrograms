package SingleLinkedList;

public class Demo {

	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
        list.head = new Node(1);
        Node second = new Node(4);
        Node third = new Node(9);
//        Node fourth = new Node(13);
//        Node fifth = new Node(10);
//        Node six = new Node(12);
        
       list.head.next = second;
        second.next = third;
//        third.next = fourth;
//        fourth.next = fifth;
//        fifth.next = six;
        
        
        list.printList();
        System.out.println("Length of the list " + list.countNodes());
        
        System.out.println("Middle element of the linked list " + list.findMiddleElementInLinkedList());
        list.printList();
        
//        list.findMiddleElementAndSwapWithLast();
//        list.printList();
        
//        list.deleteMiddleElement();
//        list.printList();
        
//        list.removeDuplicates();
//        list.printList();
        
//          list.plusOne();
          
//		list.rotateList();
		
	     list.addLinkedList();
		


	}


}
