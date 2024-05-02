import java.util.Scanner;

public class Exe05 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor Hora :");
        double valorHora = scan.nextDouble();
        
        System.out.println("Entre com a quantidade de horas trabalhadas no mês : ");
        double horas = scan.nextDouble();

        
        double salarioBruto =  valorHora * horas;

        int percentualIr = 0;

        if (salarioBruto <= 900) {
            percentualIr= 0;

        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            percentualIr = 5;
        
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            percentualIr = 10;

        } else if (salarioBruto >= 2500) {
            percentualIr = 20;
        }

        double ir = (salarioBruto / 100) * percentualIr;    
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double totalDescontos = inss + ir;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("O salario bruto é de: (" + valorHora + " * "+ horas +") = " + salarioBruto );
        System.out.println("O IR é de: (" + percentualIr + "%) = "+ ir);
        System.out.println("O INSS (10%)é de :" + inss);  
        System.out.println("O FGTS (11%) é de: " + fgts);
        System.out.println("O Total de Descontos é de: " + totalDescontos);
        System.out.println("O Salario Liquido é de: " + salarioLiquido); 
    }
}