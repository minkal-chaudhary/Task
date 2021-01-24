import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;


public class Withdraw extends Transaction{

	public Withdraw(int amount) {
		super(amount,"Withdraw");
	
	}
    public static boolean canWithdraw(int amount,TreeMap<Integer,Integer> hm)
    {    int orgAmt=amount;
    	 Set<Integer> keys=hm.keySet();
         
         
         for(int key : keys){
        	 int need=amount/key;
        	 if(hm.get(key)>=need)
        	 {
        		 amount=amount-need*key;
        	 }
    	 if(amount==0)
    	 return true;
    	
         }
         return false; 
}
    public static HashMap<Integer,Integer> withdraw(int amount,TreeMap<Integer,Integer> hm)
    {
    HashMap<Integer,Integer> ans=new HashMap<Integer,Integer>();
    	
    
    Set<Integer> keys=hm.keySet();
    
    
    for(int key : keys){
   	 int need=amount/key;
   	 if(hm.get(key)>=need)
   	 {
   		 amount=amount-need*key;
   		 hm.put(key,hm.get(key)-need);
   		 ans.put(key,need);
   		 
   	 }
    }
    
    return ans;
    }
}
