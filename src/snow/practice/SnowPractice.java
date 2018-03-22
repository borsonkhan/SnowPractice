package snow.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class SnowPractice {

	public static void main(String[] args) {

		System.out.println("Q11 = " + Arrays.toString(getEvenList(10)));

		System.out.println("Q12 = " + Arrays.toString(getOddList(10)));

		System.out.println("Q13 = " + getTextList(18));

		System.out.println("Q14 = " + getComments(15));

		int[] numberlist = { 2, 4, 8, 90 };

		System.out.println("Q15 = " + getMinimumNum(numberlist));

		int[] numlist = { 2, 4, 8, 90 };

		System.out.println("Q16 = " + getMaximumNumber(numlist));

		System.out.println("Q17 = " + getValue(10));

		System.out.println("Q18 = " + getValueOfInt("20"));

		System.out.println("Q19 = " + getCharacter("borsonkhan"));

		System.out.println("Q20 = " + getSumOfIndex("borsonkhan"));
	}

	/*
	 * 
	 * Q11 = write a method that take one number input and return an array that
	 * contain 0 to given number;
	 * 
	 * input = int number;
	 * 
	 * return type = int[] ;
	 * 
	 * serving bucket = Array;
	 * 
	 */

	public static int[] getEvenList(int number) {

		int[] evenList = new int[number + 1];

		for (int i = 0; i <= number; i++) {

			evenList[i] = i;

		}

		return evenList;

	}

	/*
	 * 
	 * Q12 = write a method take one number input and return an array that contain 1
	 * to that given number;
	 * 
	 * input = int number;
	 * 
	 * return type = int [];
	 * 
	 * serving bucket = Array;
	 * 
	 */

	public static int[] getOddList(int number) {

		int[] oddList = new int[number];

		for (int i = 1; i <= number; i++) {

			oddList[i - 1] = i;

		}

		return oddList;

	}

	/*
	 * 
	 * Q13 = write a method that take one number input and return number list 0 to
	 * given number;
	 * 
	 * input = int number;
	 * 
	 * return type = ArrayList<Integer>;
	 * 
	 * servingbucket = list;
	 * 
	 */

	public static ArrayList<Integer> getTextList(int number) {

		ArrayList<Integer> textList = new ArrayList<Integer>();

		for (int i = 0; i <= number; i++) {

			textList.add(i);

		}

		return textList;

	}

	/*
	 * 
	 * Q14 = write a method that take one number input and return a number "fizz" if
	 * 
	 * the given number divided by 5 and return "buzz" if the given number divided
	 * 
	 * by 5&&3 otherwise return "fizzbuzz";
	 * 
	 * 
	 * 
	 * input = int number;
	 * 
	 * return type = String;
	 * 
	 * serving bucket = variable;
	 * 
	 */

	public static String getComments(int number) {

		String comments = null;

		if (number % 5 == 0 && number % 3 == 0) {

			comments = "buzz";

		} else if (number % 5 == 0) {

			comments = "fuzz";

		} else {

			comments = "fizzbuzz";

		}

		return comments;

	}

	/*
	 * 
	 * Q15 = write a method that take one number array input and return the minimum
	 * number ;
	 * 
	 * input = int[] numberlist;
	 * 
	 * return type = int;
	 * 
	 * serving bucket = variable;
	 * 
	 */

	public static int getMinimumNum(int[] numberlist) {

		int minimumNum = numberlist[0];

		for (int i = 0; i < numberlist.length; i++) {

			if (minimumNum > numberlist[i]) {

				minimumNum = numberlist[i];

			}

		}

		return minimumNum;

	}

	/*
	 * 
	 * Q16 = write a method that take one number array and return the maximum
	 * number;
	 * 
	 * input = int[] numlist;
	 * 
	 * return type = int;
	 * 
	 * serving bucket = variable;
	 * 
	 */

	public static int getMaximumNumber(int[] numlist) {

		int maximumNumber = numlist[0];

		for (int i = 0; i < numlist.length; i++) {

			if (maximumNumber < numlist[i]) {

				maximumNumber = numlist[i];

			}

		}

		return maximumNumber;

	}

	/*
	 * 
	 * Q17 = write a method that take a number input and return the same value as
	 * string;
	 * 
	 * input = int number;
	 * 
	 * return type = String;
	 * 
	 * serving bucket = variable;
	 * 
	 */

	public static String getValue(int number) {

		String value = " ";

		String massage = String.valueOf(number);

		value = massage;

		return value;

	}

	/*
	 * 
	 * Q18 = write a method that take a string representation of number input and
	 * return the same value as a int;
	 * 
	 * input = String name;
	 * 
	 * return type = int ;
	 * 
	 * serving bucket = variable;
	 * 
	 */

	public static int getValueOfInt(String name) {

		int value = 0;

		int massage = Integer.valueOf(name);

		value = massage;

		return value;

	}

	/*
	 * 
	 * Q19 = write a method take string input and return true if it contain char 'o'
	 * 
	 * otherwise false;
	 * 
	 * input = String name;
	 * 
	 * return type = boolean;
	 * 
	 * serving bucket = variable;
	 * 
	 */

	public static boolean getCharacter(String name) {

		boolean character = true;

		character = name.contains("o");

		return character;

	}

	/*
	 * 
	 * Q20 = write a method that take one string input and return the sum of all
	 * 
	 * index;
	 * 
	 * input = String name;
	 * 
	 * return type = int;
	 * 
	 * serving bucket = variable;
	 * 
	 */

	public static int getSumOfIndex(String name) {

		int sum = 0;

		for (int i = 0; i < name.length(); i++) {

			sum = sum + i;

		}

		return sum;

	}

}
