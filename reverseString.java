import java.util.Scanner;
public class reverseString {
public static void main(String[] args) {
// TODO: implement reverseString()


Scanner scanner = new Scanner(System.in); 

// create a Scanner object to read input from the user
//System.out.println("Enter a string to reverse:");//
String s = scanner.nextLine(); // read the input string from the user


char[] charArray = s.toCharArray();
//System.out.println(charArray); // print the char array
int left = 0;                       // left pointer starts at the beginning of the array
int right = charArray.length-1; // right pointer starts at the end of the array
while (left<right){
    char temp = charArray[left];
    charArray[left] = charArray[right];
    charArray[right] = temp;
    left++;
    right--;
}// char array is now reversed

String reversedString = new String(charArray); // convert the reversed char array back to a string
System.out.println(reversedString);//

// i have a string and i want to reverse it by converting it to a char array and then reversing the char array and then converting it back to a string
// Expected output: "olleh"

}
}