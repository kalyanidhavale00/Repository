import java.util.*;
class OpeartionArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		int a[]=new int[20];
		int pos=0,neg=0,odd=0,even=0,zero=04;
		System.out.println("enter the element in an array");
		for(int i=0;i<20;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Elements in an array is:");
		for(int i=0;i<20;i++)
		{
			System.out.print(a[i]+"\t");
		}
		//number of positive number
		System.out.println();
		System.out.println("Positive number in an array is:");
		for(int i=0;i<20;i++)
		{
			if(a[i]>0)
			{
				System.out.print(a[i]+"\t");
				pos++;
			}
		}
	     System.out.println();
		 System.out.println();
		System.out.println("count of positive numbers are:"+pos);
		//number of negative number
		System.out.println();
		System.out.println("negative number in an array is:");
		for(int i=0;i<20;i++)
		{
			if(a[i]<0)
			{
				System.out.print(a[i]+"\t");
				neg++;
			}
		}
			System.out.println();
		  System.out.println("count of negative numbers are:"+neg);


		//number of odd number
		System.out.println();
		System.out.println("odd numbers in an array");
		for(int i=0;i<20;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.print(a[i]+"\t");
				odd++;
			}
		}
			System.out.println();
				System.out.println("count of odd numbers are:"+odd);
        //number of even number
		System.out.println();
		System.out.println("even numbers in an array");
         for(int i=0;i<20;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+"\t");
				even++;
			}
		}
			System.out.println();
				System.out.println("count of even numbers are:"+even);
				//zeros
				 for(int i=0;i<20;i++)
		         {
			        if(a[i]==0)
			     {
				zero++;
			     }
		   }
		   	System.out.println();
				System.out.println("count of zero numbers are:"+zero);

	}
}
