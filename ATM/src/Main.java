import java.util.ArrayList;


class Main {

	
	public static void main(String [] args)
	{
     
   ArrayList<Integer> al=new ArrayList<Integer>();
   al.add(2000);
   al.add(500);
   al.add(200);
   al.add(100);
   Denomination d=new Denomination(al);
   
<<<<<<< Updated upstream
 ATM atm1=new ATM(d);
   
   atm1.topUp(new Amount(23900));
   System.out.println(atm1);
   atm1.transit(new Transaction(10400,"Withdraw"));
   atm1.transit(new Transaction(50201,"Deposit"));
   System.out.println("main branch ");
   System.out.println(atm1);
=======
 ATM atm=new ATM(d);
 ATM atm1=new ATM(d);
   atm.topUp(new Amount(23900));
   System.out.println(atm);
   atm.transit(new Transaction(10400,"Withdraw"));
   atm.transit(new Transaction(50201,"Deposit"));
   System.out.println("Branch ATM Changes again");
   System.out.println(atm);
>>>>>>> Stashed changes
	}
}
