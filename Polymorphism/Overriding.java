class A {
	void f1() {
		System.out.println("Parent class f1 function " ) ; 
	}
}
class B extends A {
	void f1() {
		super.f1() ; 
		System.out.println("Child class f1 function " ) ; 
	}
}
class Overriding {
	public static void main( String[] args ) {
		System.out.println("Without overriding function call " ) ;
		A a = new A() ; 
		B b = new B() ; 
		
		a.f1() ;
		b.f1() ; 
		
	}
}