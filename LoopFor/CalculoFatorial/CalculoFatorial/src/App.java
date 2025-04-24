import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int i;
        int fatorial = 1;

        System.out.println("Digite um numero positivo para fazer o fatorial: ");
        numero = scanner.nextInt();

        for (i = 1; i <= numero; i++) {
            fatorial = fatorial * i;

        }

        System.out.println("Fatorial de " + numero + " é: " + fatorial);

        scanner.close();
    }
}
