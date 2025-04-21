import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int soma = 0;

        System.out.println("Digite numeros positivos para somar e negativo para sair: ");
        numero = scanner.nextInt();

        while(numero >= 0) {
            soma += numero;
            System.out.println("Digite mais um n5umero: ");
            numero = scanner.nextInt();
        }

        System.out.print("A soma dos numeros positivos é: " + soma);

        scanner.close();
    }
}
