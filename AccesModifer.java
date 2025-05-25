class A { 
static int x ; 
int y ; 

void myfun(){
System.out.println("In A block");
}
}
class AccesModifer{
public static void main(String[] args) {
System.out.println("Main block start" ) ;
A a = new A();
A a1 = new A() ; 
a.x = 5 ; 
a.y = 6 ; 
a1.x = 10 ; 

System.out.println(a.x) ; 
System.out.println(a.y) ; 
System.out.println(a1.y) ;
System.out.println(a1.x) ; 

System.out.println(a.x) ; 
System.out.println("Main block end" ) ; 
}
}