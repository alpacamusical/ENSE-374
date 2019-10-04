
public class Main {

	public static void main(String[] args) {

		ListElement le1 = new ListElement();
		ListElement le2 = new ListElement();
		ListElement le3 = new ListElement();
		
		le1.setData(5);
		le2.setData(7);
		le3.setData(1);
		
		LinkList list = new LinkList();
		
		list.addElement(le1);
		list.addElement(le2);
		list.addElement(le3);
		
		list.getElement(1);
		
		list.printLinkedListHead(list);
		list.printLinkedListTail(list);
		
		list.deleteElement(1);
		
		list.printLinkedListHead(list);
	}

}
