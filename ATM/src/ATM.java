import java.util.*;
import java.io.*;

class ATM
{    
	
	Denomination denomination;
	TreeMap<Integer,Integer> hm;
	
	
	public ATM(Denomination al)
	{   hm=new TreeMap<Integer,Integer>(Collections.reverseOrder());
	    denomination=al;
	    Collections.sort(denomination.al,Collections.reverseOrder());
	    for(int i=0;i<denomination.al.size();i++)
	    {
	    	hm.put(denomination.al.get(i),0);
	    }	
	}
	
	
	public void topUp(Amount a)
	{
	 Deposit.deposit(a,hm);
    }
	
	public void demonetisation(Denomination d)
	{
	hm.clear();
    denomination=d;
    for(int i=0;i<denomination.al.size();i++)
    {
    	hm.put(denomination.al.get(i),0);
    }
	}
	
	public void transit(Transaction t)
	{
	int amt=t.getAmount();
	 if(t.getType().equals("Deposit"))
	 {
		
		 topUp(new Amount(amt));
		 System.out.print("Amount Deposited SuccessFully");
		 
	 }else{
		 
		 boolean flag=Withdraw.canWithdraw(amt,hm);
		 if(flag==true)
		 {
			 System.out.println("Transaction Succesful:"+Withdraw.withdraw(amt,hm));
		 }
		 else
		 {
			 System.out.println("cant Withdraw Insufficient Amount");
		 }
	 }
	 
	
		
	}
	@Override
	public String toString() {
		return "ATM [denomination=" + denomination + ", hm=" + hm + "]";
	}
}