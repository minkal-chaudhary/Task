class Info
{
	int max;
	int min;
	boolean flag;
	int sum;
	public Info(int min, int max, int sum ,boolean flag) {
		super();
		this.max = max;
		this.min = min;
		this.flag = flag;
		this.sum = sum;
	}
	
}
public class LargestBST {
	Node root;
	static int Osum=0;
public static void main(String [] args)
{
	LargestBST tree=new LargestBST();
	tree.root=new Node(50);
	tree.root.left=new Node(10);
	tree.root.left.left=new Node(5);
	tree.root.left.right=new Node(20);
	
	tree.root.right=new Node(60);
	tree.root.right.left=new Node(45);
	tree.root.right.right=new Node(70);
	tree.root.right.right.left=new Node(65);
	tree.root.right.right.right=new Node(80);
	
	preOrder(tree.root);
	checkBstSize(tree.root);
	System.out.println("     Osum"+Osum);
}
private static void checkBstSize(Node root) {
	
	Info i=callUtil(root);
}
public static Info callUtil(Node root)
{
	if(root==null)
	{
	return new Info(Integer.MAX_VALUE,Integer.MIN_VALUE,0,true);	
	}
	Info l=callUtil(root.left);
	Info r=callUtil(root.right);
	
	
	
	if(l.flag&&r.flag&&l.max<root.data&&r.min>root.data)
	{  
	
		int minR=Math.min(Math.min(l.min,r.min),root.data);
		int maxR=Math.max(root.data,Math.max(r.max,l.max));
		Osum=Math.max(l.sum+r.sum+1, Osum);
		System.out.println(minR);
		System.out.println(maxR);
		System.out.print("Summ"+Osum);
		return new Info(minR,maxR,l.sum+r.sum+1,true);
	}
	
	return new Info(Integer.MAX_VALUE,Integer.MIN_VALUE,0,false);
}
public static void preOrder(Node root)
{
	if(root==null)
		return;
    System.out.println(root.data);
	preOrder(root.left);
	preOrder(root.right);
	
				
}
}
