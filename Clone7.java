package edu.in;

public class Clone7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[][] = {{1,2,3,4,5},{6,7,8,9,10}};
		int cloneArray[][] = intArray.clone();
		System.out.println(intArray[0]==cloneArray[0]);
		System.out.println(intArray[1]==cloneArray[1]);
	}

}
