
public class ClassD extends ClassC {
	int x =120;
	int s=70;
	public void test() {
		System.out.println("this is test method");
		int x = 200;
		int t = 100;
		System.out.println("local t is "+t);
		System.out.println("s of D  is "+s);
		System.out.println("r of C is "+r);
		System.out.println("q of B is "+q);
		System.out.println("p of A is "+p);
		System.out.println("Local x is "+x);
		System.out.println("Global x is "+this.x);
		System.out.println("Global x of c is"+super.x);
		System.out.println("Global x of b is"+getXofB());
		System.out.println("Global x of a is "+getXofA());
		
	}

}
