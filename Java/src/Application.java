

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author mohi
 */
public class Application {

    public static void main(String[] args) throws IOException {

        int number, input;
        int max = 0;
        int secondMax = -1;
        int steps = 0;

        Scanner reader = new Scanner(System.in);

        System.out.println("Please write your number ");
        input = reader.nextInt();
        number = input;
        /*
         Here we check if the number is even or odd, 
         based on the result, we calcualte the next number
         variable "steps" is counting the steps until we reach digit 1
         */
        while (number != 1) {
            steps++;

            if (number % 2 == 1) {
                number = 3 * number + 1;
            } else {
                number = number / 2;
            }
            /*
             Below we are finding the maximum and 
             the second maximum number in the sequence
             */
            if (number > max) {
                secondMax = max;
                max = number;
            } else if (number > secondMax) {
                secondMax = number;
            }
        }

        printResults(input, secondMax, steps);

    }
    /*
    In the method below, we are creating a html file 
    and appending the results of the calculations to that file.
    The result is also printed in console. 
    The html file could be found in the project directory with the name "results.html"
     */

    private static void printResults(int input, int secondMax, int steps) throws IOException {
        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("<html><body>");
        htmlBuilder.append("Input number is: " + input
                + "<br>Second maximum: " + secondMax
                + "<br>Number of steps: " + steps);
        htmlBuilder.append("</body></html>\n");

        FileWriter writer = new FileWriter(System.getProperty("user.dir") + "/results.html");
        writer.write(htmlBuilder.toString());
        writer.close();

        System.out.println("Input number is: " + input
                + "\nSecond maximum: " + secondMax
                + "\nNumber of steps: " + steps);

    }

}
