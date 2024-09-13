import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite um valor a ser calculado em fatorial: ");
        int numero = valor.nextInt();
        int fatorial = 1;

        for(int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é " + fatorial);

    }
}