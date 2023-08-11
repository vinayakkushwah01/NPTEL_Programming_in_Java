/*
2 out of 2 tests passed.
You scored 100.0/100.
*/

import java.util.Scanner;
public class ProgrammingAssignment3 {
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	  int sum=0;
//Use for or while loop do the operation.
int i=0,t=0;
while(t<=n){
  
  
  if((i%2)==0){
  		
    t++;
    
  		if((i%3)==0){
    			sum=sum+i;
 			 }
  		else{}
  }
  
  i++;
}
System.out.print(sum);

}
}