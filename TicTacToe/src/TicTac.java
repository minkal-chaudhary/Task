import java.util.Scanner;

public class TicTac {
	static int [][] mg;
	static int sumX;
	static int sumO;
	static char [][] box;
	static int xX=-1;
	static int yX=-1;
	static int xO=-1;
	static int yO=-1;
	static boolean flag=false;
	
	public static void main(String [] args)
	{   Scanner sc=new Scanner(System.in);
		int [] arr=new int[] {2,7,6,9,5,1,4,3,8};
		box=new char[3][3];
		int k=0;
		mg=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				mg[i][j]=arr[k];
				k++;
			}
		}
		/*
		 * for(int i=0;i<3;i++) { for(int j=0;j<3;j++) {System.out.print(mg[i][j]); }
		 * System.out.println(); }
		 */
		sumX=0;
		
	    sumO=0;
		
		for(int i=0;i<9;i++)
		{
			
			if(i%2==0)
			{
				System.out.println("my turn");
				int x=Integer.parseInt(sc.nextLine());
				int y=Integer.parseInt(sc.nextLine());
				box[x][y]='X';
				
				
					sumX=sumX+mg[x][y];
					if(sumX==15)
					{  flag=true;
						System.out.println("user is winner");
					}
					xX=x;
					yX=y;
				
				
				
			}
			else {
				  if(xO==-1&&yO==-1)
				 { 
					  if(box[1][1]!='X')
					  {
						 box[1][1]='O';
						 sumO+=5;
						 xO=1;
						 yO=1;
					  }
					 else
					  {
						xO=1;
						yO=2;
					  }
			     }
				  else
				  {
				  if(win(sumO,xO,yO))
				  {  flag=true;
					  for(int a=0;a<3;a++) {
							 for(int b=0;b<3;b++) 
							 {
								 System.out.print(box[a][b]);
								 }
						         System.out.println();
						     }
					  return; 
				  }
				  
			      defend(xO,yO);
					   
				 
				  }
			}
			
			 for(int a=0;a<3;a++) {
				 for(int b=0;b<3;b++) 
				 {
					 System.out.print(box[a][b]);
					 }
			         System.out.println();
			     }
			 System.out.println("------");
			
		}
		if(flag==false)
		{
			System.out.println("No winner");
		}
	}

	private static void defend( int xO, int yO) {
	  System.out.println("defend"+ sumX +" :sumO"+ sumO);
	  
	  int n=15-sumX;
	  boolean flag1=false;
	  for(int i=0;i<3;i++) {
		  for(int j=0;j<3;j++)
		  {
			  if(box[i][j]!='X'&&box[i][j]!='O'&&n==mg[i][j])
			  {  System.out.println("inside box defend"+n);
			  
			    flag1=true;
				 box[i][j]='O';
				 sumO+=n;
				 xO=i;
				 yO=j;
			  }
		  }
	  }
	  if(flag1==false)
	  {
		  for(int i=0;i<3;i++) {
			  for(int j=0;j<3;j++)
			  {
				  if(box[i][j]!='O'&&box[i][j]!='X'&&flag1==false)
				  {
					  box[i][j]='O';
					  sumO+=mg[i][j];
						 xO=i;
						 yO=j;
						 flag1=true;
				  }
			  }
		  }
	  }
	  
	  
		
		
	}

	private static boolean win(int sum,int x,int y) {
		
		if(checkAllAlternate(sum,x,y))
		{
			
			
			System.out.println("Computer Win");
			return true;
		}
		return false;
		
		
	}

	private static boolean checkAllAlternate(int sum, int x, int y) {
		
		
		if(call(sum,x,y+1)||call(sum,x+1,y+1)||call(sum,x+1,y)||call(sum,x+1,y-1)||call(sum,x,y-1)||call(sum,x-1,y-1)||call(sum,x-1,y)||call(sum,x-1,y+1))
		{   
			return true;
		}
		
		return false;
	}

	private static boolean call(int sum, int i, int j) {
		if(i>=0&&i<3&&j<3&&j>=0)
		{
			if(box[i][j]!='X'&&box[i][j]!='O'&&(sum+mg[i][j]==15))			
			{   System.out.println("entered  0");
				box[i][j]='O';
				return true;
			}
			return false;
		}
		return false;
	}

}
