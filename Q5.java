package lab2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the charge for the meal:");
		double charge=sc.nextDouble();
		double tax=(charge*6.75)/100;
		double total=charge+tax;
		double tip=(total*20)/100;
		double bill=total+tip;
		System.out.println("meal charge:"+charge);
		System.out.println("tax amount:"+tax);
		System.out.println("tip amount:"+tip);
		System.out.println("total bill:"+bill);
		

	}

}
