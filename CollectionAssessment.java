import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;

public class CollectionAssessment {
    public static void main(String[] args) {
        // 1. Create an ArrayList of integers, add some elements, and print the list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(15);
        System.out.println("Original ArrayList: " + list);
        
        // Sort the list in ascending order 
        Collections.sort(list);
        System.out.println("Sorted ArrayList: " + list);
        
        // 2. Create a HashSet to store unique names and display them
        HashSet<String> names = new HashSet<>();
        names.add("Ashok");
        names.add("Sathish");
        names.add("Laavanya");
        names.add("Sathish");  // This duplicate will not be added
        System.out.println("HashSet (Unique Names): " + names);
        
        // 3. Create a HashMap to store student names as keys and their scores as values, then print the map
        HashMap<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Alice", 90);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 88);
        
        System.out.println("Student Scores: " + studentScores);
    }

}
