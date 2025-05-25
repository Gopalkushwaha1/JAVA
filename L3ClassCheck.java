class try1{

static void fun1() {
System.out.println("Outer CLass block X " ) ; 
}

void fun2(){
System.out.println("Outer Class block Y " ) ; 
}

}

class L3ClassCheck{

public static void main(String[] args) {

System.out.println("Main Block M " ) ; 
try1.fun1() ;  
}

}
 