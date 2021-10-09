package charpattern;

import java.util.Scanner;

public class numPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input");
		int input=sc.nextInt();
		int count=1;
		int rank=input*input+1;
		int sub=input-1;
		for (int i = 0; i <input; i++) 
		{
			int rank1=rank;
			for (int j = 0; j < (input*2); j++) 
			{
				if(j-i>=0 && j<input)
					System.out.print(count+++" ");
				else if(j+i<=(input*2-1)&&j>=input)
				{
					System.out.print(rank1+++" ");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
			rank=rank-sub;
			sub--;
		}

	}

}
