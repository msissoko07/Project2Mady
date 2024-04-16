package for_Project2;

import java.util.Scanner;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Driver{
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//import file
		File file = new File("sale.txt");
		
		//read thru file
		Scanner scnr = new Scanner(file);
		
		
		//making an arrayList
		ArrayList<Sale> salesArray = new ArrayList<>();
		
		//going thru the line of my sale.txt
		while(scnr.hasNextLine()) {
			
			//take the entire line and makes into a string
		   String line = scnr.nextLine();
		   
		   // split up that string by a comma.
		   String[] parts = line.split(", ");
		   
		   //( grabbing from here
		   Clothes cloth = Clothes.valueOf(parts[0]);
		   
		   double price = Double.valueOf(parts[1]);
		   
		   String month = parts[2];
		   
		   int day = Integer.valueOf(parts[3]);
		   
		   int year = Integer.valueOf(parts[4]);
		   //until line 44)
		   
		   //make a date object
		   Date date = new Date(month, day, year);
		   
		   //make the sale object
		   Sale s = new Sale(cloth, price, date);
		   
		   // adding every object to the ArrayList
		   salesArray.add(s);
		}
		
		//making a month variable
		String january = "Januray";
		
		Date date = new Date(january, 01, 0001);
		
		//by comparing to nothing and get new value as you go thru it
		Sale max = new Sale(null, 0, date); 
		
		//goes thru the array list and compare the price.
		
		//and Update max by putting new bigger value
		for(Sale s : salesArray) {
			if(s.price() > max.price()) {
				
				max.setPrice(s.price());
				max.setCloth(s.getCloth());
				max.setDate(s.getDate());
			}
			
		}
		
		
		
		for(Sale s : salesArray) {
			
			
			System.out.println("Here is the list of items that are availlable in my online store: " + s.toString());

			
		}
	
		//System.out.println("Here is the list of items that are availlable in my online store: " + );
		
		
		
		System.out.println("The most expensive item is: " + max.getCloth() + " and the price is " + "$" + max.price());
		
		
		//Run until the user request a new info
		boolean p = true;
		
		//Scanner 2 for value in
		Scanner scnr2 = new Scanner(System.in);
		
		Scanner scnr3 = new Scanner(System.in);
		
		
		while(p) {
			//tell the person what to do
			System.out.println("Search items below your price: ");
			
			
			
			
			//get the user value
			double user = scnr2.nextDouble();
			
			
			//loop thru all the items 
			for(Sale s : salesArray) {
				if(s.price() < user) {
					
					System.out.println(s.toString());
				}
				
			}
			
			//user prompts 
			System.out.println("Press Y to continue or X to exist.");
			
			//get the user value
			String user2 = scnr3.nextLine();
			
			if(user2.equals("X") || user2.equals("x")) {
				p = false;
			}

		}
		
		//goodbye message.
		System.out.println("GoodBye! (:)");
		
		
		
		//most expensive 
		// My goal is to calculate my total profit. 
	}
}