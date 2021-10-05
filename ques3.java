package com.Java_basic.bootcamp;
import java.util.Scanner;
public class ques3 
{
	public static void printEven(int start,int end)
	{
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Sequence:"+i);
			}
		}
	}
	public static void printOdd(int start,int end)
	{
		for(int i=start;i<=end;i++)
		{
			if(i%2!=0)
			{
				System.out.println("Odd Sequence:"+i);
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range:");
		int start=sc.nextInt();
		int end=sc.nextInt();
		printEven(start, end);
		printOdd(start, end);
	}
}
