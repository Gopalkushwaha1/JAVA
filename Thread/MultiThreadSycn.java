import java.util.* ; 

class Account {
	int bal ; 
	Account(int a) {
		bal = a ;  
	} 
	Boolean check( int amt ) {
		return ( bal >= amt ) ? true : false ;
	}
	void Withdraw(int amt , String str ) {
		bal = bal - amt ; 
		System.out.println(str + " Transtation Sucessfull : " + amt ) ; 
		System.out.println(str + " Current balance : " + bal ) ; 
	} 
}
class Customer implements Runnable{
	Account a ; 
	String str ; 
	Customer( Account a , String str ) {
		this.a = a ; 
		this.str = str ; 
	}
	public void run() {
		Scanner sc = new Scanner(System.in) ; 
		synchronized(a) {
		System.out.println(str + " Enter Withdraw Ammount " ) ; 
		int amt = sc.nextInt() ; 
		if ( a.check(amt) ) {
			a.Withdraw(amt , str ) ; 
		}
		else {
			System.out.println("Insufficent Balance") ; 
		}
		}
	}
}
class MultiThreadSycn {
	public static void main(String[] args) {
		System.out.println("Main Block") ;
		Account a1 = new Account(1000) ; 
		Customer c1 = new Customer(a1 , "Gopal" ) ; 
		Customer c2 = new Customer(a1 , "Govoind" ) ; 
		Thread t1 = new Thread(c1) ; 
		Thread t2 = new Thread(c2) ;
		t1.start() ; 
		t2.start() ; 
	}
}