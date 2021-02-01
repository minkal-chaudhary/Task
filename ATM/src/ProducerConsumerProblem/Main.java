package ProducerConsumerProblem;

public class Main { 
	public static void main(String[] args) 
		throws InterruptedException 
	{ 
		// ProducerConsumer class that has both produce() 
		// and consume() methods 
		 ProducerConsumer pc = new ProducerConsumer(); 

		// Create producer thread 
		Thread t1 = new Thread(new Runnable() { 
			
			public void run() 
			{ 
				try { 
					pc.produce(); 
				} 
				catch (InterruptedException e) { 
					e.printStackTrace(); 
				} 
			} 
		}); 

		
		Thread t2 = new Thread(new Runnable() { 
			
			public void run() 
			{ 
				try { 
					pc.consume(); 
				} 
				catch (InterruptedException e) { 
					e.printStackTrace(); 
				} 
			} 
		}); 

		
		t1.start(); 
		t2.start(); 

		t1.join(); 
		t2.join(); 
	} 
}
