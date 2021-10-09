package charpattern;

public class e31 {

	public static void main(String[] args) {
		for (int i = 0; i <6; i++)
		{
			for (int j = 0; j <6; j++) 
			{
				if(j+i>=5)
					System.out.print((char)(i+j-5+65)+" ");
				else
					System.out.print(" ");
			}
		
				System.out.println();
		}

	}

}
