import java.util.*;

class Point
{
    int x;
    int y;
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    Point()
    {
        x = 0;
        y = 0;
    }
    public String toString()
    {
        return "X: "+this.x+"y:"+this.y;

    }
}

class Node
{
    Point pos;
    int data;
    Node(Point pos, int data)
    {
        this.pos = pos;
        this.data = data;
    }
    Node()
    {
        data = 0;
    }
}
 
// The main quadtree class
class Quad
{
    // Hold details of the boundary of this node
    Point topLeft;
    Point botRight;
 
    // Contains details of node
    ArrayList<Node> n;
 
    // Children of this tree
    Quad topLeftTree;
    Quad topRightTree;
    Quad botLeftTree;
    Quad botRightTree;
 

    public Quad()
    {
        topLeft =new Point(0, 0);
        botRight =new  Point(0, 0);
       
       
    }
   public Quad(Point topL, Point botR)
    {  
        topLeft = topL;
        botRight = botR;
        n=new ArrayList<>();
    }

public void insert(Node node)
{
    if (node ==null)
        return;
 
    // Current quad cannot contain it
    if (!inBoundary(node.pos))
        return;
 
    // We are at a quad of unit area
    // We cannot subdivide this quad further
    if ((botRight.x-topLeft.x) <= 10 &&
        (botRight.y-topLeft.y ) <= 10)
    {
        System.out.println("List");
            n.add(node);
          return;
    }
 
    if ((topLeft.x + botRight.x) / 2 >= node.pos.x)
    {
        // Indicates topLeftTree
        if ((topLeft.y + botRight.y) / 2 >= node.pos.y)
        {
            if (topLeftTree ==null)
                topLeftTree = new Quad(
                    new Point(topLeft.x, topLeft.y),
                    new Point((topLeft.x + botRight.x) / 2,
                        (topLeft.y + botRight.y) / 2));
            topLeftTree.insert(node);
        }
 
        // Indicates botLeftTree
        else
        {
            if (botLeftTree == null)
                botLeftTree = new Quad(
                    new Point(topLeft.x,
                        (topLeft.y + botRight.y) / 2),
                    new Point((topLeft.x + botRight.x) / 2,
                        botRight.y));
            botLeftTree.insert(node);
        }
    }
    else
    {
        // Indicates topRightTree
        if ((topLeft.y + botRight.y) / 2 >= node.pos.y)
        {
            if (topRightTree == null)
                topRightTree = new Quad(
                    new Point((topLeft.x + botRight.x) / 2,
                        topLeft.y),
                    new Point(botRight.x,
                        (topLeft.y + botRight.y) / 2));
            topRightTree.insert(node);
        }
 
        // Indicates botRightTree
        else
        {
            if (botRightTree ==null)
                botRightTree = new Quad(
                    new Point((topLeft.x + botRight.x) / 2,
                        (topLeft.y + botRight.y) / 2),
                    new Point(botRight.x, botRight.y));
            botRightTree.insert(node);
        }
    }
}
 
// Find a node in a quadtree




public Node search(Point p)
{
    // Current quad cannot contain it
    if (!inBoundary(p))
        return null;
 
    // We are at a quad of unit length
    // We cannot subdivide this quad further
   if ((botRight.x-topLeft.x ) <= 10 &&
        (botRight.y-topLeft.y ) <= 10)
    {
        if(n.size()!=0)
        return n.get(0);
        else
        return null;
    }
       
    if(botRight.x-topLeft.x==10)
    {
        //System.out.println(this);
        //dfs(this);
        return n.get(0);

    }
 
    if ((topLeft.x + botRight.x) / 2 >= p.x)
    {
        // Indicates topLeftTree
        if ((topLeft.y + botRight.y) / 2 >= p.y)
        {
            if (topLeftTree == null)
                return null;
            return topLeftTree.search(p);
        }
 
        // Indicates botLeftTree
        else
        {
            if (botLeftTree == null)
                return null;
            return botLeftTree.search(p);
        }
    }
    else
    {
        // Indicates topRightTree
        if ((topLeft.y + botRight.y) / 2 >= p.y)
        {
            if (topRightTree == null)
                return null;
            return topRightTree.search(p);
        }
 
        // Indicates botRightTree
        else
        {
            if (botRightTree == null)
                return null;
            return botRightTree.search(p);
        }
    }
}
 
// Check if current quadtree contains the point
boolean inBoundary(Point p)
{
    return (p.x >= topLeft.x &&
        p.x <= botRight.x &&
        p.y >= topLeft.y &&
        p.y <= botRight.y);
}

public void dfs(Quad tree) {

   if (tree == null)
       return;

/*System.out.printf("\nLevel = %d [X1=%d Y1=%d] ",
tree.topLeft, tree.botRight, tree.n.data);*/
/* if(tree.topLeft!=null)
System.out.println(tree.topLeft);*/
  if(tree.botRight.x-tree.topLeft.x<=10)
  {
      ArrayList<Node> al=tree.n;
     System.out.println("LIST 2  ::");
     double area=0.0;

    for(int i=0;i<al.size();i++)
    {  System.out.println(tree.botRight.x-tree.topLeft.x+"diff" +al.get(i).data+al.get(i).pos.x+al.get(i).pos.y+tree.topLeft.x+tree.botRight.x);
      System.out.println("radius:"+al.get(i).data);
      area+=Main.RunSnippet(al.get(i).data,al.get(i).pos.x,al.get(i).pos.y,tree.topLeft.x,tree.botRight.x); 
    }
    System.out.println("AREA"+area);
    if(Main.maxArea<area)
    {
      Main.maxArea=area;
      Main.x1=tree.botRight.x;
      Main.x2=tree.topLeft.x;
    }
  }
/*  
for (Node node : tree.nodes) {
System.out.printf(" \n\t  x=%d y=%d", node.x, node.y);
}
if (tree.nodes.size() == 0) {
System.out.printf(" \n\t  Leaf Node.");
}*/
dfs(tree.topLeftTree);
dfs(tree.botLeftTree);
dfs(tree.topRightTree);
dfs(tree.botRightTree);

}
  

 }
public class Main
{    static double maxArea=Integer.MIN_VALUE;
     static int x1=0;
     static int x2=0;
    public static void main(String args[]) {

    Quad center=new Quad(new Point(0, 0),new Point(8, 8));
    Node a=new Node(new Point(1,1), 1);
    Node b=new Node(new Point(6,6), 1);
    Node c=new Node(new Point(4,4), 2);
    Node d=new Node(new Point(6,2), 1);
    center.insert(a);
    center.insert(b);
    center.insert(c);
    center.insert(d);
   
     //System.out.println(center.search(new Point(60,60)).data);
     center.dfs(center);
   
      System.out.println("max"+maxArea);
      System.out.println(x1);
      System.out.println(Main.RunSnippet(4,10,10,0,10));
      
   
    /* System.out.println(center.search(new Point(10,10)).data);
     System.out.println(center.search(new Point(60,60)).data);
     if(center.search(new Point(4,6))!=null)
     {
         System.out.println("OK");
     }
     else{
         System.out.println("not found");
     }*/
   
}
  public static double RunSnippet(double a,double h,double k,double x1,double x2)
{
    // test code
   

    double r1 = Integrate(x1, a, h, k);
    double r2 = Integrate(x2, a, h, k);

    System.out.println(r2-r1+"r1");
    return r2-r1;

}

public static double Integrate(double x, double a,double h, double k)
{
    double a0 = Math.abs(a*a - (h-x)*(h-x));

    if(a0 <= 0.0){
        if(k == 0.0)
            return Math.PI * a * a / 4.0 * Math.signum(x);
        else
            System.out.println("outside boundaries");
    }
  System.out.println("a0"+a0);
    double a1 = Math.sqrt(Math.abs(a*a - (h-x)*(h-x)) * (h-x));
    System.out.println("a1"+a1);
    double area = 0.5 * Math.atan(Math.abs(a1 / ((h-x)*(h-x) - a*a))*a*a - 0.5 * a1 + k * x);
    System.out.println("a0area"+area);
    return area;
}
}
