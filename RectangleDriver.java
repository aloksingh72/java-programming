class RectangleDriver{
public static void main (String[] args){
Rectangle r1 = new Rectangle();
Rectangle r2 = new Rectangle();
 r1.setValue(23,56.2);
r2.setValue(56,89.3);
System.out.println("the area of rectangle is:-");
r1.getArea();
System.out.println("the Perimeter of rectangle is:-");
r2.getPerimeter();
}
}