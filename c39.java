package charpattern;

public class c39 {

	public static void main(String[] args) {
		for (int i = 0; i <9; i+=2)
		{    
			int count=0;
			for (int j = 0; j <9; j++)
			{ 
				if(j-i<=0)
					System.out.print((char)(count+65));
				if(j<i/2)
				count++;
				else
					count--;
				}
			System.out.println();
		}


	}

}
