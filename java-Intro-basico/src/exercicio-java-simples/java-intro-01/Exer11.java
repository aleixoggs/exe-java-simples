import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um numero 1 inteiro :");
        int num1 = scan.nextInt();
        
        System.out.println("Entre com um numero 2 inteiro :");
        int num2 = scan.nextInt();
        
        System.out.println("Entre com um numero 3 inteiro :");
        double num3 = scan.nextDouble();

        int result1 = (num1 * 2) * (num2 / 2);
        
        double result2 = (num1 * 3) + num3;

        double result3 = Math.pow(num3,3);

        System.out.println("Resultado 1: " + result1);
        System.out.println("Resultado 2: " + result2);
        System.out.println("Resultado 3: " + result3);

    }
}
