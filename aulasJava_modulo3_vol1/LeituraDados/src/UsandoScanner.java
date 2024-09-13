import java.util.Scanner;

public class UsandoScanner {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito ");
        String filme = leitura.nextLine();
        System.out.println("Digite o ano de lançamento: ");
        int anoLancamento = leitura.nextInt();
        System.out.println("Digite sua nota de 0 a 10: ");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoLancamento);
        System.out.println(avaliacao);
    }
}