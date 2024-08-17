class Circle{
double r;

public void setValue(double radius){
this.r = radius;
}

public void getArea(){
double Area = Math.PI*r*r;
System.out.println("The Area of circle is :-" +Area);
}
public void getCircum(){
double Circum = 2*3.14*r;
System.out.println("The circumference is " +Circum);
}


}