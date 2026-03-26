import java.util.Scanner;
public class Count { // vowel and consonent count
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to count vowels and consonants:");
        String s = scanner.nextLine();
        int vowelCount = 0, consonantCount = 0;



        s = s.toLowerCase(); // convert to lowercase for easier comparison


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);// get the character at index i
            if (c >= 'a' && c <= 'z') { // check if the character is a letter
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }


        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}