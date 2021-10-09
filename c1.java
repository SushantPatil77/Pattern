package charpattern;

public class c1 {

	public static void main(String[] args) {
	/* for (int i = 0; i <5; i++)
	 {
		 for (int j = 0; j <5; j++)
		 {
			 if(j-i<=0)
             System.out.print((char)(j+65));	
			 else
				 System.out.print(" ");
		}
		 System.out.println();
		
	 
	}*/
	
	/*	for (int i = 0; i <5; i++)
		{ 
			for (int j = 0; j <5; j++)
			{ 
				if(j-i<=0)
					System.out.print((char)(i+65)); 
				else
				System.out.print(" ");
				
			}
			System.out.println();
			
		}*/
      
	/*	for (int i = 0; i <9; i++)
		{ 
			for (int j = 0; j <5; j++)
			{ 
				if(j-i<=0 && i<5)
					System.out.print((char)(i+65));
				else if(j+i<=8 && i>=5)
					System.out.print((char)(8-i+65));
				else
					System.out.print(" ");
					
				
			}
			System.out.println();
			
		}*/
		/*for (int i = 0; i <12; i++)
		{ 
		  for (int j = 0; j <6; j++)
		  {
			  if(j+i<=5||j-i<=-6)
				  System.out.print((char)(j+65));
			  else
				  System.out.print(" ");
			
		}System.out.println();
			
		}*/
		
	/*	for (int i = 0; i <12; i++) 
		{
			for (int j = 0; j <6; j++)
			{
			if(j+i<=5)
				System.out.print((char)(5-i+j+65));
			else if(j-i<=-6)
				System.out.print((char)(i-j-6+65));
			else
				System.out.print(" ");
			}
			System.out.println();
			
		}*/
	/*for (int i = 0; i <6; i++)
	{
		for (int j = 0; j <6; j++) 
		{ 
			if(j+i>=5)
				System.out.print(j+);
			else
				System.out.print(" ");
			
		}
		System.out.println();
		
	}
	
	*/ 
	/*	int counter1=0;
		for (int i = 0; i <6; i++)
		{  
			int counter2=counter1;
			for (int j = 0; j <6; j++)
			{  
				if(j-i<=0)
					System.out.print((char)(counter2+65));
				else
					System.out.print(" ");
				counter2=5+counter2;

			}
			counter1++;
			System.out.println();
			
		}*/
		
	/*	for (int i = 0; i <9; i=i+2)
		{ 
			for (int j = 0; j <9; j++) 
			{
				if(j-i<=0)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}System.out.println();
			
		}*/
		for (int i = 0; i <9; i=i+2)
		{  
			int counter=1;
			for (int j = 0; j <9; j++)
			{
				if(j-i<=0)
					{
					if(j==i/2)
					{		
					System.out.println(counter);
					counter++;
					}
					}
			}
			
		}
	}
	}
