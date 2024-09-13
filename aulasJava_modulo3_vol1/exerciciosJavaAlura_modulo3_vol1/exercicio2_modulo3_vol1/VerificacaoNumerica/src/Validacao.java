import java.util.Scanner;

public class Validacao {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número inteiro qualquer e o " +
                "sistema irá verificar se ele é negativo ou positivo");
        int valorNumerico = leitura.nextInt();

        if (valorNumerico < 0){
            System.out.println("O valor digitado é negativo!");
        }else{
            System.out.println("O valor digitado é positivo!");
        }

    }
}