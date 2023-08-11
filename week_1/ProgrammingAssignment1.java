/*
1 out of 1 tests passed.
You scored 100.0/100.
*/


import java.util.Scanner;  
public class ProgrammingAssignment1 {
       public static void main(String[] args) {
Scanner s = new Scanner(System.in); 
       double radius= s.nextDouble();
       double perimeter;
       double area;
if (radius<=0){
    System.out.print("please enter non zero positive number ");
	}
else{
		perimeter=2*(Math.PI)*radius;
		area=(Math.PI)*radius*radius;

		System.out.print(perimeter+"\n"+area);
	}
	

}
}