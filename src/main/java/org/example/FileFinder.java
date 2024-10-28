package org.example;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileFinder {

    // Method to recursively search for a file in a directory and its subdirectories
    public static void searchFile(File directory, String fileName, List<String> result) {
        File[] files = directory.listFiles();
        if (files == null) return;

        for (File file : files) {
            if (file.isDirectory()) {
                searchFile(file, fileName, result);
            } else if (file.getName().equalsIgnoreCase(fileName)) {
                result.add(file.getAbsolutePath());
            }
        }
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java FileFinder <directory_path> <file_name>");
            return;
        }

        String directoryPath = args[0];
        String fileName = args[1];
        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory.");
            return;
        }

        List<String> result = new ArrayList<>();
        searchFile(directory, fileName, result);

        if (result.isEmpty()) {
            System.out.println("File not found.");
        } else {
            System.out.println("File found at:");
            result.forEach(System.out::println);
        }
    }
}
