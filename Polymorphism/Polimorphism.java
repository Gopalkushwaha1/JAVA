class Thiskeyword {

	int x ; 
	int y ; 
	int p ; 
	int q ; 

	void f1(int x , int y ) {
		x = x ; 
		y = y ; 
	}
	void f2 ( int p , int q ) {
		this.p = p ; 
		this.q = q ; 
	}
 }

class Polimorphism {
	public static void main(String[] args) {
		Example e = new Example() ; 
		e.f1( 5 , 7 ) ; 
		System.out.println("Without this keyword " + e.x) ; 
		System.out.println("Without this keyword " + e.y) ;
		e.f2( 2 , 9 ) ; 
		System.out.println("With this keyword " + e.p ) ; 
		System.out.println("With this keyword " + e.q ) ;  
	}
}