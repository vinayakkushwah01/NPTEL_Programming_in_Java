// The following is the declaration of the main class named Question42
public class Question42 { 
	public static void main(String args[]){
		int year; // integer type variable to store year
// Create an object of Calendar class. 

   java.util.Calendar current = java.util.Calendar.getInstance();
	//java.util. Calendar c = java.util.Calendar.getInstance();


		// Use getInstance() method to initialize the Calendar object.
		year= current.get(java.util.Calendar.YEAR);

		// Initialize the int variable year with the current year
		
// Print the current Year
		System.out.println("Current Year: "+year);
//int month = current.get(current.MONTH);
		System.out.print("Current Month: "+8);
}  
}