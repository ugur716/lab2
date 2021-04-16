package lab2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of ate cook:");
		double numOfcook=sc.nextDouble();
		
		double cookinserving=40/10;
		double cal=(numOfcook/cookinserving)*300;
		System.out.println("total of calori: "+cal);
		
		
		
		
		

	}

}
