package lab2;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of male:");
		double male=sc.nextDouble();
		System.out.print("Enter number of female:");
		Double female=sc.nextDouble();
		double class1=male+female;
		double percentmale=(male/class1)*100;
		double percentfemale=(female/class1)*100;
		System.out.println("Percentage of male in the class:"+percentmale);
		System.out.println("Percentage of female in the class:"+percentfemale);

	}

}
