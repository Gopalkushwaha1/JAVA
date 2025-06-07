class Node {
	int val ; 
	Node next ; 
	
	Node(int a) {
		val = a ; 
		next = null ;
	}
}

class SinglyLinkedList{
	Node head ;
	SinglyLinkedList() {
		head = null ; 
	}
	void insertAtStart(int data) {
		Node node = new Node(data) ; 
		if ( head == null ) {
			head = node ; 
		}
		else {
			node.next = head ; 
			head = node ; 
		}
	}
	void insertAtEnd( int data ) {
		Node node = new Node(data) ;
		if ( head == null ) {
			head = node ; 
		}
		else {
			Node temp = head ; 
			while ( temp.next != null ) {
				temp = temp.next ; 
			}
			temp.next = node ; 
		}
	}
	void insertAtIndex(int idx , int data) {
		Node node = new Node(data) ; 
		if ( idx == 0 ) {
			insertAtStart(data) ; 
		}
		else {
			Node temp = head ; 
			int i = 0 ; 
			while ( temp != null && i != idx ) {
				temp = temp.next ; 
				i++ ; 
			}
			if ( temp == null ) {
				System.out.println("Invalid Index");
			}
			else {
				node.next = temp.next ; 
				temp.next = node ; 
			}
		}
	}
	void display() {
		Node temp = head ; 
		while ( temp != null ) {
			System.out.print(temp.val + "->") ; 
			temp = temp.next ; 
		}
		System.out.println("null") ;
	}
}
			

class Practice {
	public static void main( String[] args ) {
		System.out.println("Gopal") ; 
		SinglyLinkedList l1 = new SinglyLinkedList();
		l1.insertAtStart(6);
		l1.insertAtStart(7) ; 
		l1.display();
	}
}