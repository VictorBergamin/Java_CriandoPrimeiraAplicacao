import java.util.Scanner;

public class UsandoLoop {
    public static void main(String[] args) {

        //Iremos usar o arquivo anterior para usar de exemplo:
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int indice = 0;

        while (nota != -1) {
            System.out.println("Digite sua nota de 0 a 10: ");
            nota = leitura.nextDouble();

            if(nota != -1) {
                mediaAvaliacao += nota;
                indice++;
            }
        }

        System.out.println(mediaAvaliacao / indice);

    }
}