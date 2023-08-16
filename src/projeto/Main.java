package projeto;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        double valorInicial = scan.nextDouble();

        double taxaJuros = scan.nextDouble();

        int periodo = scan.nextInt();

        double resultado1 = calcularInvestimento(valorInicial, taxaJuros, periodo);

        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        System.out.println("Valor final do investimento: R$ " + deci.format(resultado1));

        scan.close();

    }

    public static double calcularInvestimento(double valor_inicial, double taxa_juros, int periodo) {
        double valor_final = valor_inicial * Math.pow(1 + taxa_juros, periodo);
        return valor_final;
    }

}
