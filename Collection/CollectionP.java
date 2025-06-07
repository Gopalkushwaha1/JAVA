import java.util.* ; 

class CollectionP {
	public static void main(String[] args) {
		System.out.println("Main block") ; 
		LinkedList l1 = new LinkedList() ; 
		l1.addFirst("Gopal") ; 
		l1.addLast("Kushwaha") ; 
		System.out.println(l1.get(1)) ; 
		System.out.println(l1.getFirst()) ; 
		System.out.println(l1.getLast()) ; 
	}
}