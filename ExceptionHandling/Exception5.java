import java.io.* ; 

class Exception5 {
	public static void main(String[] args) {
		System.out.println("Main Block") ; 
		try {
			throw new IOException("Error Occer" ) ;
		} 
		catch(IOException e1) {
			System.out.println(e1.getMessage() ) ; 
		}
	}
}
		