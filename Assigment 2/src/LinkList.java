
public class LinkList {
	
	private ListElement head;
	private ListElement tail;
	
	LinkList(){
		this.head = this.tail = null;
	}
	
	public void addElement(ListElement le) {
	
		if (head==null) {
			head = le;
			tail = le;
			
			head.setPrevious(null);
			tail.setNext(null);
			
		}
		
		else {
			tail.setNext(le);
			le.setPrevious(tail);
			
			tail = le;
			tail.setNext(null);
		}
	}
	
	public ListElement getElement(int index) {
		ListElement current = head;
		int counter = 0;
		
		while (counter != index) {
			current = current.getNext();
			counter ++;
		}
		
		return current;
	}
	
	//try to do it with a ListElement return method but could not find a way to make it work
	 public ListElement deleteElement(int index) {
		 
		 	ListElement current = head;
			int counter = 0;
			
			while (counter != index) {
				current = current.getNext();
				counter ++;
			}
			
		 ListElement nodeDeletePrevious = current.getPrevious();
		 ListElement nodeDeleteNext = current.getNext();
		 
		 nodeDeletePrevious.setNext(nodeDeleteNext);
		 nodeDeleteNext.setPrevious(nodeDeletePrevious); 
		 
		 return current;
		 
	 }
	 
	 public void printLinkedListHead(LinkList list) {
		 ListElement current = list.head;
		 
		 System.out.println("Linked list from head: ");
		 
		 while(current != null) {
			 System.out.println(current.getData() + " ");
			 
			 current = current.getNext();
		 }
	 }
	 
	 public void printLinkedListTail(LinkList list) {
		 ListElement current = list.tail;
		 
		 System.out.println("Linked list from tail: ");
		 
		 while(current != null) {
			 System.out.println(current.getData() + " ");
			 
			 current = current.getPrevious();
		 }
	 }
}
