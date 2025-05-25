class try1{

static void fun1() {
System.out.println("Outer CLass block A " ) ; 
}

void fun2(){
System.out.println("Outer Class block B " ) ; 
}

}

class L2ClassCheck{

static void fun1() {
System.out.println("Class block A2 " ) ; 
}

void fun2(){
System.out.println("Class block B2 " ) ; 
}

public static void main(String[] args) {

System.out.println("Main Block C " ) ; 
fun1() ; 
LClassCheck c = new LClassCheck() ;
L2ClassCheck c1 = new L2ClassCheck() ;
c1.fun2(); 
c.fun2();
}

}
 