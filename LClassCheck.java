class LClassCheck{
static void fun1() {
System.out.println("Class block A " ) ; 
}

void fun2(){
System.out.println(" Class block B " ) ; 
}

public static void main(String[] args) {
System.out.println("Main Block C " ) ; 
fun1() ; 
LClassCheck c = new LClassCheck() ; 
c.fun2();
}
}
 