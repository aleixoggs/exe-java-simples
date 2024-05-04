import java.util.Scanner;

public class Exe08 {
    public static void main(String[] ags){

        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para vítima ?");
        String resposta1 = scan.next();
        System.out.println("Esteve no local do crime ?");
        String resposta2 = scan.next();
        System.out.println("mora perto da vítima ?");
        String resposta3 = scan.next();
        System.out.println("Devia para a vítima ?");
        String resposta4 = scan.next();
        System.out.println("Já tabalhou com vítima ?");
        String resposta5 = scan.next();
        
        int cont= 0;

        if (resposta1.equalsIgnoreCase("s")) {
            cont++;
        }
        if (resposta2.equalsIgnoreCase("s")) {
            cont++;
        }
        if (resposta3.equalsIgnoreCase("s")) {
            cont++;
        }
        if (resposta4.equalsIgnoreCase("s")) {
            cont++;
        }
        if (resposta5.equalsIgnoreCase("s")) {
            cont++;
        }
        if (cont == 2 ) {
            System.out.println("Suspeito");
            
        } else if(cont == 3 || cont == 4){
            System.out.println("Cúmplice");
            
        }else if(cont == 5){
            System.out.println("Assassino");
            
        } else{
            System.out.println("Inocente");

        }
    
    }
}
