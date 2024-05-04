import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o tamanho do arquivo: ");
        double tamanhoArquivo = scan.nextDouble();

        System.out.println("Entre com a velicidade da internet: ");
        double velicidadeInternet = scan.nextDouble();


        double tempo =  tamanhoArquivo /  velicidadeInternet;

        System.out.println("Tempo de download: " + tempo);
    }
}
