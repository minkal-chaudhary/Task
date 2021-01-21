import java.util.*;
import java.util.Scanner;

public class TicTacToe {
	static boolean flag=false;
	public static void main(String [] args)
	{  
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> zero=new ArrayList<>();
		ArrayList<Integer> cross=new ArrayList<>();
		int count=1;
		for(int i=1;i<4;i++) {
			  for(int j=1;j<4;j++)
			  { System.out.print(count);
			     count++;
			  }
			  System.out.println();
		}
	
		
		int [] arr=new int[] {1,2,3,4,5,6,7,8,9};
		int [] arr1=new int[] {8,3,4,1,5,9,6,7,2};
		HashMap<Integer,Integer> hm=new HashMap<>();
		HashMap<Integer,Integer> hm2=new HashMap<>();
		for(int i=0;i<9;i++)
		{
			hm.put(arr[i],arr1[i]);
			hm2.put(arr1[i],arr[i]);
		}
		
		System.out.println(hm);
		System.out.println(hm2);
		
		char [][] box=new char[3][3];
		
	
		for(int i=0;i<9;i++)	
			{
			System.out.println("zero"+zero);
			System.out.println("cross"+cross);
			flag=false;
			if(i%2!=0)
			{   System.out.println("my turn");
				int n=Integer.parseInt(sc.nextLine());
			    cross.add(hm.get(n));
			    int x=(n-1)/3;
			    int y=n%3;
			    if(y==0)
			    {
			    	y=2;
			    }else
			    	y--;
			    box[x][y]='X';
		    
			}
			else
			{
				System.out.println("computer Turn");
			    if(zero.size()==0)
			    {
			    	zero.add(new Integer(5));
			    	box[1][1]='O';
			    }else if(zero.size()==1)
			    {
			    	zero.add(new Integer(4));
			    	box[0][2]='O';
			    }
			    else
			    {   int sum=0;
			    	for(int a=0;a<zero.size();a++)
			    	{   sum=zero.get(a);
			    		for(int b=a+1;b<zero.size();b++)
			    		{
			    			sum+=zero.get(b);
			    			int p=15-sum;
			    			if(!cross.contains(p)&&!zero.contains(p)&&p>0)
			    			{   zero.add(p);
			    				System.out.println("Zero Winner");
			    				
			    				System.out.println("p in after sub in for win"+p);
			    				p=hm2.get(p);
			    				System.out.println("p in after sub in for win after map"+p);
			    				int x=(p-1)/3;
			    				int y=p%3;
			    				 if(y==0)
			    				    {
			    				    	y=2;
			    				    }else
			    				    	y--;
			    				box[x][y]='O';
			    				flag=true;
			    				return;
			    			}
			    			
			    		}
			        }
			    	
			    	sum=0;
			    	if(flag==false)
			    	{
			    	for(int a=0;a<cross.size();a++)
			    	{   sum=cross.get(a);
			    		for(int b=a+1;b<cross.size();b++)
			    		{
			    			sum+=cross.get(b);
			    			int p=15-sum;
			    			
			    			System.out.println("p in after sub for defend "+p);
			    			if(!zero.contains(p)&&!cross.contains(p)&&p>0)
			    			{
			    				zero.add(p);
			    			p=hm2.get(p);
			    			System.out.println("p in after sub for defend after map"+p);
			    			int x=(p-1)/3;
		    				int y=p%3;
		    				 if(y==0)
		    				    {
		    				    	y=2;
		    				    }else
		    				    	y--;
		    				 box[x][y]='O';
		    				 flag=true;
			    			}
			    		}
			    	}
			    	}
			        if(flag==false)
			        {
			        	for(int g=1;g<10;g++)
			        	{
			        		if(!zero.contains(g)&&!cross.contains(g))
			        		{   zero.add(hm.get(g));
			        			int x=(g-1)/3;
			    				int y=g%3;
			    				 if(y==0)
			    				    {
			    				    	y=2;
			    				    }else
			    				    	y--;
			    				 box[x][y]='O';	
			        		}
			        	}
			        				
			        }
			    
			    		
			    	
			    	
			    }
			}
			
			
			 for(int m=0;m<3;m++) {
				  for(int j=0;j<3;j++)
				  {
					  System.out.print(box[m][j]);
				  }
				  System.out.println();
			 }
			
			
			
			
						
		}
		
		
	}

}
