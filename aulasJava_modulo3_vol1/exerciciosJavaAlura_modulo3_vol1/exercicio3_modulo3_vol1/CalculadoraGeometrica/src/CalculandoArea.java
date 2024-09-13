import java.util.Scanner;

public class CalculandoArea {
    public static void main(String[] args) {

        Scanner opcao = new Scanner(System.in);
        Scanner valorRaio = new Scanner(System.in);
        Scanner valorBase = new Scanner(System.in);
        double pi = 3.14;

        System.out.println("Digite o numero '1' para calcular a área do quadrado ou" +
                "'2' para calcular a área do círculo");
        int opcaoEscolhida = opcao.nextInt();

        if (opcaoEscolhida == 1){
            System.out.println("Digite o valor da base do quadrado: ");
            double valor = valorBase.nextDouble();
            double area = Math.pow(valor, 2);
            System.out.println("O valor da área do quadrado é igual à: " + area);
        } else if (opcaoEscolhida == 2) {
            System.out.println("Digite o valor do raio da circunferência: ");
            double valor = valorRaio.nextDouble();
            double area = pi * Math.pow(valor, 2);
            System.out.println("O valor da área do quadrado é igual à: " + area);
        }else{
            System.out.println("Valor inválido");
        }
    }
}