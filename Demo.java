class Gopal{
void fun(){
System.out.print("Instance" + " ");
}
static void fun1(){
System.out.print("Static" + " ") ;
}
}

class Demo {
public static void main(String[] args){
Gopal.fun() ; 
}
}