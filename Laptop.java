class Laptop{
String Comp_name;
String os;
int price;

Laptop(String Comp_name,String os,int price){
this.Comp_name= Comp_name;
this.os =os;
this.price=price;

}
public void getDetails(){
System.out.println("The company name  of Laptop is:- " +Comp_name );
System.out.println("Operating system is :-"+os);
System.out.println("the price is :-"+price);
}

}