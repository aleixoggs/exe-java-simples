import java.util.Scanner;

public class Exe04 {
    
    public static void main(String[] args) {
        
            Scanner scan = new Scanner(System.in);

            System.out.println("Informe o 1º numero:  ");
                int num1 = scan.nextInt();
            
            System.out.println("Informe o 2º numero:  ");
                int num2 = scan.nextInt();
            
            System.out.println("Informe o 3º numero:  ");
                int num3 = scan.nextInt();

        if(num1 <= num2 && num1 <= num3 && num2 <= num3 ){
            // 1 e menor  / 3 e maior / 1 < 2 < 3
            System.out.println("A ordem do maior para o menor é: ");
            System.out.println(num3 + " - " + num2 +" - " + num1);
        }

        if(num1 <= num2 && num1 <= num3 && num3 <= num2 ){
            // 1 e menor  / 3 e maior / 1 < 3 < 2
            System.out.println("A ordem do maior para o menor é: ");
            System.out.println(num2 + " - " + num3 +" - " + num1);
        }

        if(num2 <= num1 && num2 <= num3 && num3 <= num3 ){
            // 2 e menor  / 3 e maior / 2 < 1 < 3
            System.out.println("A ordem do maior para o menor é: ");
            System.out.println(num3 + " - " + num1 +" - " + num2);
        }

        if(num2 <= num1 && num2 <= num3 && num3 <= num1 ){
            // 2 e menor  / 1 e maior / 2 < 3 < 1
            System.out.println("A ordem do maior para o menor é: ");
            System.out.println(num1 + " - " + num3 +" - " + num2);
        }

        if(num3 <= num1 && num3 <= num2 && num1 <= num2 ){
            // 3 e menor  / 2 e maior / 3 < 1 < 2 
            System.out.println("A ordem do maior para o menor é: ");
            System.out.println(num2 + " - " + num1 +" - " + num3);
        }
        
        if(num3 <= num1 && num3 <= num2 && num2 <= num1 ){
            // 3 e menor  / 1 e maior / 3 < 2 < 1 
            System.out.println("A ordem do maior para o menor é: ");
            System.out.println(num1 + " - " + num2 +" - " + num3);
        }

    }


}
