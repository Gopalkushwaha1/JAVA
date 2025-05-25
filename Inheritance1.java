class A {
int x = 20 ; 
void m1(){
System.out.println("m1 in class A " ) ; 
}
}

class B extends A {
void m1(){
System.out.println("m1 in class B " ) ; 
}
 int x = 30 ; }


class Inheritance1{

public static void main(String[] args) {

A a1 = new A() ; 
a1.m1() ; 
System.out.println("A class Object and class  " + a1.x) ; 

B b1 = new B() ; 
b1.m1();
System.out.println("B class Object and class  "  + b1.x) ;

A a2 = new B() ; 
a2.m1();
System.out.println("Class paraent A  Object size B  " + a2.x) ; 

 
}

}