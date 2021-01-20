import java.util.*;

public class User extends Person{
	
	
	
	ArrayList<User> contacts;
	HashMap<User,ChatRoom> ChatRoom;
	Status status;
	
	
	
	public User(String name) {
		super(name);
		 this.contacts = new ArrayList<>();
		 ChatRoom = new HashMap<>(); 
	     /* this.status = new Status(); */
		
	}



	public void addContact(User u) {
		contacts.add(u);
		ChatRoom.put(u,new ChatRoom(this,u));
	}
	public void addStatus(Message m) {
		status.setStatus(m);
	}
	public void seeStatusOfUser(User u)
	{
		u.status.seenByUser(u);
	}



	public void getAllContacts() {
		System.out.println("Contacts Of "+this.getName()+":");
		for(int i=0;i<contacts.size();i++){
			System.out.println(contacts.get(i).getName());
		}
		
	}



	


	

}
