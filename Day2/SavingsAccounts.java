package com.bootcamp_day2;

import java.util.Scanner;

public class SavingsAccounts extends Accounts
{
	private int dailyLimit;
	
	public SavingsAccounts(long accountNumber, int balance, String ifsc, int dailyLimit) 
	{
		super(accountNumber, balance, ifsc);
		this.dailyLimit = dailyLimit;
	}
    public void display()
    {
    	System.out.println("\n");
    	super.display();
    	System.out.println("Savings Daily Limit: "+dailyLimit); 	
    }
}
