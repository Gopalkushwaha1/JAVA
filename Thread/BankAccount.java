import java.util.* ; 

class Account {
	int bal ; 
	Account( int b ) {
		bal = b ; 
	}

	boolean isSufficent(int widraw ) {
		if ( bal > widraw ) {
			return true ;
		}
		else {
			return false ; 
		} 
	}
	void withdraw ( int amt ) {
		bal = bal - amt ; 
		System.out.println("Withdraw Succesfull :: " + amt ) ; 
		System.out.println("Current balance :: " + bal ) ; 
	}  
}
class Customer implements Runnable {
	Account a1 ; 
	Customer(Account x1) {
		a1 = x1 ; 
	}	
	public void run() {
		Scanner sc = new Scanner(System.in) ; 
		System.out.println("Enter withdraw amount : " ) ; 
		int amt = sc.nextInt() ; 
		if ( a1.isSufficent(amt) ) {
			a1.withdraw(amt) ; 
		}
		else {
			System.out.println("Insufficent Balance : " ) ; 
		}
	}
}

class BankAccount {
	public static void main ( String[] args ) {
		System.out.println("Bank Balance is :: 5000 " ) ; 
		Account a = new Account(5000) ; 
		Customer c1 = new Customer(a) ; 
		Customer c2 = new Customer(a) ;
		Thread t1 = new Thread(c1) ; 
		Thread t2 = new Thread(c2) ; 
		t1.start() ; 
		t2.start() ; 
		
	}
}	