import java.util.Scanner;

public class DiferencaValores {
    public static void main(String[] args) {

        Scanner valor1 = new Scanner(System.in);
        Scanner valor2 = new Scanner(System.in);

        System.out.println("Digite um valor inteiro aleatório :");
        int numero1 = valor1.nextInt();

        System.out.println("Digite outro valor inteiro aleatório :");
        int numero2 = valor2.nextInt();

        if (numero1 == numero2) {
            System.out.println("Ambos apresentam valores iguais");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro valor é maior que o segundo");
        } else if (numero2 > numero1) {
            System.out.println("O segundo valor é maior que o primeiro");
        }
    }
}