import java.util.*;
import java.io.* ; 

class FileH2 {

	public static void main( String[] args ) throws IOException{
		 File f1 = new File("a.txt");
		 f1.createNewFile() ; 
		 System.out.println(f1.exists()) ; 
	}
}