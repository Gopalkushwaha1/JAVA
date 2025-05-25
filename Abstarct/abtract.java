abstract class A {
	int x , y ; 
	void f1() {
		x = 5 ; 
		y = 2 ; 
	}
	abstract void f2() ; 
	
	A() {
		System.out.println("Parent class " ) ; 
	}
}
class B extends A {
	int z ; 
	void f3() {
		z = 7 ; 
	}
	void f2() {
		
	}
	B() {
		System.out.println("Child class " ) ; 
	}
}
class abtract {
	public static void main(String[] args) {
		System.out.println("Abstarct class " ) ; 
		B a = new B() ; 
	}
}