package com.Java_basic.bootcamp;
import java.util.Scanner;
import com.bootcamp_day2.Accounts;
import com.bootcamp_day2.CurrentAccounts;
import com.bootcamp_day2.SavingsAccounts;
public class AccountsMain 
{
public static void main(String[] args)
{
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Account Number:");
	  long accountNumber=sc.nextLong();
	  System.out.println("Enter Balance:");
	  int balance=sc.nextInt();
	  System.out.println("Enter IFSC Code:");
	  String ifsc=sc.next();
	  System.out.println("Enter Nominee Name:");
	  String nomineeName = sc.next();
	  System.out.println("Enter Daily Limit:");
	  int dailyLimit=sc.nextInt();
	
	  Accounts accobj=new Accounts(accountNumber,balance,ifsc);
	  SavingsAccounts sobj=new SavingsAccounts(accountNumber,balance,ifsc,dailyLimit);
	  CurrentAccounts cobj=new CurrentAccounts(accountNumber,balance,ifsc,nomineeName);
	  accobj.display();
	  sobj.display();
	  cobj.display();
	  
	  Accounts accobj1=new SavingsAccounts(accountNumber,balance,ifsc,dailyLimit);
	  Accounts accobj2=new CurrentAccounts(accountNumber,balance,ifsc,nomineeName);
	  SavingsAccounts sobj1=(SavingsAccounts)accobj1;
	  CurrentAccounts cobj1=(CurrentAccounts)accobj2;
	  
	  getDisplay(sobj1, cobj1);
}
public static void getDisplay(SavingsAccounts s,CurrentAccounts c)
{
	  System.out.println("\n--------------Inside GetDisplay");
	  SavingsAccounts save=s;
	  CurrentAccounts curr=c;
	  save.display();
	  curr.display();
}
}
