public class StringTraining {


    /**
     * @param firstname, ie : "Brandon"
     * @return a string that concatenates "Hello " and firstname, ie : "Hello Brandon"
     */
    public static String helloFirstname(String firstname) {
	return "Hello "+ firstname;
    }

/**
     * @param first  word, ie : "test"
     * @param second word, ie : "value"
     * @return a string with both word, ie : "testvalue"
     */
    public static String concatArgs(String first, String second) {
	
        return first + second;
    }
/**
     * @param origin  string, eg: "test"
     * @param compare string, eg: "sample"
     * @return if origin string is equal to compare string
     */
    public static boolean equals(String origin, String compare) {

        return (origin.equals(compare));
    }
/**
     * @param value character, eg: 't'
     * @return conversion of the character into String, eg: "t"
     */
    public static String charToString(char value) {
	String v=Character.toString(value);
        return v;
    }
/**
     * @param value integer, eg: 3
     * @return convertion of the integer into String, eg: "3"
     */
    public static String intToString(int value) {
	String str = Integer.toString(value);
        return str;
    }
/**
     * @param string, eg: "test"
     * @return string length, eg: 4
     */
    public static int length(String string) {
	int str = string.length();
        return str;
    }
/**
     * @param string, ie "test"
     * @return string in upper case, eg: "TEST"
     */
    public static String upper(String string) {
	String up = string.toUpperCase();
        return up;
    }
 /**
     * @param string, eg: "TEST"
     * @return string in lower case, eg: "test"
     */
    public static String lower(String string) {
	String up = string.toLowerCase();
        return up;
    }
 /**
     * @param string, eg: "test"
     * @return first character of the string, eg: 't'
     */
    public static char firstChar(String string) {
        char str = string.charAt(0); 
	return str;
    }
 /**
     * @param string, eg: "value"
     * @return last character of the string, eg: 'e'
     */
    public static char lastChar(String string) {
	char s = string.charAt(string.length() - 1);
        return s;
    }
/**
     * @param string, eg: "test"
     * @param begin   position (inclusive) of the substring, eg: 1
     * @param end     postion (exclusive) of the substring, eg: 3
     * @return the substring from begin position to end position, eg: "es"
     */
    public static String subString(String string, int begin, int end) {
        // https://howtodoinjava.com/java/string/java-string-substring-example/
	String str = string.substring(begin, end); 
        return str;
    }
/**
     * @param string, eg: "test"
     * @return the string with the first character in upper case, eg: "Test"
     */
    public static String capitalize(String string) {
	String str = string.substring(0,1).toUpperCase() + string.substring(1);
        return str;
    }
/**
     * @param string, eg: "test"
     * @param search  character, eg: 't'
     * @return the number of character occurrences in string, eg: 2
     */
    public static int occurrences(String string, char search) {
	int occurrence =0;
	for (int i=0; 1 <string.length(); i++){
		if (string.charAt(i) == search){
			occurrence++;
		}
	}
        return occurrence;
    }

    /**
     * @param string,  eg: "test"
     * @param search,  eg: 't'
     * @param replace, eg: 'w'
     * @return the string where searched characters are replaced, eg: "wesw"
     */
    public static String replaceChar(String string, char search, char replace) {
	String str = string.replace( search, replace );
        return str;
    }

    /**
     * @param string,  eg: "test"
     * @param search,  eg: "e"
     * @param replace, eg: "oa"
     * @return the string where searched substring are replaced, eg: "toast"
     */
    public static String replaceString(String string, String search, String replace) {
	String str = string.replace( search, replace );
        return str;
    }
 
    /**
     * @param string,    eg: "test|value"
     * @param delimiter, eg: "|"
     * @return string array that contains values splited on the delimiter, eg: {"test", "value"}
     */
    public static String[] split(String string, String delimiter) {
        // https://howtodoinjava.com/java/string/java-string-split-example/
	String[] partsArray = string.split(delimiter);
	
        return partsArray;
    }
  /**
     * @param strings    array, eg: {"test", "value"}
     * @param delimiter, eg: ";"
     * @return string of array values joined with the delimiter, ex: "test;value"
     */
    public static String join(String[] strings, String delimiter) {
        // https://howtodoinjava.com/java8/java-8-join-string-array-example/
	String str = String.join(delimiter, strings);
        return str;
    }

}
