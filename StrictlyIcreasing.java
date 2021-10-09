package charpattern;

import java.util.Arrays;

public class StrictlyIcreasing 
{
	static int count2=0;
	public static void main(String[] args) 
	{
		int[] a= {1, 2, 4, 0, 2};
		int inele=0;
		int deele=0;
		if(a[0]<a[1])
		{
			inele=a[0];
			deele=a[1];
		}
		else
		{
			inele=a[1];
			deele=a[0];
		}
		/*int incount=1;
		for(int i=2;i<a.length;i++)
		{
			if(inele<a[i])
			{
				inele=a[i];
				incount++;
			}
		}*/
		
		int incount=count(a,2,1,inele);
		int[] inarray=new int[incount];
		int[] dearray=new int[a.length-incount];
		inele=0;
		deele=0;
		
		if(a[0]<a[1])
		{
			inele=a[0];
			inarray[0]=inele;
			deele=a[1];
			dearray[0]=deele;
		}
		else
		{
			inele=a[1];
			inarray[0]=inele;
			deele=a[0];
			dearray[0]=deele;
		}
	//	int index1=1;
	//int index2=1;
		/*for(int i=2;i<a.length;i++)
		{
			if(inele<a[i])
			{
				inele=a[i];
				inarray[index1++]=a[i];
			}
			else if(deele>a[i])
			{
				deele=a[i];
				dearray[index2++]=a[i];
			}
			else
			{
				System.out.println(-1);
				break;
			}
		}*/
		
		putvvalues(a,2,inarray,dearray,1,1,inele,deele);
		System.out.println(Arrays.toString(inarray));
		System.out.println(Arrays.toString(dearray));

		
	}

	private static void putvvalues(int[] a, int i, int[] inarray, int[] dearray, int index1, int index2 , int inele, int deele) 
	{
		if(inele<a[i])
		{
			inele=a[i];
			inarray[index1++]=a[i];
		}
		else if(deele>a[i])
		{
			deele=a[i];
			dearray[index2++]=a[i];
		}
		else
		{
			count2++;
		}
		i++;
		if(count2==0)
		{
		if(i<a.length)
			putvvalues(a, i, inarray, dearray, index1, index2, inele, deele);
		}
		else
			System.out.println(-1);
	}

	private static int count(int[] a, int i, int count, int inele) 
	{
		if(inele<a[i])
			
		{
			inele=a[i];
			count++;
		}
		i++;
		if(i<a.length)
			return count(a, i, count, inele);
		return count;
	}
}
