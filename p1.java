package pattern;

import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
	 Scanner sc=new Scanner (System.in);
	 System.out.println("Enter a num=");
	 int num=sc.nextInt();
	 System.out.println("Enter a last num= ");
	 int num2=sc.nextInt();
	 sc.close();
	 for (int i = num; i <num2; i++) 
	 {
		 if(i%10==7)
			 System.out.println(i);
		
	}
 
	}

}
