/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package activtity.vowelcount;

/**
 *
 * @author RC_Student_lab
 */
import java.util.Scanner;

public class VowelCount {

public static void main(String[] args) {
Scanner code = new Scanner(System.in);

System.out.print("Enter a sentence: ");
String sentence = code.nextLine();

int vowelCount = countVowels(sentence);
System.out.println("Number of vowels: " + vowelCount);

code.close();
}

public static int countVowels(String sentence) {
int count = 0;
// Convert the string to lowercase
sentence = sentence.toLowerCase(); 

// Iterate through the string
for (int i = 0; i < sentence.length(); i++) {
char ch = sentence.charAt(i); 

// Check if the character is a vowel
if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
count++;
}
}
// Return the total count of vowels
return count; 
}
}
