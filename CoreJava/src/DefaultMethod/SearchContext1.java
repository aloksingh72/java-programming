package DefaultMethod;

public  interface SearchContext1 {
	public void findElement();
	default void start() {
		System.out.println("Start method default body");
	}
		default void drive() {
			System.out.println("Drive method default body");
		}
	

}
