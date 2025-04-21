import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int valor;

        do {
            System.out.println("Digite um numero entre 1 e 100");
            valor = scanner.nextInt();

        } while (valor < 1 || valor > 100);

        System.out.println("Numero valido: " + valor);
        scanner.close();
    }
}
