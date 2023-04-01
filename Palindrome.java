import java.util.*;

public class Palindrome{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String inputString = sc.nextLine();

    // Create a stack to hold the characters of the input string
    Stack<Character> stack = new Stack<Character>();

    // Push all the characters of the input string onto the stack
    for (int i = 0; i < inputString.length(); i++) {
      char c = inputString.charAt(i);
      stack.push(c);
    }

    // Build a string by popping characters from the stack
    String RString = "";
    while (!stack.isEmpty()) {
      char c = stack.pop();
      RString += c;
    }

    // Check if the reversed string is equal to the original input string
    if (inputString.equals(RString)) {
      System.out.println("The input string is a palindrome.");
    } else {
      System.out.println("The input string is not a palindrome.");
    }
  }
}