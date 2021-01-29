import java.util.*;

public class ReverseStack {
   static Stack<Integer> s;
	public static void main(String [] args)
	{
     s=new Stack<Integer>();
     s.push(5);
     s.push(2);
     s.push(7);
     s.push(4);
     System.out.println(s);
     reverse();
     System.out.println(s);
     
	}
	public static void reverse()
	{
		if(s.isEmpty())
		{
			return;
		}
		int temp=s.pop();
		reverse();
		sortedInsert(temp);
	}
	public static void sortedInsert(int bottom)
	{
		if(s.isEmpty())
		{
			s.push(bottom);
			
		}
		else {
			if(s.peek()>bottom)
			{
		int temp=s.pop();
		sortedInsert(bottom);
		s.push(temp);
			}
			else
			{
				s.push(bottom);
				
			}
			}
			}
		}
		
