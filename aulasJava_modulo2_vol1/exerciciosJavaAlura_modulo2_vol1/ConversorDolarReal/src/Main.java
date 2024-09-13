public class Main {
    public static void main(String[] args) {

        double valorDolar = 10;
        double valorReais = valorDolar * 4.94;
        double percentualDesconto = 80;
        double valorDesconto = (percentualDesconto * valorReais) / 100;
        double valorTotal = valorReais - valorDesconto;
        System.out.println(valorTotal);

    }
}