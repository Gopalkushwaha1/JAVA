import javax.swing.* ; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


class LoginPage extends JFrame {
	JLabel l1 , l2 , l3 , l4 ; 
	JTextField t1,t2 ; 
	JButton b1 , b2 ; 
	LoginPage(String str ) {
		super(str) ; 
	}
	LoginPage(){} 

	void setComponents() {
		l1 = new JLabel("Welcome to Page" ) ; 
		l2 = new JLabel("USERNAME" ) ; 
		l3 = new JLabel("PASSWORD") ; 
		l4 = new JLabel("") ; 
		t1 = new JTextField() ; 
		t2 = new JTextField() ; 
		b1 = new JButton("Login") ; 
		b2 = new JButton("Clear") ; 
		setLayout(null) ; 
		add(l1) ; 
		add(l2) ; 
		add(l3) ; 
		add(l4) ; 
		add(t1) ; 
		add(t2) ; 
		add(b1) ; 
		add(b2) ; 
		l1.setBounds(100,50,300,20);
		l2.setBounds(100,200,100,20);
		l3.setBounds(100,350,100,20);
		l4.setBounds(100,550,100,20);
		t1.setBounds(350,200,100,20);
		t2.setBounds(350,350,100,20);
		b1.setBounds(200,450,100,20);
		b2.setBounds(400,450,100,20);
		b1.addActionListener(new Log());
		b2.addActionListener(new Clear() ) ; 
	}
class Log implements ActionListener {
	public void actionPerformed(ActionEvent el) {
		String s1 = t1.getText() ; 
		String s2 = t2.getText() ; 
		if(s1.equals("gopal") && s2.equals("1234")) {
			l4.setText("Login Succesful") ; 
		}
		else {
			l4.setText("Invalid Login") ; 
		}
	}
		
}
class Clear implements ActionListener {
	public void actionPerformed(ActionEvent el) {
		t1.setText(" ") ; 
		t2.setText(" " ) ; 
	}
		
}
	public static void main(String[] args) {
		LoginPage l = new LoginPage("Welcome to Login Page " ) ; 
		l.setSize(700,700) ; 
		l.setVisible(true) ;
		l.setComponents() ; 
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ; 
	}
} 