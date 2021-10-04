package pattern;



public class patternPractices {

	public static void main(String[] args) {
		/*Q1.
		  for (int i = 0; i <5; i++) 
		{
			for (int j = 0; j <5; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		/* Q2.
		 * for (int i = 0; i <5; i++)
		 
		{
		  for (int j = 0; j <5; j++)
		  {
			  if(j+i<=4)
				  System.out.print("*");
			  else
				 System.out.print(" ");
			}
		  System.out.println();
		}
		*/
		/*Q3  
		 * for (int i = 0; i <5; i++)
		 
		{ 
			for (int j = 0; j <5; j++)
			{
				if(j-i>0)
				System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}  */
		
		/*for (int i = 0; i <9; i++) 
		{for (int j = 0; j <5; j++)
		{
			if(j-i<=0 && j+i<=8)
				System.out.print("*");
			else
				System.out.print(" ");
		}
			System.out.println();
		}  */
    
		/*
		 *Q6. 
		 for (int i = 0; i <5; i++)
		{ 
			for (int j = 0; j <5; j++)
			{ 
				if(j+i>=4)
					System.out.print("*");
				else
					System.out.print(" ");
				} System.out.println();
			}*/
		/* Q 7
		 for (int i = 0; i <5; i++)
		{ for (int j = 0; j <5; j++)
		{
			if(j-i>=0)
				System.out.print("*");
			else
				System.out.print(" ");
		}
			System.out.println();
		}*/
		
		/*Q4 for (int i = 0; i <9; i++) 
		{for (int j = 0; j < 5; j++)
		{
			if(j-i>0||j+i>8)
				System.out.print(" ");
			else
				System.out.print("*");
		
		} System.out.println();
			
		} */
		/* Q5
		 *  for (int i = 0; i <9; i++)
		 
		 {for (int j = 0; j <5; j++)
		 {
			  if(j+i<=4 || j-i<=-4)
				  System.out.print("*");
			  else
				  System.out.print(" ");
			}System.out.println();
			
		}*/
		/*Q9
		  for (int i = 0; i <5; i++)
		 
		{ for (int j = 0; j < 5; j++)
		{ 
			if(j+i>=4)
				System.out.print("* ");
			else
				System.out.print(" ");
			}System.out.println();
			
		}*/
       /*for (int i = 0; i <9; i++) 
       {
    	   for (int j = 0; j <5; j++)
       {
    		   if(j+i>=4 && j-i>=-4 )
    			   System.out.print("*");
    		   else
    			   System.out.print(" ");
		}System.out.println();
		
	}*/
		 /*Q10.
		  *  for (int i = 0; i <5; i++)
		{
			for (int j = 0; j <9; j++)
			{
				if(j+i>=4 &&j-i<=4)
					System.out.print("*");
				else
					System.out.print(" ");
		    }System.out.println();
			
		}*/
  
		/*Q11.for (int i = 0; i < 5; i++) 
		{ 
			for (int j = 0; j <5; j++)
			{
				if(j-i>=0)
					System.out.print("* ");
				else
					System.out.print(" ");
			}System.out.println();
			
			}*/
		 for (int i = 0; i <9; i++)
		 { 
			 for (int j = 0; j <9; j++)
			 {
                  if(j-i<0 && j<4)
                	  System.out.print(" ");
                  else if(j-i>0 && j>4)
                	  System.out.print(" ");
                  else
                	  System.out.print("*");
			}System.out.println();
			
		}
	
		
		
		
		 

		
	}

}
