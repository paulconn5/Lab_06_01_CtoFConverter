import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double temp = 0;
        double ftemp;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temp in celsius:");
        if (in.hasNextDouble()) {
            temp = in.nextDouble();
        } else {
            System.out.println("Invalid entry");
            in.nextLine();
        }

        ftemp = (temp * 9/5) + 32;

        System.out.println("Temperature in fahrenheit: " + ftemp);
    }
}