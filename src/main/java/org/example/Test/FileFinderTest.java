package org.example.Test;

import org.example.FileFinder;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FileFinderTest {

    @Test
    public void testFileSearch() {
        // Adjust the path to match the actual location of "testfile.txt"
        File testDir = new File("src/main/java/org/example/Test");
        List<String> result = new ArrayList<>();
        FileFinder.searchFile(testDir, "testfile.txt", result);

        assertTrue(result.size() > 0, "File should be found in the specified directory.");
    }
}
