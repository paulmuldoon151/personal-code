package uulib;
import java.util.Scanner;

/**
 * Scanner based input with error handling
 *
 * @version 4.0.2
 * @author Aiden McCaughey
 */
public class Console {

    public static String VERSION = "4.0.2";

    // global scanner object
    static Scanner scanner = new Scanner(System.in);

    /**
     * Prompt for and Read an integer from the console
     * 
     * @param prompt to display on console
     * @return integer input at console
     */
    public static int getInt(String prompt) {        
        System.out.print(prompt);
        // while an integer is not available on input steam 
        while (!scanner.hasNextInt()) {
            // print error and advance to next value on input stream
            System.out.println("Invalid integer. Please re-enter");
            scanner.next();
        }
        // integer must be available so return as method result
        return scanner.nextInt();
    }

    /**
     * Prompt for and Read a double from the console
     * 
     * @param prompt to display on console
     * @return double input at console
     */
    public static double getDouble(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid double. Please re-enter");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    /**
     * Prompt for and Read a float from the console
     * 
     * @param prompt to display on console
     * @return float input at console
     */
    public static float getFloat(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextFloat()) {
            System.out.println("Invalid float. Please re-enter");
            scanner.next();
        }
        return scanner.nextFloat();
    }

    /**
     * Prompt for and Read a boolean from the console
     * 
     * @param prompt to display on console
     * @return boolean input at console
     */
    public static boolean getBoolean(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextBoolean()) {
            System.out.println("Invalid boolean. Please re-enter");
            scanner.next();
        }
        return scanner.nextBoolean();
    }

    /**
     * Prompt for and Read a char from the console
     * 
     * @param prompt to display on console
     * @return char input at console
     */
    public static char getChar(String prompt) {
        System.out.print(prompt);
        // read next line
        String line = scanner.nextLine();
        // while a single character was not entered
        while (line.length() != 1) {
            // print error, and load next line
            System.out.println("Invalid input. Please re-enter a single character");
            line = scanner.nextLine();
        }
        // single character must have been entered so return char at position 0 in line
        return line.charAt(0);
    }

    /**
     * Prompt for and Read a string from the console
     * 
     * @param prompt to display on console
     * @return string input at console
     */
    public static String getString(String prompt) {
        System.out.print(prompt);
        String result = scanner.nextLine();
        // ensure a line of at least one character is entered
        while (result.length() == 0 ) {
            result = scanner.nextLine();
        }
        return result;
    }
}
