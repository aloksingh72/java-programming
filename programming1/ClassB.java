public class ClassB extends ClassA {

static {
    System.out.println("Class B static block");
}
{
    System.out.println("Class B non-static block");
}




    ClassB(){
        System.out.println("Class B No-args Constructor");
    System.out.println(this.a);
        
    }
    
    
    
}
