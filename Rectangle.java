class Rectangle{
double length;
double width;

public void setValue(double length,double width){

this.length = length;
this.width = width;

}

public void getArea(){
double Area = length * width;
System.out.println("the area of and " +Area);
}
public void getPerimeter(){
double Perimeter = 2*(length+width);
System.out.println("The Perimeter is "+Perimeter);
}

}

