import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Clients data initializing:
        String clientName = "Victor Costa Bergamin";
        String acountTipe = "Current Acount";
        double balance = 1546.98;

        System.out.println("************************");
        System.out.println("\nClient name: " + clientName);
        System.out.println("Acount tipe: " + acountTipe);
        System.out.println("Acount balance: " + balance);
        System.out.println("\n************************");

        //Menu options:
        System.out.println("\nOperation");
        Scanner value = new Scanner(System.in);
        System.out.println("1 - Consult balance");
        System.out.println("2 - Receive value");
        System.out.println("3 - Transfer value");
        System.out.println("4 - Quit");
        int choosenOption = value.nextInt();

        //Looping
        int repeating = 0;
        while (repeating == 0){
            if (choosenOption == 1){
                System.out.println("Your current balance is: " + balance);
                System.out.println("\n1 - Consult balance");
                System.out.println("2 - Recieve value");
                System.out.println("3 - Transfer value");
                System.out.println("4 - Quit");
                break;
            } else if (choosenOption == 2) {
                System.out.println("Insert the value to be recieved: ");
                double valueRecieved = value.nextDouble();
                balance += valueRecieved;
                System.out.println("\nYour current balance is: " + balance);
                System.out.println("\n1 - Consult balance");
                System.out.println("2 - Recieve value");
                System.out.println("3 - Transfer value");
                System.out.println("4 - Quit");
            } else if (choosenOption == 3) {
                System.out.println("Insert the value to be send: ");
                double valueSend = value.nextDouble();
                balance -= valueSend;
                System.out.println("\nYour current balance is: " + balance);
                System.out.println("\n1 - Consult balance");
                System.out.println("2 - Recieve value");
                System.out.println("3 - Transfer value");
                System.out.println("4 - Quit");
            } else if (choosenOption == 4) {
                System.out.println("Thanks for using our app! Have a good business!");
                repeating = 1;
            }else{
                System.out.println("Invalid option!");
                System.out.println("\n1 - Consult balance");
                System.out.println("2 - Recieve value");
                System.out.println("3 - Transfer value");
                System.out.println("4 - Quit");
            }
        }


    }
}