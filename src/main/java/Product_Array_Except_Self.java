package main.java;

import java.util.Scanner;

public class Product_Array_Except_Self {
	public static void main(String[] args) {
		int number_of_elements;
		Scanner scanner = new Scanner(System.in);
		number_of_elements=scanner.nextInt();
		int []inputArray = new int[number_of_elements];
		int []resultArray=new int[number_of_elements];
		for(int i=0;i<number_of_elements;i++) {
			inputArray[i]=scanner.nextInt();
		}
		resultArray =  findproductArray(inputArray);
		for(int i=0;i<number_of_elements;i++) {
			System.out.println(resultArray[i]);
		}
	}
	
	public static int[] findproductArray(int []inputArray) {
		  int []resultArray = new int[inputArray.length];
		  if(inputArray.length<1){
		     return resultArray;
		  }
		  resultArray[0]=1;
		  for(int i=1;i<inputArray.length;i++){
		     resultArray[i]=resultArray[i-1]*inputArray[i-1];
		  }
		  int temp=1;
		  for(int j=inputArray.length-1;j>=0;j--){
		     resultArray[j]=resultArray[j]*temp;
		     temp=temp*inputArray[j];
		  }   
		  return resultArray;
     }
}
