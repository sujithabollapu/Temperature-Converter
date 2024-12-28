import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double temperature;
            char unit;

            System.out.print("Enter temperature: ");
            temperature = input.nextDouble();
            input.nextLine(); 
            System.out.print("Enter unit (C/F/K): ");
            unit = input.nextLine().charAt(0);

            switch (unit) {
                case 'C':
                case 'c':
                    System.out.printf("%.2f C = %.2f F%n", temperature, celsiusToFahrenheit(temperature));
                    System.out.printf("%.2f C = %.2f K%n", temperature, celsiusToKelvin(temperature));
                    break;
                case 'F':
                case 'f':
                    System.out.printf("%.2f F = %.2f C%n", temperature, fahrenheitToCelsius(temperature));
                    System.out.printf("%.2f F = %.2f K%n", temperature, fahrenheitToKelvin(temperature));
                    break;
                case 'K':
                case 'k':
                    System.out.printf("%.2f K = %.2f C%n", temperature, kelvinToCelsius(temperature));
                    System.out.printf("%.2f K = %.2f F%n", temperature, kelvinToFahrenheit(temperature));
                    break;
                default:
                    System.out.println("Invalid unit.");
                    break;
            }
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9 / 5) - 459.67;
    }
}
