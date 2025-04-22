import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(20) +1;
        int palpite;
        int tentativas = 0;

        System.out.println("Tente adivinha o numero entre 1 e 20.");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("O numero é maior. ");

            } else if (palpite > numeroSecreto) {
                System.out.println("o numero é menor. ");

            }

        } while (palpite != numeroSecreto);

        System.out.println("Parabéns! Você acertou o número, você chutou: " + tentativas + " vezes.");

        scanner.close();

    }
}
