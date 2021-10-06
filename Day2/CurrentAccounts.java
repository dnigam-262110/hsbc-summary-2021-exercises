package com.bootcamp_day2;

import java.util.Scanner;

public class CurrentAccounts extends Accounts
{
	private String nomineeName;
	public CurrentAccounts(long accountNumber, int balance, String ifsc,String nomineeName) 
	{
		super(accountNumber, balance, ifsc);
		this.nomineeName=nomineeName;
	}
	public void display()
	{
	  System.out.println("\n");	
	  super.display();
	  System.out.println("Nominee Name:"+nomineeName);
	  
	}
}
