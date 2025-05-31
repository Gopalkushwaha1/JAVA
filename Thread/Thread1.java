import java.util.* ; 

class Bank {
	int bal ; 
	Bank( int bal ) {
		this.bal = bal ; 
	}
	Boolean check(int amt ) {
		return ( amt <= bal ) ? true : false ; 
	}
	void Withdraw( int amt , String str  ) {
		bal = bal - amt ; 
		System.out.println(str + " : Withdraw amount : " + amt ) ; 
		System.out.println(str + " : Current Amount : " + bal ) ; 
	}
}
class  Account implements Runnable { 
	Bank b ; 
	String str ; 
	Account(Bank x , String s) {
		b = x ; 
		str = s ; 
	}
	public void run() {
		Scanner sc = new Scanner(System.in) ; 
		synchronized(b) {
		System.out.println("Enter Amount Withdraw for : " + str + " "  ) ; 
		int amt = sc.nextInt() ; 
		if ( b.check(amt)) {
			b.Withdraw(amt , str) ; 
		}
		else { 
			System.out.println("Insuffient Balance for : " + str + " "  ) ; 
		}
		}
	}
}
class Thread1 { 
	public static void main( String[] args) {
		System.out.println("Main Block " ) ; 
		Bank b = new Bank(5000) ; 
		Account a1 = new Account(b , "Gopal" ) ; 
		Account a2 = new Account(b , "Govind" ) ;
		Thread t1 = new Thread(a1) ; 
		Thread t2 = new Thread(a2) ; 
		t1.start();
		t2.start() ; 
	}
} 
		
		

	