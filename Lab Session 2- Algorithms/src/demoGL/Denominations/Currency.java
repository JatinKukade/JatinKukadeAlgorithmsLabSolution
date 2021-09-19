package demoGL.Denominations;

import java.util.Scanner;
import demoGL.Denominations.*;

public class Currency 
{
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		DenominationSort d= new DenominationSort();
		System.out.println("Enter size of currency denominations:");
		int size= sc.nextInt();
		int []denom= new int[size];
		System.out.println("Enter currency denominations values:");
		for(int i=0; i<size; i++)
		{
			denom[i]= sc.nextInt();
		}
		d.sort(denom,0,denom.length-1);
		for(int i=0;i<denom.length; i++)
		System.out.println(denom[i]);
		System.out.println("Enter the amount you want to pay:");
		int amount= sc.nextInt();
		for(int i=0;i<denom.length; i++)
		{
			if(amount>denom[i])
			{
				int notes= amount/denom[i];
				System.out.println(denom[i] + ":" + notes);
				amount= amount % denom[i];
			}
			
			
		}
		
		if(amount>0)
		{
			System.out.println("Leftover amount for which denominations not available:" + amount);
		}
		
		sc.close();
		

	}

}
