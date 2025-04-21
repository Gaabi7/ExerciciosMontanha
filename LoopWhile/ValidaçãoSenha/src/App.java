import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int senha = 0; 
        
        while (senha != 1234) {
            System.out.print("Digite a senha: ");
            senha = scanner.nextInt();

            if (senha != 1234) {
                System.out.println("Senha incorreta, tente novamente. ");
            }
            
        }

        System.out.println("Acesso concedido");
    }
}
