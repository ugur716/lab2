package lab2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter numbers:");
		int num=sc.nextInt();
		 int sum=0;
		do {
			System.out.print("Enter numbers:");
			 num=sc.nextInt();
	        sum+=num;
			
			
			
		}while(num>0); {
			
			System.out.println("Sum of integers "+sum);
		}
	}

}
