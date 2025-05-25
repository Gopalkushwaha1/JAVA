class Demo
{
int x ; 
int y ; 

Demo( int p , int q ) 
{
x = p ; 
y = q ; 
}

}

class C 
{
public static void main( String[] args ) 
{
Demo d = new Demo(5,7) ; 
Demo d2 = new Demo(3,6) ; 
System.out.println(d.x) ; 
System.out.println(d.y) ; 
}
}