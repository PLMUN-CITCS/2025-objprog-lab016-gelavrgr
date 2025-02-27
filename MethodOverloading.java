// File Naming Convention: MethodOverloading.java

public class MethodOverloading {
    public static void main(String[] args) {
        // Call the overloaded printValue methods
        printValue(10);          // Calls the method with an int parameter
        printValue(3.14);       // Calls the method with a double parameter
        printValue("Hello!");    // Calls the method with a String parameter
    }

    // Method to print an integer value
    public static void printValue(int number) {
        System.out.println("Integer value: " + number);
    }

    // Method to print a double value
    public static void printValue(double number) {
        System.out.println("Double value: " + number);
    }

    // Method to print a String value
    public static void printValue(String text) {
        System.out.println("String value: " + text);
    }
}
