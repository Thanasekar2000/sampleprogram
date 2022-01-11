package testing;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem1,rem2,rem3,rem4,sum;
		Scanner s=new Scanner(System.in);
		   System.out.println("Enter the Number:");
		   int num=s.nextInt();
		   
		   rem1=num%3;
		   rem2=num%7;
		   rem3=num%17;
		   rem4=num%25;
		   
		   sum=rem1+rem2+rem3+rem4;
	System.out.println("Reminder1: "+rem1);
	System.out.println("Reminder2: "+rem2);
	System.out.println("Reminder3: "+rem3);
	System.out.println("Reminder4: "+rem4);
	System.out.println("Sum of Reminder: "+sum);
	
	if(sum%2==0)
	{
		System.out.println(sum+" is Even Number");
	}
	else
	{
		System.out.println(sum+" is odd Number");
	}
	}

}
