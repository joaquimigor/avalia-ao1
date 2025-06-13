import java.util.Scanner;

public class ConversorTemperaturas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a temperatura em Celsius
        System.out.print("Digite a temperatura em graus Celsius (°C): ");
        double celsius = scanner.nextDouble();

        // Converte Celsius para Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Converte Celsius para Kelvin
        double kelvin = celsius + 273.15;

        // Exibe os resultados
        System.out.println("\n--- Resultados da Conversão ---");
        System.out.printf("Temperatura em Celsius: %.2f °C%n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f °F%n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K%n", kelvin);

        scanner.close();
    }
}