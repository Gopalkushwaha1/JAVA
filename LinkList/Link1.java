class Node1 {
	int val ; 
	Node1 next ; 
	Node1(int val ) {
		this.val = val ;
		next = null ;
	}
}

class L {
	Node1 head ; 
	Node1 tail ; 
	int size ; 
	
	L() {
		head = null ; 
		tail = null ; 
		size = 0 ; 
	}
	void add(int val ) {
		Node1 n = new Node1(val) ; 
		if ( head == null ) {
			head = n ;
			tail = n ;  
			size++ ; 
		}
		else {
			Node1 temp = head ; 
			while ( temp.next != null ) {
				temp = temp.next ; 
			}
			temp.next = n ; 
			tail = n ; 
			size++ ; 
		}
	}
	void deleteVal( int val ) {
		if ( head.val == val ) {
			Node1 temp = head.next ; 
			head.next = null ; 
			head = temp ; 
		}
		else {
			Node1 temp = head ; 
			while ( temp.next != null && temp.next.val != val ) {
				temp = temp.next ; 
			}
			if ( temp.next == null ) {
				System.out.println("Value not found " ) ;
				return ; 
			}
			temp.next = temp.next.next ; 
		}
	}
	void display() {
		Node1 temp = head ; 
		while ( temp != null ) {
			System.out.print(temp.val + " " ) ; 
			temp = temp.next ; 
		}
	}
}

class Link1 {
	public static void main(String[] args ) { 
		L l = new L() ; 
		l.add(5) ; 
		l.add(6) ; 
		l.add(7) ; 
		l.add(2) ; 
		l.add(0) ; 
		l.add(15) ; 
		l.add(61) ; 
		l.add(72) ; 
		l.add(23) ; 
		l.add(50) ;
		
		System.out.println("Original LinkedList " ) ; 
		l.display() ; 
		System.out.println() ; 

		System.out.println("After Delete " ) ;
		l.deleteVal(7);
		l.display() ; 

		System.out.println("After Delete " ) ;
		l.deleteVal(50);
		l.display() ;

		System.out.println("After Delete " ) ;
		l.deleteVal(5);
		l.display() ;

		System.out.println("After Delete " ) ;
		l.deleteVal(75);
		l.display() ;
	}
}