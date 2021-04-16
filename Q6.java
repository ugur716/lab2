package lab2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount of purchase:");
		double purchase=sc.nextDouble();
		double statetax=(purchase*4)/100;
		double countytax=(purchase*2)/100;
		double totaltax=statetax+countytax;
		double totalsale=purchase+totaltax;
		System.out.println("amount of purchase:"+purchase);
		System.out.println("amount of countytax:"+countytax);
		System.out.println("amount of totaltax:"+totaltax);
		System.out.println("amount of totalsale:"+totalsale);
		

	}

}
