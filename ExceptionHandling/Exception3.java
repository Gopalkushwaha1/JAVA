class Exception3 {
	public static void main(String[] args) {
		System.out.println("Main Block") ; 
		int currentBalance = 100 ; 
		int withdraw = 500 ; 

		try {
			if ( currentBalance < withdraw ) {
				throw new ArithmeticException("Insufficient Balance. " ) ; 
			}
		currentBalance = currentBalance - withdraw ; 
		System.out.println("Transaction Successful") ; 
		System.out.println("Current Balance is : " + currentBalance ) ;
		}
		catch (ArithmeticException e1 ) {
			System.out.println(e1.getMessage() ) ;
			System.out.println("Current Balance : " + currentBalance ) ;  
		} 
	}
}