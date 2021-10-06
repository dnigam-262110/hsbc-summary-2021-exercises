package com.bootcamp_day2;
import java.util.Scanner;
public class Accounts 
{
  private long accountNumber;
  private int balance;
  private String ifsc;
  
  public Accounts(long accountNumber, int balance, String ifsc)
  {
	this.accountNumber = accountNumber;
	this.balance = balance;
	this.ifsc = ifsc;
  }
  public void display()
  {
	  System.out.println("Account Number: "+accountNumber+"\n"+"Balance: "+balance+"\n"+"IFSC Code:"+ifsc);
  }
}

