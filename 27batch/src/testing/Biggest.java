package testing;
import java.util.Scanner;
public class Biggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner s=new Scanner(System.in);
   System.out.println("Enter first Number:");
   int a=s.nextInt();
   Scanner s1=new Scanner(System.in);
   System.out.println("Enter second Number:");
   int b=s1.nextInt();
   Scanner s2=new Scanner(System.in);
   System.out.println("Enter first Number:");
   int c=s2.nextInt();
   if(a>b) 
   {
	   if(a>c){
	   System.out.println(a+" is Biggest Number");
	   }
	   else
	   {
	   System.out.println(c+" is Biggest Number");
	   }
   }
   else if(b>c){
	   System.out.println(b+" is Biggest Number");
   }
   else {
	   System.out.println(c+" is Biggest Number");
   }
}
}

