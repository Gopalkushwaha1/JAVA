class Try {

static void myfun(){
System.out.println("Static function call ") ; 
}

}

class Try2 {

void myfun(){
System.out.println("Without static call ") ; 
}

} 



class Demo2{

public static void main(String[] args){
System.out.println("Main block");
Try2 obj = new Try2() ; 
obj.myfun();
Try.myfun();
}
}

