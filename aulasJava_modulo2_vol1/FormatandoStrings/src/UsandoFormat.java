public class UsandoFormat {
    public static void main(String[] args) {

        /* Usando o String Format, podemos encaixar as váriaveis em exibições
         de texto no console, veja o exemplo a seguir: */

        // Método 1:

        String nome = "Victor";
        int idade = 26;
        double altura = 1.85;

        System.out.println(String.format (" Meu nome é %s, tenho %d anos de idade e minha altura em metros é de %.2f.", nome, idade, altura ));

        // Método 2:

        String nome_2 = "João";
        int aulas = 4;

        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome_2 , aulas);

        System.out.println(mensagem);

    }
}