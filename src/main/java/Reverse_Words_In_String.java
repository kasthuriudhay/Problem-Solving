package main.java;

import java.util.Scanner;

public class Reverse_Words_In_String {
	public static void main(String[] args) {
		String inputString;
		Scanner scanner = new Scanner(System.in);
		inputString = scanner.nextLine();
		Reverse_Words_In_String reverseWordsObject = new Reverse_Words_In_String();
		System.out.println(reverseWordsObject.reverseWords(inputString));
	}

	public String reverseWords(String s) {
		StringBuilder outputString = new StringBuilder();
		int start = 0;
		int i = 1;
		for (i = 1; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				outputString.append(reverse(s, start, i - 1));
				outputString.append(s.charAt(i));
				start = i + 1;
			}
		}
		if (i == s.length()) {
			outputString.append(reverse(s, start, i - 1));
		}
		return new String(outputString);
	}

	public String reverse(String s, int start, int end) {
		StringBuilder outputString = new StringBuilder();
		for (int i = end; i >= start; i--) {
			outputString.append(s.charAt(i));
		}
		return outputString.toString();
	}
}
