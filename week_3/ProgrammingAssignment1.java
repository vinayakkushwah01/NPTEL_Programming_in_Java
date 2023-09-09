import java.util.Scanner; //This package for reading input
public class Fibonacci { 

public static void main(String args[]) { 
	 Scanner sc = new Scanner(System.in);
	int n=sc.nextInt(); //Read an integer
System.out.println(fib(n)); //Generate and print the n-th Fibonacci                
                                     //number
    } 
static int fib(int n) {
int fp=0,fn=1,temp=3,f=0;


//complete the code segment to find the nth Fibonacci number in the Fibonacci sequence and return the value. Write the function recursively.for
do{
  if(n==1){
    f=0;
  }
  else if(n==2){
	f=1;
  }
  else{
    
	f =  fp+fn;
  	fp=fn;
  	fn=f;
  	temp++;
  }
  
  
}while(temp<=n);
  
return f;

}
}