import java.util.*;
class ReverseArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int rev[]=new int[10];
		System.out.println("enter the element in an array");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println();
		int j=0;
		for(int i=10-1;i>=0;i--)
		{
			rev[i]=a[j];
			j++;
		}
        System.out.println();
		System.out.println("reverse order array is");
		for(int i=0;i<10;i++)
		{
           System.out.print(rev[i]+"\t");
		}

	}
}
