public class UsandoEqual {
    public static void main(String[] args){
        String senha = "1234";

    /* Usando somente o metodo "equals" ele irá comparar de forma com que qualquer
    carácter independente de ser em Upper case ou Lower case entre na validação*/

        if (senha.equals("1234")){
            System.out.println("Acesso autorizado!");
    }else{
            System.out.println("Senha incorreta.");
        }
    /* Já o "equalsIgnoreCase" irá comparar as Strings ignorando se elas foram escritas em
    UpperCase ou LowerCase */

        String senha_2 = "AbCd";
        if (senha_2.equalsIgnoreCase("aBcD")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }
    }
}