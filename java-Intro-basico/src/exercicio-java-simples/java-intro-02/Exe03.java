import java.util.Scanner;

public class Exe03 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite qualquer letra: ");


        String letra = scan.next();
        
        //Metodo 1 
        // if(letra.equalsIgnoreCase("a") ||letra.equalsIgnoreCase("e") ||
        //      letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
        //        letra.equalsIgnoreCase("u") ){

        //         System.out.println("São Vogais");
            
        //     } else{
                
        //         System.out.println("São Consoantes");
        //     }


        // Metodo 2
        if (letra.length() == 1){


            switch (letra) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u": 
                case "A":
                case "E":
                case "I":
                case "O":
                case "U": 
                    System.out.println("São Vogais"); 
                    break;
                default:
                System.out.println("São Consoantes"); 
                    break;
            }
        } else {
             System.out.println("Infomação não e valida! ");
        }
    }
}