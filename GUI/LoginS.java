import javax.swing.* ; 
class LoginS extends JFrame {
	LoginS(String str ) {
		super(str) ; 
	}
	LoginS(){} 
	void setComponents() {
		JLabel l1 = new JLabel("Welcome") ; 
		setLayout(null) ; 
		l1.setBounds(200,200,100,30);
		add(l1);
		
	}
public static void main(String[] args) {
	LoginS s1 = new LoginS("Gopal Kushwaha") ; 
	s1.setSize(600,600) ; 
	s1.setVisible(true);
	s1.setComponents() ; 
	s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
} 