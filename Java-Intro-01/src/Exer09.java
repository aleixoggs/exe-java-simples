import java.util.Scanner;

public class Exer09 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com a temperatura em farenheit: ");
        double f = scan.nextDouble();

        double c = (5 * (f - 32) / 9);
        

        System.out.println("A temperatura em gaus C: " + c );

    }
}
