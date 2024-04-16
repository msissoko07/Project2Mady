package for_Project2;


public class Date{
	String month;
	int date; 
	int year; 

	public Date(String month, int date, int year){

		this.month = month;
		this.date = date;
		this.year = year;

	}

	public String toString(){
		return month + ", " + date + ", " + year + ", ";
	}
}