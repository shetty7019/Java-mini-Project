package conclusion;
//This is package conclusion
//here at the end the thank statements are displayed once customer is done shopping

public  class EndConclusion extends Thread{  //threads
	
	public EndConclusion(String order) {
	
		super(order); //using super
		start(); //Start of thread which calls the run
		
	}
	

	public void run() {  //enters the child thread
		
			System.out.println();
			System.out.println("YOUR ORDER IS PLACED");
			System.out.println();
			System.out.println("Thank you for ordering");
			System.out.println("You can recieve your products in 2 days at our outlet.");
			
	     }
	
     }
