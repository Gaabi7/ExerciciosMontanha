public class App {
    public static void main(String[] args) throws Exception {
        int primeiro = 0;
        int segundo = 1;
        int contador = 2;
        int proximo;

        System.out.print(primeiro + "," + segundo);
        
        while(contador < 10) {
            proximo = primeiro + segundo;
            System.out.print("," + proximo);

            primeiro = segundo;
            segundo = proximo;
            contador++;

        }
    }
}
