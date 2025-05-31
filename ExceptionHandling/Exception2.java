class Exception2 {
	public static void main(String[] args) {
		System.out.println("Main Block") ;
		try {  
			int x = 6/0 ;
		} 
		catch(NullPointerException e1) {
			System.out.println(e1.getMessage()) ; 
		}
			
		finally {
			System.out.println("Gopal") ; 
		}
		
	}
}