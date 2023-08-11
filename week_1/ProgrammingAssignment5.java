/*
2 out of 2 tests passed.
You scored 100.0/100
*/


import java.util.Scanner;
public class ProgrammingAssignment5{
    public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
         double mark_avg;
         int result;
         int i;
         int s;
      //define size of array
       s = input.nextInt();
     //The array is defined "arr" and inserted marks into it.
      int[] arr = new int[s];   
      for(i=0;i<arr.length;i++)
	  {
	arr[i]=input.nextInt();
        }
//Initialize maximum element as first element of the array.  
int  max = arr[0];
int sum=0;

   //Traverse array elements to get the current max.
for(i=0; i<arr.length; i++){
  	sum=sum+arr[i];
  
  if(arr[i]>max){
			max= arr[i];
  }
}


   //Store the highest mark in the variable result.
result = max;
System.out.println(result);
   //Store average mark in avgMarks.
mark_avg = sum/arr.length;
System.out.print(mark_avg);


}
}