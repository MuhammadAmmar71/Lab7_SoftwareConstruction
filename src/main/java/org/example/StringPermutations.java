package org.example;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {

    // Method to generate all permutations of a given string
    public static List<String> generatePermutations(String input) {
        List<String> result = new ArrayList<>();
        if (input == null || input.isEmpty()) {
            return result;
        }
        permute(input, "", result);
        return result;
    }

    // Helper method for recursion
    private static void permute(String str, String prefix, List<String> result) {
        if (str.isEmpty()) {
            result.add(prefix);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            permute(remaining, prefix + currentChar, result);
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        List<String> permutations = generatePermutations(input);
        System.out.println("Permutations of " + input + ": " + permutations);
    }
}
