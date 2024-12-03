package Homework;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_char {
    public static void main(String[] args) {

        String inputString = "sapna";

        // Creating a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterating over each character in the string
        for (char c : inputString.toCharArray()) {
            // If character is already in map, increment count
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // If character is not in map, add it with count 1
                charCountMap.put(c, 1);
            }
        }

        // Displaying characters and their counts
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("Character '" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
        }
    }
}

