//Remove repeated characters from a string, keeping only the first occurrence.
import java.util.Scanner;
public class removeDuplicate {

public static void main (String args[]){

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a string to remove duplicates:");
    String s = scanner.nextLine();// read the input string from the user
    
    String result = "";

    for(int i = 0 ; i<s.length(); i++){
        char c = s.charAt(i);// get the character at index i
        if(result.indexOf(c) == -1){ // check if the character is not already in the result string
            result += c; // if not, add it to the result string
        }
    }
    
    // result will store the string after removing duplicates how 
    /*
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (result.indexOf(c) == -1) {
            result += c;
        }
    }
    */
    System.out.println("String after removing duplicates: " + result);
}




}