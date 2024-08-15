//Dated:- 15-Aug-2024
class Employ{
String name;
int id;
double sal;
public void setValue(String n,int i,double s){
name=n;
id=i;
sal=s;
}
}

class EmployDriver{
public static void main(String[] args){
Employ e1 =new Employ();
Employ e2 = new Employ();
Employ e3 = new Employ();

//e1.name="mohan";
//e1.id = 123;
//e1.sal=234.98;
e1.setValue("Mohan",123,234.87);
e2.setValue("Sohan",1423,2634.87);

System.out.println(e1.name);
System.out.println(e1.id);
System.out.println(e1.sal);
System.out.println("=========");
System.out.println(e2.name);
System.out.println(e2.id);
System.out.println(e2.sal);



}
}