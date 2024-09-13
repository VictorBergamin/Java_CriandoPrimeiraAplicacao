public class UsandoCondicionais {
    public static void main(String[] args) {

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamento!!");
        }else{
            System.out.println("Filme pra relembrar os velhos tempos");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")){ // Usa-se || para indicar "or" e && para indicar "and"..
            System.out.println("Filme liberado");
    }else{
            System.out.println("Alugue o filme!");
        }
    }
}