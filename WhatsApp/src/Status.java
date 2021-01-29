import java.util.ArrayList;

public class Status {
	
	boolean isThere;
	ArrayList<User> seenUser;
	Message message;
	public Status() {
		super();
		this.isThere = false;
		this.seenUser = new ArrayList<>();
		this.message = new Message();
	}

	public void setStatus(Message m)
	{
		isThere=true;
		message=m;
	}
	public void seenByUser(User u)
	{
		seenUser.add(u);
	}
}
