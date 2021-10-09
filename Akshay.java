package charpattern;

public class Akshay 
{
	public static void main(String[] args) 
	{
		int count=1;
		
		for(int i=0;i<5;i++)
		{
			int diff=4;
			int count1=count;
			for(int j=0;j<5;j++)
			{
				if(j-i<=0)
				{
					System.out.print(count1+" ");
				}
				count1=count1+diff;
				diff--;
			}
			System.out.println();
			count++;
		}
	}
}
