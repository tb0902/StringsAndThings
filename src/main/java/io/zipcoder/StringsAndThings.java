package io.zipcoder;


import org.codehaus.plexus.util.StringUtils;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        int yChecker = 0;
        int zChecker = 0;

        String[] letters = input.split(" "); // splits the input string by spaces
        for (String letter : letters) { // for a new string 'letter' in the split string 'letters' we made,
            if (letter.toLowerCase().endsWith("y")) { // if one ends in y
                yChecker++; // the y checker will increase
            } else if (letter.toLowerCase().endsWith("z")) { // if one ends in x
                zChecker++; // the z checker will increase
            }
        }
        return yChecker + zChecker; // returns the value of the two checkers
    }
// passes


    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {
        String newBase = base.replace(remove, ""); // .replace will just replace the string with the 'remove value'
        return newBase; // return the new string
    }
//passes

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        String checkForIs = "is"; // checking for is in the string
        String checkForNot = "not"; // checking for not in the string

        int isChecker = (StringUtils.countMatches(input, checkForIs)); // 'countMatches' checks an object for a value in its parameters
        int notChecker = (StringUtils.countMatches(input, checkForNot)); // and produces a value

        if (isChecker == notChecker) { // if the two are equal,
            return true; // return true
        } else // if not,
            return false;

    }
// passes

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
        int g = 0;
        int happy = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.substring(i, i + 1).equals("g")) {
                g++;
            }
            if (i < input.length() - 1 && input.substring(i + 1, i + 2).equals("g")) {
                happy++;
            } else if (i > 0 && input.substring(i - 1, i).equals("g")) {
                happy++;
            }
        }
        return (g == happy);
    }
    //passes 10 - 15 for some reason
    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int newString = input.length(); // makes a new string of the string length
        int count = 0; // keep the counter of each time the below loop happens

        for (int i = 0; i < newString-2; i++) { // loops through but is at -2 because you need at least 3 spaces to be a triple
            char temp = input.charAt(i); // stores the char at the iteration in the loop
            if (temp == input.charAt(i+1) && temp == input.charAt(i+2)) { // if that char is equal to the char in front and two spaces in front
                count++; // increase the counter
            }

    } return count; // return the counter as a value
}
}