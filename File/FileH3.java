import java.util.*;
import java.io.* ; 

class FileH3 {

	public static void main( String[] args ) throws IOException{
		FileOutputStream f1 = new FileOutputStream("a.txt") ; 
		String str = "Gopal Kushwaha" ; 
		char[] ch = str.toCharArray() ; 
		for ( int i = 0 ; i < str.length() ; i++ ) {
			f1.write(ch[i]) ; 
		}
		f1.close() ;  
	}
}