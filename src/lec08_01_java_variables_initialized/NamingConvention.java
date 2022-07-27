package lec08_01_java_variables_initialized;

// Projects names generally starts with UpperCase
// Camel case example for a project --> July2022CoreJava
// Alternative example of Camel case (Called snake_case), for a project --> July_2022_core_java 

// Package names are generally starts with lowerCase
// Camel case example for a package --> lec01JavaBasics
// Alternative example of Camel case (Called snake_case), for a package --> lec01_java_basics

// Class names starts with UpperCase 
// Class names are usually nouns or noun phrases.
// Camel case example for a class --> NamingConvention
// Alternative example of Camel case (Called snake_case), for a class --> Naming_convention


public class NamingConvention {
	// non-constant field/variable names starts with lowerCase
	// variable names must be specific and meaningful
	// (variable name) no duplication is accepted inside the same class
	// public is an access modifier, int is the type of variable, houseNumber is the name of the variable
	public int houseNumber = 625; // variable initialized
	public int avenueNumber; // variable declared
	
	// constant names are written with all upper case letters with words separated by underscores
	// We will use it in automation framework, no need to worry about it right now
	public String WEDDING_REGISTRY_PAGE_TITLE = "Amazon Wedding";
	public int LONG_WAIT = 10;
	
	// names like "string1, myarray1, no_1" are not acceptable as variable names
	// because they are are not specific and can cause confusion like the variable below:
	public String string = "String"; // not appreciated
	
	// Constructor name is same as Class Name
	public NamingConvention() {
		System.out.println("From Constrcutor");
	}
	
	// method names start with lowerCase
	// method names are usually verbs or verb phrase
	// method name can be (possible) same as Class name (important info, but not mandatory to be same as class name)
	// no duplicate method name is accepted inside the same class
	public static void namingConventions() { // method implemented
		System.out.println("This is from method");
	}

	public static void main(String[] args) { 
		System.out.println("This is all about Naming Convention");

	}

}
