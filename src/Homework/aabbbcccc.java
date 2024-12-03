package Homework;

public class aabbbcccc {
    public static void main(String[] args) {
 String test= "a2b3c4";
 StringBuilder out = new StringBuilder();

 for(int i=0;i<test.length();i+=2)
 {
     char character = test.charAt(i);       // Get the character
     int count = Character.getNumericValue(test.charAt(i + 1)); // Get the number

     // Append the character 'count' times to the output
     for (int j = 0; j < count; j++) {
         out.append(character);
     }
 }
        // Print the output
        System.out.println(out.toString());

 
    }
}
