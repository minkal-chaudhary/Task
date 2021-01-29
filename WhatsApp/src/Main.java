
public class Main {

	public static void main(String [] args)
	{
		User ram=new User("Ram");
		System.out.println(ram.getName());
		
		 User shyam=new User("shyam");
		 User Nick=new User("nick");
		
		ram.addContact(shyam);
		ram.addContact(Nick);
		
		ram.getAllContacts();
		//shyam.getAllContacts();
		ChatRoom cr=ram.ChatRoom.get(shyam);
		cr.user1Msg("hi");
		cr.user2Msg("hello");
		cr.user1Msg("how are u");
		cr.user2Msg("I am fine what about you");
		cr.showMessages();
		shyam.addContact(Nick);
		shyam.getAllContacts();
	}
}
