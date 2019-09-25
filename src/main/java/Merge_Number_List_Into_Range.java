package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Merge_Number_List_Into_Range {
	public static List<String> mergeNumberList(int[] inputArray, int numberofElements) {
		List<String> outputStringList = new ArrayList<>();
		if(inputArray.length<1) {
			return outputStringList;
		}
		int startElement = inputArray[0];
		boolean addStartElementFlag = true;
		for(int i=1;i<inputArray.length;i++) {
			if(inputArray[i]==inputArray[i-1]) {
				continue;
			}
			if(inputArray[i]!=inputArray[i-1]+1) {
				outputStringList.add(startElement + "->"+inputArray[i-1]);
				startElement=inputArray[i];
				addStartElementFlag=(i==inputArray.length)?false:true;
			}
		}
		if(addStartElementFlag) {
			outputStringList.add(startElement + "->"+startElement);
		}
		return outputStringList;
	}
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfElements;
		numberOfElements = scanner.nextInt();
		int[] inputArray = new int[numberOfElements];
		for (int i = 0; i < numberOfElements; i++) {
			inputArray[i] = scanner.nextInt();
		}
		System.out.println(mergeNumberList(inputArray, numberOfElements));
	}
}
