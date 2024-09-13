import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite um valor inteiro qualquer: ");
        int numero = valor.nextInt();

        if ((numero % 2) == 0){
            System.out.println("Deu par");
        }else{
            System.out.println("Deu impar");
        }

    }
}