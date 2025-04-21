import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Menu: \n1. Adicionar\n2. Remover\n3. Sair");
            System.out.println("Digite Qual ação deseja realizar: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Ação de Adicionar Executada!");
            } else if (opcao == 2) {
                System.out.println("Ação de Remover Executada!");

            } else if (opcao == 3) {

            } else {
                System.out.println("Opção invalida, tente novamente: ");
            }
            
        } while (opcao != 3);

        scanner.close();
    }
}
