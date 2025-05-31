class Expection {
	public static void main ( String[] args) {
		System.out.println("Main Block" ) ;
		try {
			String s = null ;
			int x = s.length() ;
		}
		catch ( NullPointerException e1 ) {
			System.out.println(e1.getMessage()) ; 
		} 
		System.out.println("B") ; 
		try {
			int x = 5/0 ; 
		}
		catch( ArithmeticException e1 ) {
			System.out.println(e1.getMessage() ) ; 
		}
		System.out.println("C") ;
	}
}