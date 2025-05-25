class Nokia 
{

int mic ; 
int speaker ; 
int radio ; 

void setData()
{
System.out.println("Parent class : " ) ; 
}

void Display()
{
System.out.println("Parent class : " ) ; 
}

}

class tecno extends Nokia 
{
int sensor ;
int music ; 

void f1()
{
System.out.println("Child class : " ) ; 
}

void f2() 
{
System.out.println("Child class : " ) ; 
}

}

public class Inheritance
{

public static void main(String[] args) 
{
Nokia n = new Nokia() ; 
n.Display() ; 

tecno t = new tecno() ; 
t.f1();
t.Display() ; 

}


}