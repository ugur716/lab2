package lab2;

import java.util.Scanner;



public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number:");
		int max=sc.nextInt();
		int min=max;
		int a=1;
		
		while(a==1) {
			
			System.out.print("Enter the next number:");
			int numNext=sc.nextInt();
			if(max>=numNext) {
				if(numNext<=min) {
					min=numNext;
				}
				
			}else {
				max=numNext;
			}
			System.out.print("Do you want to enter another number: 0-No, 1-Yes");
			a=sc.nextInt();
		}
		System.out.println("Smallest number is:"+min);
		System.out.println("Largest number is:"+max);
		
	}

}
