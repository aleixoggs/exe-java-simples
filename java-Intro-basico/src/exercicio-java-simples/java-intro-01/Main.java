import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scan =  new Scanner(System.in);

    System.out.println("Digite seu Nome completo : ");
    String nomeCompleto = scan.nextLine();
    System.out.println("Seu nome Completo e : " + nomeCompleto);

    System.out.println("Digite seu primeiro Nome : ");
    String primeiroNome = scan.next();
    System.out.println("Seu primeiro nome é " + primeiroNome);

    System.out.println("Digite Sua idade : ");
    int idade = scan.nextInt();
    System.out.println("Sua idade e : " + idade);


    }
}