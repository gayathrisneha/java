package edu.in;

public class Ex14 {
	String name;
	long population;
	void display() {
		System.out.println("City name:"+name);
		System.out.println("Population:"+population);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex14 metro1,metro2;
		metro1 = new Ex14();
		metro2 = new Ex14();
		
		metro1.name = "Mumbai";
		metro1.population = 23409876;
		System.out.println("Details of metro city 1:");
		metro1.display();
		
		
		metro2.name = "pune";
		metro2.population = 45874294;
		System.out.println("Details of metro city 2:");
		metro2.display();

	}

}
