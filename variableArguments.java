import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers?: ");
        int count = scanner.nextInt();
        double[] input = new double[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            input[i] = scanner.nextDouble();
        }
        double result = average(input);
        System.out.println("Average: " + result);

        scanner.close();
    }

    static double average(double... numbers) {
        double sum = 0;
        if (numbers.length == 0) {
            return 0;
        }
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
