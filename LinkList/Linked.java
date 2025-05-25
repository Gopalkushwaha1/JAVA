class Node {
	int val ; 
	Node next ; 

	Node ( int val ) {
		this.val = val ; 
		next = null ; 
	}
}
class LinkedList {
	Node head ;
	Node tail ; 
	int size ;  
	LinkedList() {
		head = null ; 
		tail = null ; 
		size = 0 ; 
	}
	
	void add( int x ) {
		Node n = new Node(x) ;
		if ( head == null ) { 
			head = n ; 
			tail = n ; 
			size++ ; 
		}
		else {
			Node temp = head ; 
			while ( temp.next != null ) {
				temp = temp.next ; 
			}
			temp.next = n ; 
			size++;
			tail = n ; 
		}
	}
	void InsertAtStart(int x ) {
		Node n = new Node(x) ;
		n.next = head ; 
		head = n ; 
		size++;
	}
	void InsertAtEnd(int x ) {
		Node n = new Node(x) ;
		tail.next = n ; 
		tail = n ;
		size++; 
	}
	void InsertAtIndex(int idx , int x ) {
		if ( idx < 0 || idx > size ) {
			System.out.println( "Invalid index " ) ; 
			return ; 
		}
		Node n = new Node(x) ;
		if ( idx == 0 ) {
			InsertAtStart(x) ; 
		}
		else if ( idx == size ) {
			InsertAtEnd(x) ; 
		}
		else {
			Node temp = head ; 
			while ( idx != 2 ) {
				temp = temp.next ;
				idx-- ;  
			}
			n.next = temp.next ; 
			temp.next = n ; 
			size++;
		}
	}
	void display() {
		Node temp = head ; 
		while ( temp != null ) {
			System.out.print(temp.val + " " ) ; 
			temp = temp.next ; 
		}
	}
	int size() {
		return size ; 
	}
}
class Linked {
	public static void main(String[] args ) {
		LinkedList ll = new LinkedList() ; 
		ll.add(5) ; 
		ll.add(6) ; 
		ll.add(7) ; 

		System.out.print("Element are :: ") ; 
		ll.display() ;  
		System.out.println("Size is :: " + ll.size() ) ; 

		System.out.println("Insert at start " ) ;
		System.out.print("Element are :: ") ; 
		ll.InsertAtStart(0) ; 
		ll.display() ;
		System.out.println("Size is :: " + ll.size() ) ;

		System.out.println("Insert at End " ) ; 
		System.out.print("Element are :: ") ;
		ll.InsertAtEnd(9) ; 
		ll.display() ;
		System.out.println("Size is :: " + ll.size() ) ;

		System.out.println("Insert at Index " ) ; 
		System.out.print("Element are :: ") ;
		ll.InsertAtIndex(3,1) ; 
		ll.display() ;
		System.out.println("Size is :: " + ll.size() ) ;

		System.out.println("Insert at Index " ) ; 
		System.out.print("Element are :: ") ;
		ll.InsertAtIndex(0,-1) ; 
		ll.display() ;
		System.out.println("Size is :: " + ll.size() ) ;

		System.out.println("Insert at Index " ) ; 
		System.out.print("Element are :: ") ;
		ll.InsertAtIndex(7,10) ; 
		ll.display() ;
		System.out.println("Size is :: " + ll.size() ) ;

		System.out.println("Insert at Index " ) ; 
		System.out.print("Element are :: ") ;
		ll.InsertAtIndex(13,1) ; 
		ll.display() ;
		System.out.println("Size is :: " + ll.size() ) ;

		System.out.println("Insert at Index " ) ; 
		System.out.print("Element are :: ") ;
		ll.InsertAtIndex(-3,1) ; 
		ll.display() ;
		System.out.println("Size is :: " + ll.size() ) ;
	}
}