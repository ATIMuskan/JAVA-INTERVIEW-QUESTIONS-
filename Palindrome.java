import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a palindrome:");
        String s = scanner.nextLine();
        String clearstring = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();// remove all non alphanumeric characters and convert to lowercase
        System.out.println(clearstring);
        char[] charArray = clearstring.toCharArray();
        int i = 0, j = s.length() - 1;
        while(i<j){
            if(charArray[i] != charArray[j]){
                System.out.println("The string is not a palindrome.");
                return;
            }
            i++;
            j--;
        }
        System.out.println("The string is a palindrome.");



    }}