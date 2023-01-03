package lec73_java_coding_challenge;

// Que: How many 'z/Z'  inside the provided String? They like to confuse you by not saying upper or lower
// you have to ask is it upper case or lower case?
// Better not to ask if they don't define

public class B04_countASpecificCharacterFinal {

	public static void main(String[] args) {
		String s = "ZiyadZ Alz KhilanliezZZZ";
		// alternate of B03
		s=s.toLowerCase(); // if we use it in line 16 like B03, execution time is more, so we used here
		int count = 0;
		
		for (int i=0; i<s.length(); i++) {
			// you can also convert the String to Upper case [toUpperCase()] and look for 'Z'
			if(s.charAt(i) == 'z') { // how many z, regardless of upper case or lower case
				count++;
			}
		}
		System.out.println(count);
	}

}
