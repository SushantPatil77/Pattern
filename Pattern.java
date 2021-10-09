package all;

public class Pattern {

	public static void main(String[] args) {
		int count=1;
	for (int i = 0; i <7; i=i+2) 
	{ 
		int count1=count;
		for (int j = 0; j <7; j++) 
		{
			if(j-i<=0)
				{
				   System.out.print(count1);
				   if(j<i/2)
				   
					   count1--;
					   else
						   count1++;
				   
				  
				}
			else
				System.out.print(" ");
		
	} 
		count++;
		
		System.out.println();
	}

}
	}