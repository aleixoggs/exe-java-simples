import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a nota 01 : ");
        double nota1 = scan.nextDouble();
        
        System.out.println("Entre com a nota 02 : ");
        double nota2 = scan.nextDouble();
        
        System.out.println("Entre com a nota 03 : ");
        double nota3 = scan.nextDouble();
        
        System.out.println("Entre com a nota 04 : ");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4 ) / 4;

        System.out.println("A media é : " + media);

    }
}
