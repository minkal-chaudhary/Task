
class Node{
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
		
	}
}

public class EvenOdd {
    static Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		head.next.next.next.next.next=new Node(6);
		System.out.println(	head.data+" "+
		head.next.data+
		head.next.next.data+
		head.next.next.next.data+
		head.next.next.next.next.data+
		head.next.next.next.next.next.data);
		evenOdd(head);
		System.out.println(	head.data+" "+
				head.next.data+
				head.next.next.data+
				head.next.next.next.data+
				head.next.next.next.next.data+
				head.next.next.next.next.next.data);
		
	}
	public static void evenOdd(Node head)
	{
		Node start=head;
		Node cur=head;
		while(cur!=null)
		{
			if(cur.data%2==0)
			{int temp=start.data;
			 start.data=cur.data;
			 cur.data=temp;
			 start=start.next;
			}
			cur=cur.next;
			
		}
	}
	}


