package pattern;

public class p25 {

	public static void main(String[] args) {
		for (int i = 0; i <9; i++)
		{
			for (int j = 0; j <10; j++)
			{
				if(j-i>0 && j+i<9)
					System.out.print(" ");
				else if(j+i>8 && j-i<1)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
