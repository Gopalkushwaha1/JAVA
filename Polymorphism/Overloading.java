class A {
	void f1 () {
		System.out.println("Class A with f1 function " ) ; 
	}
	void f1 (int x ) {
		System.out.println("Class A with f1 funcation with parameter " ) ; 
	}
}
class Overloading {
	public static void main( String[] args ) {
		A a = new A() ; 
		a.f1() ; 
		a.f1(5) ; 
	}
}