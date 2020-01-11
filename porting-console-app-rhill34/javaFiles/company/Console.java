package company;

import java.util.Scanner;

/**
 *
 * @author susan
 * Date: 10/1/18
 * File: Console.java
 *
 * This class will add functionality to the
 * Scanner class(which is final so you can't extend)
 *  and will read input
 * from the keyboard as integers,
 * doubles, one word string(r, rock,
 * apple), and paragraph text(\n terminates the paragraph)
 *
 */
public class Console {
    // fields
    private static Scanner console; // null

    // constructors
    public Console() {
        // instantiate or create object console
        this.console = new Scanner(System.in);

    }
    public String readText(String prompt) {
        System.out.print(prompt);
        return console.nextLine();
    }
    public int readInt(String prompt) {
        System.out.print(prompt);
        // while stops program from throwing an exception
        // and ended
        while(!console.hasNextInt()) {
            console.nextLine(); // throw away bad data
            System.out.println("Not an integer, try again");
            System.out.print(prompt);
        }// while the data is not an integer

        // hasNextInt found an integer to read
        int num = console.nextInt();
        // clear return key from buffer
        console.nextLine();
        return num;
    }

    public double readDouble(String prompt) {
        System.out.print(prompt);
        while(!console.hasNextDouble()) {
            console.nextLine(); // throw away bad data
            System.out.println("Not a decimal, try again");
            System.out.print(prompt);
        }// while the data is not an double


        double num = console.nextDouble();
        console.nextLine();
        return num;
    }

    // getters/setters/other methods

    // toString()
    //@Override
    public String toString() {
        return console.toString();
    }

}
