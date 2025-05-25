class A {
	int x ; 
	int y ; 

	void f1 ( int x , int y ) {
		this.x = x ; 
		this.y = y ; 
	}
	void display() {
		System.out.println("Parent class " + x ) ; 
		System.out.println("Parent class " + y ) ; 
	}
}
class B extends A {
	int x ; 
	int y ; 

	void f1 ( int x , int y ) {
		this.x = x ; 
		this.y = y ; 
		super.x = x ; 
		super.y = y ; 
	}
	void display() {
		System.out.println("Parent class " + x ) ; 
		System.out.println("Parent class " + y ) ; 
	}	
}
class SuperKeyword {
	public static void main(String[] args ) {
		A a = new A() ; 
		B b = new B() ; 

		a.f1( 1 , 2 ) ;

		System.out.println("Value pass in Parent class not to Child class " ) ; 
		a.display();
		b.display() ; 

		b.f1( 3 , 4 ) ;

		System.out.println("Value pass in child class not to Parent class " ) ; 
		a.display();
		b.display() ;
 

	}
}