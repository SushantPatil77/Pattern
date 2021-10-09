package charpattern;

public class c71 {

	public static void main(String[] args) {
	
		for (int i = 0; i <12; i=i+2)
	     { 
	    	 for (int j = 0; j <12; j++)
	    	 { 
	    		 if(j-i<=0)
	    			 System.out.print("*");
	    		 else
	    			 System.out.print(" ");
				
			}
	    	 System.out.println();
			
		}


	}

}
