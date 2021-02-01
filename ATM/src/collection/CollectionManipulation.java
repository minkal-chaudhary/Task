package collection;
import java.util.*;
public class CollectionManipulation {

	public static void main(String [] args)
	{
		//ArrayList
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(1);
		al.add(7);
		al.add(5);
		al.add(3);
		System.out.println(al);
		
		ListIterator<Integer> i=al.listIterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println("prev:"+i.previous());
		System.out.println(al.remove(new Integer(1)));
		System.out.println(al);
		al.add(null);
		System.out.println(al);
		
		//LinkedList
		LinkedList<Integer> ll=new LinkedList<>();
		System.out.println(ll.add(21));
		ll.add(32);
		ll.add(null);
		System.out.println(ll);
		Iterator<Integer> i1=ll.iterator();
		while(i1.hasNext()) {
			System.out.print(i1.next()+" ");
		}
		System.out.println("--HashSet--");
		
		
		
		//HashSet
		HashSet<Integer> hs=new HashSet<>();
		System.out.println("hashSet"+hs.add(21));
		System.out.println("hashset"+hs.add(21));
		hs.add(null);
		System.out.println(hs);
		/*
		 * ListIterator<Integer> ite=(ListIterator<Integer>) hs.iterator();
		 * while(ite.hasNext()) { System.out.print(ite.next()+" "); }
		 */
		
		
		
		//linkedHashset
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		System.out.println(lhs.add(21));
		lhs.add(54);
		lhs.add(65);
		System.out.println(lhs);
		
		
		//TreeSet
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(88);
		ts.add(8);
		ts.add(76);
		System.out.println(ts);
	}
	
}
