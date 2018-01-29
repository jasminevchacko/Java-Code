//I worked on this assignment alone, using only course materials.
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature in degrees Fahrenheit: ");
        double temp = input.nextDouble();

        double kelvTemp = (temp + 459.67) * (5.0 / 9);

        System.out.printf(temp + " degrees Fahrenheit is %.2f Kelvin\n",
            kelvTemp);
    }
}
