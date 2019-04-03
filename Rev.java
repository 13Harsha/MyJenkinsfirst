package practice;

import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {
		int rev=0,n=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter No to be reaversed");
		int a=s.nextInt();
		while(a>0)
		{
			
			int r=a%10;
			rev=rev*10+r;
			 a=a/10;
			
		}
		System.out.printf("%d",rev);
		 

	}

}
