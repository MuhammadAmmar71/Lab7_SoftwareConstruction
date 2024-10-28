package org.example.Test;

import org.example.StringPermutations;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class StringPermutationsTest {

    @Test
    public void testPermutations() {
        List<String> permutations = StringPermutations.generatePermutations("abc");

        // Verify that there are 6 unique permutations for "abc"
        assertEquals(6, permutations.size(), "There should be 6 permutations for 'abc'.");
        assertTrue(permutations.contains("abc"));
        assertTrue(permutations.contains("acb"));
        assertTrue(permutations.contains("bac"));
        assertTrue(permutations.contains("bca"));
        assertTrue(permutations.contains("cab"));
        assertTrue(permutations.contains("cba"));
    }
}
