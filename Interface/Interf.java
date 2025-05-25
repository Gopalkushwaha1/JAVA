interface i1 { 
	int x = 0 ; 
	int y = 6 ; 
	int z = 12 ; 
	
	static void f1() {
		System.out.println("Interface block " ) ; 
	}
}
interface i2 extends i1 {
	int x = 7 ; 
	int y = 9 ; 
	static void f1() {
		System.out.println("Interface block " ) ; 
	}
	
}
class A implements i2 {
	// int x = 1 ; 
	// int y = 2 ; 	
	static void f1() {
		System.out.println("Class block " ) ; 
	}
}
class Interf {
	public static void main(String[] args ) {
		System.out.println("Gopal" ) ; 
		i1.f1() ; 
		i2.f1() ;
		// i2.f1() ; give error because static method not inherit ( if we not create f1 method in i2 interface  
		A a = new A() ;
		A.f1() ;  
		System.out.println(a.z) ; 
		 
	}
}