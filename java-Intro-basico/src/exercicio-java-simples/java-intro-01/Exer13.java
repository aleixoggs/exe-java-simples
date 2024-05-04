import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor Hora :");
        double valorHora = scan.nextDouble();
        
        System.out.println("Entre com a quantidade de horas trabalhadas no mês : ");
        double horas = scan.nextDouble();

        
        double salarioBruto =  valorHora * horas;
        double inss = (salarioBruto / 100) * 8;    
        double sindicato = (salarioBruto / 100) * 5;
        double ir = (salarioBruto / 100) * 11;
        double totalDescontos = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("O salario bruto é de: " + salarioBruto);
        System.out.println("O INSS é de: " + inss);
        System.out.println("O Sindicato é de: " + sindicato);  
        System.out.println("O IR é de: " + ir);
        System.out.println("O Total de Descontos é de: " + totalDescontos);
        System.out.println("O Salario Liquido é de: " + salarioLiquido);
    }
}
