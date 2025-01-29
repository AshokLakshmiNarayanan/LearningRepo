

import java.util.regex.Pattern;

public class SingleClass {

    private static SingleClass instance;

    // Step 2: Make the constructor private to prevent instantiation from outside the class
    private SingleClass() {
        // Private constructor to prevent instantiation
    }

    // Step 3: Provide a public method to get the instance of the class
    public static SingleClass getInstance() {
        // Step 4: Initialize the instance only if it is not already created
        if (instance == null) {
            synchronized (SingleClass.class) {
                // Double-checked locking to ensure thread safety
                if (instance == null) {
                    instance = new SingleClass();
                }
            }
        }
        return instance;
    }

    // Example method to demonstrate the Singleton class functionality
    public void showMessage() {
        System.out.println("Singleton Pattern: Only one instance created.");
    }

    // Main method to test the Singleton implementation
    public static void main(String[] args) {
        // Get the single instance of the Singleton class
        SingleClass singleton1 = SingleClass.getInstance();
        SingleClass singleton2 = SingleClass.getInstance();

        // Check if both references point to the same instance
        System.out.println("Are both instances the same? " + (singleton1 == singleton2));

        // Call a method on the Singleton instance
        singleton1.showMessage();
    }
}