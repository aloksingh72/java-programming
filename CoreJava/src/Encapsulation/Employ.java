package Encapsulation;

import java.util.Scanner;

public class Employ {
	private int s_pin =2231;
	private String name;
	private int id;
	 private double sal;

// -->getters method
public String getName() {
	//validation
	return name;
}
public int getId() {
	//validation
	return id;
}
public double getSal() {
	// validation
	return sal;
}

//----> setters method
public void setName(String name) {
	//validation
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the user pin:");
	int u_pin = sc.nextInt();
	if(s_pin == u_pin) {
		System.out.println("validation successful");
		this.name = name;
		
		
	}
	else {
		System.out.println("Invalid user's"); 	
	}
	
	sc.close();
}
public void setId(int id) {
	//validation
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the user pin:");
	int u_pin = sc.nextInt();
	if(s_pin == u_pin) {
		System.out.println("validation successful");
		this.id = id;
		
		
	}
	else {
		System.out.println("Invalid user's"); 	
	}
	
	sc.close();
	
}
public void setSal(double sal) {
	//validation
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the user pin:");
	int u_pin = sc.nextInt();
	if(s_pin == u_pin) {
		System.out.println("validation successful");
		this.sal = sal;
		
		
	}
	else {
		System.out.println("Invalid user's"); 	
	}
	
	sc.close();
	
}



	
	
	

}
