import java.util.Random;
import java.util.Scanner;

public class JogoDaSorte {
    public static void main(String[] args) {

        int numero = new Random().nextInt(100);
        Scanner resposta = new Scanner(System.in);
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5){
            System.out.println("Digite um número entre 0 e 100");
            numeroDigitado = resposta.nextInt();
            tentativas++;

            if (numeroDigitado == numero){
                System.out.println("Parabéns!! Você acertou o número!!");
                break;
            } else if (numeroDigitado > numero) {
                System.out.println("O numero digitado é maior que o número Randomico");
            } else {
                System.out.println("O numero digitado é menor que o número Randomico");
            }

            if (tentativas == 5 && numeroDigitado != numero){
                System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numero);
            }

        }
    }
}