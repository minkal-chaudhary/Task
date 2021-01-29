import java.util.Set;
import java.util.TreeMap;


public class Deposit extends Transaction{
  
	public Deposit(int amount) {
		super(amount,"Deposit");
		
	}
public static void deposit(Amount a,TreeMap<Integer,Integer> hm)
{
	
    int amount=a.getAmount();
    if(amount%100==0)
    {
    Set<Integer> keys=hm.keySet();
    
    
    for(int key : keys){
         
   	 int Ld = amount/key;
   	 hm.put(key,hm.get(key)+Ld);
   	 
   	 int curAmt=Ld*key;
   	amount=amount-curAmt;
   	 if(amount==0)
   		 break;
   	 
     }
}
else {
	System.out.println("cant deposit it in this denomination");
}
}
}
