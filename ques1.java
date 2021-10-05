package com.Java_basic.bootcamp;
import java.util.*;
public class ques1 
{
	public static void checkAlpha(char c)
	{
		if((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z'))
            System.out.println("It is an alphabet");
        else
            System.out.println("It is not alphabet");		
    }
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter char:");
		char ch=sc.next().charAt(0);
		ques1.checkAlpha(ch);
	}
		
}
 