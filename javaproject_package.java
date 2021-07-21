package javaProject;
import conclusion.EndConclusion; //importing packages
import ordering.Customer; //importing packages

//this is package javaProject.
//here, initial welcome and disclaimer is displayed
//then the product details as well.


interface Welcome{ //Using Interface to execute WELCOME statements
	
	void Introduction();
	
}

interface Disclaimer{  //Interface to execute disclaimer
	
	void Information();
	
}

class  begin implements Welcome{    //implementing the interface WELCOME
       public void Introduction() {
		
		System.out.println("Welcome To Gopi Feeds.");
		System.out.println("Enjoy Shopping!");
		System.out.println();
		
	}
}

class fact implements Disclaimer{   //implementing the interface DISCLAIMER
     public void Information() {
		
		System.out.println("Important Information: Each bag weighs 50Kg ");
		
	}
}

class Product{   //a Class to display product details
	
	Product(int num,String name, double rate) //parameters in constructor
	 {
		
		  System.out.println("\t"+num   +name+"  "+rate); //to displaying all the products and its details
		
	}
	
	
	
}

public  class Shopping  {

	public static void main(String[] args) {
		
		Welcome obj1=new begin(); //created reference to interface Welcome using object of class begin
		Disclaimer obj2=new fact();//created reference to interface Disclaimer using object of class fact
		obj1.Introduction(); 
		obj2.Information();
		
		System.out.println( "\nProduct Number\t\tProduct Name\t\t\t  Price   \n"); 
		Product item1=new Product(1,"\t\tsheep feed\t\t\t",1650.0);
		Product item2=new Product(2,"\t\tBroiler pre-starter\t\t",1950.0);
		Product item3=new Product(3,"\t\tBroiler starter\t\t\t",1850.0);
		Product item4=new Product(4,"\t\tBroiler finisher\t\t",1800.0);
		Product item5=new Product(5,"\t\tMaize\t\t\t\t",950.0);
		Product item6=new Product(6,"\t\tSoya Bean doc(7.5 conc)\t\t",3400.0);
		
		
		Customer order=new Customer(); //creating an object for Customer class
		
		order.getOrder(); 
		
		EndConclusion t1=new EndConclusion("Order");  //creating an object for EndConclusion 
	
	}
	

	
	
	
}

