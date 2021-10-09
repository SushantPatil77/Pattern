package charpattern;

public class sub {

	static int min=Integer.MAX_VALUE;
	static int minindex=0;
	public static void main(String[] args) {
		int a[]= {3,7,90,20,5,50,40};	
		int k=3;
		
		avg(a,k,0);
		System.out.println(min+" "+minindex);
		
		
	}

	private static void avg(int[] a, int k, int i) 
	{
		int sum=0;
		for (int j = i; j <i+k; j++) 
		{
			sum=sum+a[j];
		}
		
		//System.out.println(sum);.
		if(min>sum/k)
		{
			min=sum/k;
			minindex=i;
		}
		i++;
		
		if(i<=a.length-k)
			avg(a, k, i);
	}
	

	

}
