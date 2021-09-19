package demoGL.Transactions;

import java.util.Scanner;

public class Transaction 
{

	public static void main(String[] args)   
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of transaction array:");
		int size= sc.nextInt();
		int []trans= new int[size];
		System.out.println("Enter values of the array:");
		for(int i=0; i<size; i++)
		{
			trans[i]= sc.nextInt();
		}
		System.out.println("Enter total no of targets to be achieved:");
		int nooftargets= sc.nextInt();
		int sum=0;
		for(int i=0;i<nooftargets; i++)
		{
			System.out.println("Enter value of target:");
			int targetvalue= sc.nextInt();
			for(int j=0;j<size; j++)
			{
				sum= sum+trans[i];
				if(sum>=targetvalue)
				{
					System.out.println("Target achieved after" +" "+ (j+1) +" "+ "transactions");
					break;
				}
				
			}
			if(sum<targetvalue)
			{
				System.out.println("Target not achieved");
			}
		}
		
	
		
		

	}

}
