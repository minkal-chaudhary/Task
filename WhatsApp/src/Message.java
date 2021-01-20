
public class Message {
	
	Text text;
	Image image;
	Video video;
	Audio audio;
	
	public Message() {
		super();
		this.text = new Text();
		this.image =new Image();
		this.video = new Video();
		this.audio = new Audio();
	}	
	
}
