package charpattern;

public class demo {

	public static void main(String[] args) {
		
		int a[]= {3,7,90,20,5,50,40};	
		int k=3;
//		int min=Integer.MAX_VALUE;
//		int index=0;
//		for (int i = 0; i <= a.length-k; i++) 
//		{
//			int sum=0;
//			for (int j = i; j <i+k; j++) {
//				sum=sum+a[j];
//			}
//		if(min>sum/k)
//		{
//			min=sum/k;
//			index=i;
//		}
//		}
//		System.out.println(min +" "+index);
		
		
//	
		int min=Integer.MAX_VALUE;
		int minIndex=0;
		
		for (int i = 0; i < a.length-k; i++)
		{
			int sum=0;
			for (int j =i ; j <i+k; j++) 
			{
				sum=sum+a[j];
			}
			//System.out.println(sum);
			if(min>sum/k)
			{
				min=sum/k;
				minIndex=i;
				
			}
		}
		System.out.println(min+" "+minIndex+" ");
	}

	}


