package practice;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		int i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First number");
		int a=s.nextInt();
		System.out.println("Enter second number");
		int b=s.nextInt();
		int r=1;
		
		for(i=1;i<a+1;i++)
		{
			for(j=1;j<b+1;j++)
			{
				if(i==2)
				{
					r=r*i;
					System.out.printf("%d ",r);
					
				}
				else
				{
					int m=i*j;
					System.out.printf("%d ",m);
					m=1;
				}
			}
			System.out.printf(" \n" );
		}
		
	}

}
