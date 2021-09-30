import java.util.*;
class Arraysame 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		 int flag=1;
		 System.out.println("enter how many element you want in an array");
		 int n=sc.nextInt();
		 if(n<0)
		{
			 System.out.println("enter the valid size");
		}
		 int a[]=new int[n];
		System.out.println("enter the element in an array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Elements in an array is:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
		}
		int j=n-1;
       for(int i=0;i<n/2;i++)
		{
		   if(a[i]!=a[j])
			{
               flag=0;
			   break;
			}
			else
				j--;
		}
		System.out.println();
		if(flag==1)
		{
			System.out.println("elements in an array are same if we read from front or back");
		}
		else
		{
        System.out.println("elements in an array are not same");
		}
	}
}
