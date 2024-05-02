import java.util.Scanner;

public class Exe06 {
    

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int ano = scan.nextInt();

        if((ano % 400 == 0) && (ano % 4 == 0 && ano % 100 != 0)){

            System.out.println("É bissexto");
        }else{
        System.out.println("É bissexto");   
        }
    }
}
