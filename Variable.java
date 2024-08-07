class Variable{
/*
public static void test(){
int a = 10;
System.out.println("a from test is" +a);
}
*/
// its having a global scope it can be acess from anywhere inside the code.
int x=12;

public void sum(){
int sum =0;
int a=8;
int b=9;
sum = a + x;
System.out.println("this is sum of two number"+sum);
}

public static void main(String[] args){
//System.out.println("this is main method");
//test();
System.out.println("this is calling of non-static  method");
Variable add= new Variable();
add.sum();




}
}