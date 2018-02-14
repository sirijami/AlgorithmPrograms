package DoubleLinkedListPackage;

public class Demo {
	
	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
		
		/*Ideal case */
//		list.createList();
//		list.displayList();
//		list.insertInBegining(2);
//		list.displayList();
//		list.inserAfterNode(2, 23);
//		list.displayList();
//		list.insertBeforeNode(5, 2);
//		list.displayList();
//		/*Deleting nodes from the list */
//		list.createList();
//		list.displayList();
//		list.deleteFirstNode();
//		list.deleteLastNode();
//		list.displayList();
//		list.deleteAnyNode(2);
//		list.displayList();
		/* edge cases*/
//		list.displayList();
		/*Enter only one element and check add node before it*/
//		list.createList();
//		list.insertBeforeNode(2, 5);
//		list.displayList();
		/*Enter node after in a empty list*/
//		list.createList();
//		list.inserAfterNode(1, 3);
//		list.displayList();
		/* Reverse a list */
		list.createList();
		list.displayList();
		list.reverseList();
		list.displayList();

	
	}

}
