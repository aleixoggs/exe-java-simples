import java.util.Scanner;
import java.util.Random;

public class JogoAdvinha {
    public static void main(String[] args) throws Exception {
        Random gerador = new Random();
        int x = gerador.nextInt(100);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Adivinhe o numero que estou pensando: ");
        int numero = entrada.nextInt();
    
        if (numero == x) {
            System.out.println("Parabéns, você acertou!! eu pensei no " + x);
        } else System.out.println("Que pena, você errou!! o numero era " + x);
    }
}
