public class TiposVariaveis {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoLancamento = 2022;
        System.out.println(("Ano de lançamento: " + anoLancamento));

        double media = (10 + 3.5 + 7) / 3;
        System.out.println(media);

        String sinopse = """
                O filme se trata de uma obra protagonizada por um galã dos anos 80
                """;
        System.out.println(sinopse);

        int avaliacao = (int) media / 2; // Utilizando o casting (conversão de tipos)
        System.out.println(String.format("Quantidade de estrelas: %d", avaliacao));

    }
}