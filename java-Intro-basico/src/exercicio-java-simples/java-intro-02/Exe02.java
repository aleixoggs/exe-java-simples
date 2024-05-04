import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        
        Scanner scan =  new Scanner(System.in);

        System.out.println("Infome o sexo f ou m:");
        
        //Metodo char:
        //char sexo = scan.next().charAt(0);
        // if (sexo == 'f') {
        //     System.out.println("Sexo Feminino");
        // }else if (sexo == 'm') {
        //     System.out.println("Sexo Masculino");
        // } else{
        //     System.out.println("Nao e valido!!");
        // }

        String sexo = scan.next();
        

        if (sexo.equalsIgnoreCase("f")) {
            System.out.println("Sexo Feminino");
        }else if (sexo.equalsIgnoreCase("m")) {
            System.out.println("Sexo Masculino");
        } else{
            System.out.println("Nao e valido!!");
        }



    }
}
