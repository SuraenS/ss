import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution7 {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();sc.nextLine();
        
        Account[] acc = new Account[n];
        
        
        for(int i=0;i<n;i++){
            
            int Number = sc.nextInt();sc.nextLine();
            int NoOfaccountHolders = sc.nextInt();sc.nextLine();
            String Actype = sc.nextLine();
            int Balance = sc.nextInt();sc.nextLine();
            
            acc[i] = new Account(Number,NoOfaccountHolders,Actype,Balance);
            
        }
        
        String reqAcctype = sc.nextLine();
        
        Account a = findAccountWithMaximumNoOfAccountHolders(acc);
        
        Account b = searchAccountByAcType( acc, reqAcctype);
        
        if(a != null){
            System.out.println("number-"+a.getNumber());
            System.out.println("noOfAccountHolders-"+a.getNoOfAccountHolders());
            System.out.println("acType-"+a.getAcType());
            System.out.println("balance-"+a.getBalance());
            
        }
        else {
            System.out.println("No Account found with mentioned attribute");
        }
        
        if(b != null){
            System.out.println("number-"+b.getNumber());
            System.out.println("noOfAccountHolders-"+b.getNoOfAccountHolders());
            System.out.println("acType-"+b.getAcType());
            System.out.println("balance-"+b.getBalance());
            
        }
        else {
            System.out.println("No Account found with mentioned attribute");
        }
    }
    public static Account findAccountWithMaximumNoOfAccountHolders(Account ac[])
    {
         Account obj1 = null;
         int max = 0;
         
         for(int i=0;i<ac.length;i++){
             if(ac[i].getNoOfAccountHolders() > max){
                 max = ac[i].getNoOfAccountHolders();
                 obj1 = ac[i];
             }
         }
         
         return obj1;
    }
    public static Account searchAccountByAcType(Account ac[],String accttype)
    {
        // Enter your code here
        
        Account obj2 = null;
        
        for(int i=0;i<ac.length;i++){
            
            if(accttype.equalsIgnoreCase(ac[i].getAcType())){
                obj2 = ac[i];
                break;
            }
        }
        
        return obj2;
    }
    
    
    
}

 class Account {
   
    private int number,noOfAccountHolders,balance;
    private  String acType;
    
    public Account(int number, int noOfAccountHolders,String acType,int balance){
        this.number = number;
        this.noOfAccountHolders = noOfAccountHolders;
        this.acType = acType;
        this.balance = balance;
    }
    
    public int getNumber(){
        return number;
    }
	public void setNumber(int Number)
	{
		this.Number=Number;
	}
	
    
    public int getNoOfAccountHolders(){
        return noOfAccountHolders;
    }
	public void setNoOfAccountHolders( int NoOfAccountHolders)
	{
		this.NoOfAccountHolders=NoOfAccountHolders;
	}
    
    public String getAcType(){
        return acType;
    }
	public void getAcType( String AcType)
	{
		this.AcType=AcType;
    
    public int getbalance()
	{
        return balance;
    }
	public void setbalance(int balance)
	{
		this.balance=balance;
	} 
	}