package Acpt_no;

import java.util.Scanner;

public class input_from_user {
	public static int a,b;//variables
	static Scanner sc=new Scanner(System.in);
	public static void aceept() {//create method
		//get input from user
		System.out.println("Enter the value of a and b :");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	
}
