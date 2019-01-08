package cs;

public class StringLab {
	
	/**
	 * Write a program that write the following data about the input word to Standard.out;
	 * (Following examples are for string "Virginia!")
	 * 		The character at index 3 is: 'g'
	 * 		The substring of last two characters of "Virginia!" is: "a!"
	 * 		The index value at character 'n' is: 5
	 * 		The length of the string "Virginia!" is: 9
	 *  
	 * @param word the word to output 
	 */
    public static void printStringFacts(String word) {
    	
    }
    
    /**
     * 
     * @param word the string to count vowels for
     * @return number of vowels in the word
     */
    public static int countVowels(String word) {
    	
    	//hint: use the charAt method (not on your green sheet) to check each index of the string
    	//for example charAt(i) == 'a'
    	return 0;
    }
    
    /**
     * Returns the users initials of first and middle name and and entire last name
     * 
     * @param name The name of person to print initials for
     * @return First and Middle initial and entire last name
     */
    public static String printInitials(String name) {
    	return "";
    }
    
    /**
     * 
     * @param wordsToSort the words to sort
     * @return a new String[] that is sorted in ascii ascending order
     */
    public static String[] sortWords(String[] wordsToSort) {
    	//hint use the compareTo() method to compare two Strings
    	//another hint:  a Trick with compareTo() is to think of it like lhs < rhs and then write it as lhs.compareTo(rhs) < 0
    	//So you move the operator after the compareTo and compare it to 0
    	return wordsToSort;
    }
    
    /**
     * 
     * @param wordsToSort the words to sort in place
     */
    public static void sortWordsInPlace(String[] wordsToSort) {
    	//This is similar to sortWords() method except this method will modify the input wordsToSort
    }
    
}
