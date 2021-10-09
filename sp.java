package charpattern;

import java.util.Arrays;

public class sp {

	public static void main(String[] args) {
		int[] a= {5, 1, 3, 6, 8, 2, 9, 0, 10};
		int inele=0;
		int dele=0;
		if(a[0]>a[1])
		{
			inele=a[1];
		    dele=a[0];	
		}else
		{
			inele=a[0];
			dele=a[1];
		}
	/*	int count=1;
		for (int i = 2; i < a.length; i++) 
		{
			if(inele<a[i])
			{
				inele=a[i];
				count++;
			}
		}
		System.out.println(count);*/
		
	int incount=  count(2,1,a,inele);
	int inarray[]=new int[incount];
	 int decarray []=new int [a.length-incount];
	// System.out.println(Arrays.toString(inarray));
	// System.out.println(Arrays.toString(decarray));
	//	System.out.println(incount);
		
		int index1=1;
		int index2=1;
		
		if(a[0]>a[1])
		{
			inele=a[1];
		    inarray [0]=a[1];
		    dele=a[0];
		    decarray [0]=a[0];
		}else
		{
			inele=a[0];
			inarray[0]=a[0];
			dele=a[1];
			decarray[0]=a[1];
		}
		
		
		
		
		
		
		
		
		
		
		for (int i = 0; i < a.length; i++) 
		{
			if(inele<a[i])
			{
				inele=a[i];
				inarray[index1++]=a[i];
			}else if(dele>a[i])
			{
				dele=a[i];
				decarray[index2++]=a[i];
				
			}else 
				
			{
				System.out.println("No such sequences possible.");
			}
			
			
		}
		System.out.println(Arrays.toString(inarray));
		System.out.println(Arrays.toString(decarray));

	}

	private static int count(int i, int count, int[] a, int inele) 
	{
		
		if(inele<a[i])
		{
			inele=a[i];
			count++;
		}
		i++;
		if(i<a.length)
		return count(i, count, a, inele);
		return count;
		
		
	}

}
