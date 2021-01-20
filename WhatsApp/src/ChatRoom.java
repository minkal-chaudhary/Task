import java.util.ArrayList;

public class ChatRoom {
 
	User u1;
	User u2;
	ArrayList<String> sender;
	ArrayList<String> reciever;
	public ChatRoom(User u1,User u2) {
		super();
		this.u1=u1;
		this.u2=u2;
		this.sender = new ArrayList<>();
		reciever = new ArrayList<>();
	}
	public void user1Msg(String msg)
	{
		sender.add(msg);
	}
	public void user2Msg(String msg)
	{
		reciever.add(msg);
	}
	public void showMessages()
	{   System.out.println("ChatRoom of "+u1.getName()+" and "+u2.getName());
		System.out.println(u1.getName()+":"+sender);
		System.out.println(u2.getName()+":"+reciever);
	}
}
