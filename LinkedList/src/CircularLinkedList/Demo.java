package CircularLinkedList;

public class Demo {

	public static void main(String[] args) {
		CircularLinkedList clist = new CircularLinkedList();
		clist.createList();
		clist.displayList();
		clist.insertAfter(23, 5);
		clist.displayList();
		clist.deleteFirstNode();
		clist.deleteLastNode();
		clist.displayList();
		clist.deleteNode(5);
		clist.displayList();

	}

}
