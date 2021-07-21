package ordering;
import java.util.Scanner;
//this is package ordering
//here, customer will shop by entering the product number and number of bags he needs
//and then total price is displayed

public class Customer {
   
    public void getOrder() {
	  
    	
	    int productNumber;
	    int Bags = 0;
	    double totalPrice = 0.0;
	    double overAllBill = 0.0;
	    String choice = null;
	    double price = 0.0;
	    
	    Scanner scan = new Scanner(System.in);

	    do {
	       //Inputs from the customers
	    	
	    	System.out.println();
	        System.out.println("Enter product details:");
	        
	        
	        System.out.println("Product Number: ");
	        productNumber = scan.nextInt();
	        
	        if(productNumber==0 || productNumber>6) {
	        	
	        	try {           
	        		
	        		throw new ArithmeticException();     //Exceptional Handling
	        	}
	        	catch(ArithmeticException e) {
	        		System.out.println("Enter valid product number:");
	        		 productNumber = scan.nextInt();
	        	}
	        	
	        }
	      
	        System.out.println("Number of Bags: ");
	        Bags = scan.nextInt();

	        if(productNumber==1) {  //conditional statements to provide respective price for the product entered
	        	                     //by the customer
	        	price= 1650.0;
	        }
	        else if(productNumber==2 ) {
	        	price= 1950.0;
	        }
	        else if(productNumber==3 ) {
	        	price= 1850.0;
	        }
	        else if(productNumber==4 ) {
	        	price= 1800.0;
	        }
	        else if(productNumber==5 ) {
	        	price= 950.0;
	        }
	        else if(productNumber==6 ) {
	        	price= 3400.0;
	        }
	        
	        
	        totalPrice = price * Bags; //  total price per product entered

	        overAllBill += totalPrice;  // calculate overall price for all the products entered

	     
	        System.out.println("Do you want to add more item? (yes or no): ");
	        choice = scan.next();
	        
	       } while (choice.equalsIgnoreCase("yes") ); //String Handling
	    
          
	      System.out.println("\nTotal Price = Rs." + overAllBill); //Final Bill

	      
	      scan.close();
	  }

}
