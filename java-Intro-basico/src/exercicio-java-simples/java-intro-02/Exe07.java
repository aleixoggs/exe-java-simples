import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Exe07 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o 1º numero :");
        int num1 = scan.nextInt();
        
        System.out.println("Entre com o 2º numero :");
        int num2 = scan.nextInt();
        
        System.out.println("Entre com a operação ( + - / * ) :");
        String operacao = scan.next();


        double result = 0;
        boolean valido = true;
        switch (operacao) {
            case "+":
                result = num1 + num2;
                 break;
            case "-":
                result = num1 - num2;
                 break;
            case "/":
                result = num1 / num2;
                 break;
            case "*":
                result = num1 * num2;
                 break;
        
            default: 
            System.out.println("Operação invalida");
                valido = false;
                break;
        }

        if (valido) {
            if (result >= 0) {
            System.out.println(result + " Positivo");
            } else{  
            System.out.println(result + " Negativo");
            }

        }
    }
}
