package charpattern;

public class rec {
	
	static int min=Integer.MAX_VALUE;
	static int index=0;
	public static void main(String[] args) {
		int a[]= {3,7,90,20,5,50,40};	
		int k=3;
		avg(a,k,0);
		System.out.println(min +" "+index);
	}

	private static void avg(int[] a, int k, int i) {
		
		int sum=0;
		for (int j = i; j <i+k; j++) 
		{
			sum=sum+a[j];
		}
		if(min>sum/k)
		{
			min=sum/k;
			index=i;
		}
		i++;
		if(i<=a.length-k)
			avg(a,k,i);
		
	}

}
