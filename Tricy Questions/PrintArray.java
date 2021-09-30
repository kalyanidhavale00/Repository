import java.util.*;
class PrintArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//Que1 : Take 10 integer inputs from user  and store them in an array and print them on screen
		
		
		int a[]=new int[10];
		System.out.println("enter the element in an array");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Elements in an array is:");
		for(int i=0;i<10;i++)
		{
			System.out.print(a[i]+"\t");
		}


		//Que2:
		int flag=0;
		System.out.println();
		System.out.println("Enter the number to check whether that number is present in an array or not");
		int ch=sc.nextInt();
		for(int i=0;i<10;i++)
		{
			if(a[i]==ch)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Number is present in an array");
		}
		else 
		{
			System.out.println("Number is not present in an array");
		}


	}
}
