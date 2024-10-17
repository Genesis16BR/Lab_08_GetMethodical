public class CtoFTableDisplay {

    public static void main(String[] args) {
        // Display Celsius to Fahrenheit table
        System.out.println("Celsius\tFahrenheit");
        for (int celsius = -100; celsius <= 100; celsius++) {
            double fahrenheit = SafeInput.CtoF(celsius);
            System.out.printf("%d\t%.2f\n", celsius, fahrenheit);
        }
    }
}