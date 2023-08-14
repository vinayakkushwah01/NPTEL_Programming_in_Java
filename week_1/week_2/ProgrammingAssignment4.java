//Complete the code segment to call default constructor first and then any other constructor in the class.
/*
1 out of 1 tests passed.
You scored 100.0/100.
*/
// This is the main class Question
public class Question214{
	public static void main(String[] args){
		Answer a = new Answer(10,"MCQ");
	}
}
class Answer{
  
	 	Answer(){
		System.out.println("You got nothing.");
	}
	Answer(int marks, String type){	
    	this();
      
      
		System.out.println("You got "+marks+" for an "+ type);
	}
}