/*
  2 out of 2 tests passed.
You scored 100.0/100.
*/

import java.util.Scanner;  
public class ProgrammingAssignment2 {
       public static void main(String[] args) {
Scanner s = new Scanner(System.in); 
        int x = s.nextInt(); 
        int y = s.nextInt();
int z = s.nextInt();
int result = 0;
//Use if...else ladder to find the largest among 3 numbers and store the largest number in a variable called result.

if(x>y && x>z){
  	result= x;
}
else if(y>z && y>x){
	result= y;
}
else if(z>y && z>x)
{
  result = z;
}
else{
  result =x;
}


  

System.out.print(result);

    
}
}