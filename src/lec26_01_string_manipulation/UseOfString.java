package lec26_01_string_manipulation;

import java.util.Arrays;

public class UseOfString {

	public static void main(String[] args) {
		String s = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptas tempora debitis maiores nemo modi! Alias pariatur nulla rem ipsum, molestiae modi atque dignissimos eius impedit, dolorem iusto voluptatem qui ea?";
		
		// The Java String class length() method finds the length of a string.
		System.out.println("\n ------------------------------------------------------------------------\n");
		System.out.println(s + "\n");
		System.out.println("The length of the String is: " + s.length());
		
		// The java string toUpperCase() method returns the string in upper case letter.
		System.out.println("\n ------------------------------------------------------------------------\n");
		System.out.println(s.toUpperCase());
		System.out.println(s); // String is Immutable that's why it's value is not changed
		
		// The java string toLowerCase() method returns the string in lower case letter.
		System.out.println("\n ------------------------------------------------------------------------\n");
		System.out.println(s.toLowerCase());
		
		// charAt() -- Returns the char value at the specified index.
		// The index number starts from 0 and goes to n-1, where n is the length of the string. 
		System.out.println("\n ------------------------------------------------------------------------");
		System.out.println("\nThe character at a specific position(0): " + s.charAt(0));
		System.out.println("\nThe character at a specific position(10): " + s.charAt(10));
		System.out.println("\nThe character at a specific position(126): " + s.charAt(126));
		// System.out.println("\nThe character at a specific position(212): " + s.charAt(212)); // will show StringIndexOutOfBoundsException
		
		 s = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptas tempora debitis maiores nemo modi! Alias pariatur nulla rem ipsum, molestiae modi atque dignissimos eius impedit, dolorem iusto voluptatem qui ea?";
		
		// The Java String class indexOf() method returns the position of the first occurrence of the specified character or string in a specified string.
		System.out.println("\n ------------------------------------------------------------------------");
		System.out.println("\nThe character 'L' is, at the position of: " + s.indexOf('L')); // String indexing starts from 0
		System.out.println("\nThe character 'V' is, at the position of: " + s.indexOf('V')); 
		System.out.println("\nThe character 'v' is, at the position of: " + s.indexOf('v')); // case sensitive
		System.out.println("\nThe character 'm' is, at the position of: " + s.indexOf('m')); // if present more than one, the first own is recognized
		System.out.println("\nThe character 'x' is, at the position of: " + s.indexOf('x')); // if any character is absent, it shows -1.
		
		// Returns the index within this string of the first occurrence of the specified substring.
		System.out.println("\n ------------------------------------------------------------------------");
		System.out.println("\nThe index of 'dolor' word is in : " + s.indexOf("dolor"));
		System.out.println("\nThe index of 'Dolor' word is in : " + s.indexOf("Dolor")); // case sensitive
		System.out.println("\nThe index of 'debitis' word is in : " + s.indexOf("debitis"));
		System.out.println("\nThe index of 'pariatur' word is in : " + s.indexOf("pariatur"));

		 s = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptas tempora debitis maiores nemo modi! Alias pariatur nulla rem ipsum, molestiae modi atque dignissimos eius impedit, dolorem iusto voluptatem qui ea?";
		
		// Tough: 01
		// Please see this part carefully
		// To know the position of the repetitive character in which index:
		// s.indexOf('a', s.indexOf('a')+1))
		System.out.println("\n ------------------------------------------------------------------------");
		System.out.println("\nThe first 'r' character is - at the position of: " + s.indexOf('r')); // (2)
		System.out.println("\nThe second 'r' character is - at the position of: " + s.indexOf('r', s.indexOf('r')+1)); // Interview question
		System.out.println("\nThe third 'r' character is - at the position of: " + s.indexOf('r', s.indexOf('r', s.indexOf('r')+2)+1)); 
		// last occurrence of a character by lastIndexOf()
		System.out.println("\nThe last 'r' character is - at the position of: " + s.lastIndexOf('r')); 
		
		// The java string substring() method returns a part of the string.
		// this substring is important
		// The substring begins at the specified beginIndex and extends to the character at index (endIndex - 1)
		// start index 0, end index (25-1), similar like initialization block and conditional block in for loop
		// Please remember it, here 25 is upper limit which is excluded
		System.out.println("\n");
		System.out.println(s.substring(53)); // begin index 53, end index = last index
		System.out.println(s.substring(0, 25)); // begin index 0, last index = 25-1
		System.out.println("\n");
		System.out.println(s.substring(5, 65)); // begin index 5, last index = 65-1

		String s1 = "My name is John. ";
		String s2 = "My name is John. ";
		String s3 = "my name is john. ";
		String s4 = "MY NAME IS JOHN. ";
		// To compare Strings and return a boolean value
		// Returns 'true' if the given object represents a String equivalent to this
		// string, false otherwise
		System.out.println("------------------------------------------------------------------------\n");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		System.out.println("------------------------------------------------------------------------\n");
		// not part of this topic, just bring it here to show don't make mistake in String with ==
		// == is used in int
		int i = 20;
		int j = 20;
		int k = 25;
		System.out.println(i==j);
		System.out.println(i==k);
		System.out.println(j==k);
		
		System.out.println("\n------------------------------------------------------------------------\n");
		System.out.println(s3.equals(s4)); // how that can be solved? one way below -
		// Used 2 String method together
		System.out.println(s3.toUpperCase().equals(s4));
		System.out.println(s4.toLowerCase().equals(s3));
		
		// Two strings are considered equal ignoring case if they are of the same length
		// and corresponding characters in the two strings are equal ignoring case.
		System.out.println("\n------------------------------------------------------------------------\n");
		System.out.println(s3.equals(s4)); // how that can be solved, second way below--
		System.out.println(s3.equalsIgnoreCase(s4));
		
		// The java string trim() method eliminates leading and trailing spaces.
		// To avoid white space: trim() -- (remove any leading and trailing whitespace)
		System.out.println("\n------------------------------------------------------------------------\n");
		String s5 = "         HelloWorld.        ";
		System.out.println("Before Trim: " + s5);
		System.out.println("After Trim: " + s5.trim());
		
		// can't remove white space Between Words
		System.out.println("\n------------------------------------------------------------------------\n");
		String s6 = "    Hello    World!    ";
		System.out.println("After Trim: " + s6.trim()); // solution at line 140
		
		// The java string replace() method returns a string replacing all the old char
		// or CharSequence to new char or CharSequence.
		// To replace we use replace() method
		// Returns a string resulting from replacing all occurrences of oldChar in this
		// string with newChar.
		System.out.println("\n------------------------------------------------------------------------\n");
		String s7 = "Good morning mr";
		System.out.println("After replacing: " + s7.replace('m', 'M'));
		System.out.println("After replacing: " + s7.replace("mr", "Sir!"));
		
		// replace() can't trim
		System.out.println("\n------------------------------------------------------------------------\n");
		String s8 = "      GooD Morning      ";
		System.out.println("After replacing: " + s8.replace('D', 'd'));
		// using trim() and replace () together
		System.out.println("After triming and replacing: " + s8.trim().replace('D', 'd'));
		
		System.out.println("\n------------------------------------------------------------------------\n");
		String s9 = "      Good    MoRning      ";
		System.out.println("After triming and replacing: " + s9.trim().replace("    MoR", " Mor"));
		System.out.println("After triming and replacing: " + s6.trim().replace("    ", " "));
		System.out.println("After triming and replacing: " + s6.trim().replace("    World!", " World!"));
		
		System.out.println("\n------------------------------------------------------------------------\n");
		System.out.println("After triming and replacing: " + s5.trim().replace('.', '!'));
		
		System.out.println("\n------------------------------------------------------------------------\n");
		String s10 = "Hello! Let's learn together";
		System.out.println("After replacing a word: " + s10.replace("Hello!", "Welcome to Java."));
		
		System.out.println("\n------------------------------------------------------------------------\n");
		String dateOfToday = "09/06/2022"; // very much used
		System.out.println("After replacing: " + dateOfToday.replace('/', '-'));
		
		// The java string replaceAll() method returns a string replacing all the
		// sequence of characters matching regex and replacement string.
		System.out.println("\n------------------------------------------------------------------------\n");
		System.out.println("After replacing all, the complete String is: " + s10.replaceAll(s10, "Hey Hey captian!"));
		
		// regular way of concatenation
		System.out.println("\n------------------------------------------------------------------------\n");
		System.out.println("Hello" + " World!");
		System.out.println(s1 + s10);

		// Concatenation
		// The Java String class concat() method combines specified string at the end of
		// this string. It returns a combined string.
		System.out.println("\n------------------------------------------------------------------------\n");
		String s11 = "My name is ";
		String s12 = "Tofael";
		System.out.println(s11.concat(s12));
		
		System.out.println("\n------------------------------------------------------------------------\n");
		// Array - It will be discussed on 09/16 by Shohag
		String [] name1 = new String [4];
		String [] name2 = {"Abu Shaim", "Fargab", "Harun", "Khaleda"};
		int [] age = {43, 57, 98, 102};
		char [] sex = {'M', 'M', 'M', 'F'};
		
		// Tough: 2, will be used for Java coding challenge, very very important
		// how to convert a String to Character, we use toCharArray()
		String str1 = "Mr owl ate my metal worm";
		// char is variable type, [] = container, characterByCharacter = name of the Array
		char [] characterByCharacter = str1.toCharArray();
		// Arrays is a class, need to import and used to manipulate Array. you can't print Array without help of Arrays class
		System.out.println(Arrays.toString(characterByCharacter));
		
		System.out.println("\n------------------------------------------------------------------------\n");
		// Tough: 3, will be used for Java coding challenge, very very important
		String str2 = "Mr owl ate my metal worm";
		String [] words = str2.split(" "); // in short, split method convert a String to a String Type Array
		System.out.println(Arrays.toString(words));
		
		// The Java String class contains() method searches the sequence of characters in this string. This is used as method in many places
		System.out.println("\n ------------------------------------------------------------------------\n");
		String s13 = "How much you know about Java";
		System.out.println(s13.contains("much you know"));
		System.out.println(s13.contains("about"));
		System.out.println(s13.contains("hello"));
		System.out.println(s13.contains("Java"));
		
		// The java string startsWith() method checks if this string starts with given prefix.
		System.out.println("\n ------------------------------------------------------------------------\n");
		String s14 = "java by Oracle";
		System.out.println(s14.startsWith("j"));
		System.out.println(s14.startsWith("J")); 
		System.out.println(s14.startsWith("java"));
		System.out.println(s14.startsWith("Nava"));
		
		// The Java String class endsWith() method checks if this string ends with a given suffix.
		System.out.println("\n ------------------------------------------------------------------------\n");
		System.out.println(s14.endsWith("e"));
		System.out.println(s14.endsWith("E")); 
		System.out.println(s14.endsWith("oraclE"));
		System.out.println(s14.endsWith("Oracle"));
		
		// The Java String class isEmpty() method checks if the input string is empty or not.
		System.out.println("\n ------------------------------------------------------------------------\n");
		String s15 = "";
		String s16 = "Java";
		System.out.println(s15.isEmpty());
		System.out.println(s16.isEmpty());
		
			
		// This is not important from here
		/*
		 * The compareTo() method returns 0 if the two strings are equal, a number less than 0 if the first String is larger, 
		 * and a number greater than 0 if the second String is larger. Uppercase letters come before lowercase letters when 
		 * the method compares strings. As you work through learning this method's function,  use the ascii table to see how far apart the characters are from each other.
		 */
		// The Java String class compareTo() method compares the given string with the
		// current string lexicographically. It returns a positive number, negative number, or 0.
		
		System.out.println("------------------------------------------------------------------------\n");
		String s17 = "hello";
		String s18 = "hello";
		String s19 = "meklo";
		String s20 = "hemlo";
		String s21 = "flag";
		String s22 = "Hello";  // h=104, H=72, based on ASCII table
		System.out.println(s17.compareTo(s18)); // 0 because both are equal
		System.out.println(s17.compareTo(s19)); // -5 because "h" is 5 times lower than "m"
		System.out.println(s17.compareTo(s20)); // -1 because "l" is 1 times lower than "m"
		System.out.println(s17.compareTo(s21)); // 2 because "f" is 2 times lower than "h"
		System.out.println(s17.compareTo(s22)); // Please see line 239
		
		// The Java String class lastIndexOf() method returns the last index of the
		// given character value or substring.
		System.out.println("\n ------------------------------------------------------------------------\n");
		String s23 = "this is index of examples"; // there are 2 's' characters in this sentence		
		System.out.println(s23.indexOf('s')); // First one: 3
		// returns last index of 's' char value
		System.out.println(s23.lastIndexOf('s')); // 24
		
		// The java string valueOf() method converts different types of values into string.
		// how to turn int, float etc. to String
		System.out.println("\n ------------------------------------------------------------------------\n");
		int age1 = 30;
		String s24 = String.valueOf(age1);
		System.out.println(s24 + 10); // concatenating string with 10
		
		// The Java String class join() method returns a string joined with a given delimiter.
		System.out.println("\n ------------------------------------------------------------------------\n");
		String joinTheString = String.join("*", "welcome", "to", "Java");
		System.out.println(joinTheString);
	}

}
