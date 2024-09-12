package Has_A_Relationship_Composition;

public class Car {
	String name;
	Engine e = new Engine(180);
	Car(){
		//no-arg Constructor
	}
	Car(String name){
		this.name = name;
	}
	Car(String name,Engine e){
		this.name=name;
		this.e =e;
		
		
	}

}
