//AZSortFromFile.java
//This program sorts the items in ListWriter.java from A-Z and displays them as a list

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class AZSortFromFile {
    public static void main(String[] args) {
        String fileName = "items.txt";
        ArrayList<String> items = readItemsFromFile("list.txt");

        if (items != null) {
            Collections.sort(items);
            System.out.println("Sorted items:");
            for (String item : items) {
                System.out.println(item);
            }
        }
    }

    private static ArrayList<String> readItemsFromFile(String fileName) {
        ArrayList<String> items = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                items.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return null;
        }

        return items;
    }
}
