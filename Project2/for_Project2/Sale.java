package for_Project2;

public class Sale{
	Clothes cloth;
	Date date;
	double price;
	
	
	

	public Sale(Clothes cloth2, double price, Date date) {
	this.cloth = cloth2;
	this.price = price;
	this.date = date;
	
	
	}
	// Should i create a getter and setter?

	public Clothes getCloth(){
		return cloth;
	}

	public Date getDate(){
		return date; 
	}

	public double price(){
		return price;
	} 

	public void setCloth(Clothes cloth){
		this.cloth = cloth;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public void setDate(Date date){
		this.date = date;
	}


	// how can write the return for the enum?  

	public String toString(){
		return cloth.getName() + ", " + price + ", " + date.toString(); 
	}
	

}