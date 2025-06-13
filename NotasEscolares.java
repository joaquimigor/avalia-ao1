import java.util.Scanner;

public class NotasEscolares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notasAnuais = new double[8];

        System.out.println("Olá! essa e a avaliaçao.");
        System.out.println("Por favor, insira as 8 notas anuais do aluno:");

        // Obter as 8 notas anuais do aluno
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notasAnuais[i] = scanner.nextDouble();
        }

        // Calcular as médias bimestrais
        double media1Bimestre = (notasAnuais[0] + notasAnuais[1]) / 2;
        double media2Bimestre = (notasAnuais[2] + notasAnuais[3]) / 2;
        double media3Bimestre = (notasAnuais[4] + notasAnuais[5]) / 2;
        double media4Bimestre = (notasAnuais[6] + notasAnuais[7]) / 2;

        // Calcular as médias semestrais
        double media1Semestre = (media1Bimestre + media2Bimestre) / 2;
        double media2Semestre = (media3Bimestre + media4Bimestre) / 2;

        // Calcular a média final
        double mediaFinal = (media1Semestre + media2Semestre) / 2;

        // Apresentar os resultados
        System.out.println("\n--- Resultados das Médias ---");

        System.out.printf("1º Bimestre: %.1f\n", media1Bimestre);
        System.out.printf("2º Bimestre: %.1f\n", media2Bimestre);
        System.out.printf("1º Semestre: %.1f\n", media1Semestre);
        System.out.println("-----------------------");

        System.out.printf("3º Bimestre: %.1f\n", media3Bimestre);
        System.out.printf("4º Bimestre: %.1f\n", media4Bimestre);
        System.out.printf("2º Semestre: %.1f\n", media2Semestre);
        System.out.println("-----------------------");

        System.out.printf("Média Final: %.1f\n", mediaFinal);

        scanner.close();
    }
}