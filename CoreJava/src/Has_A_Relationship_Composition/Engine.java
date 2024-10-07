package Has_A_Relationship_Composition;

public class Engine {
	int hp;
	public void start() {
		System.out.println("Start the Engine");
	}
	Engine(){
		
	}
	Engine(int hp){
		this.hp =hp;
	}

}
