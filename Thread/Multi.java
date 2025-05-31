class P1 implements Runnable { 
	public void run() {
		for( int i = 0 ; i < 10 ; i++ ) {
			System.out.println("Process 1 : " + i ) ; 
		}
	}
}

class P2 implements Runnable {
	public void run() {
		for( int i = 0 ; i < 10 ; i++ ) {
			System.out.println("Process 2 : " + i ) ; 
		}
	}
}

class Multi {
	public static void main (String[] args) {
		System.out.println("Main function " ) ; 
		P1 p1 = new P1() ; 
		P2 p2 = new P2() ; 
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		t1.start() ; 
		t2.start() ; 
	}
}