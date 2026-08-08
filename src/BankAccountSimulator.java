import java.util.Scanner;

public class BankAccountSimulator {

    // Campos da classe para que outros métodos (como exibirResumo) possam acessá-los.
    private static String name = "";
    private static double balance = 0;
    private static String agencyNumber = "";

    /**
     * Exibe um resumo da conta em uma única linha no formato:
     * "Resumo da conta: Nome: <name> | Agência: <agencyNumber> | Saldo: $<balance>".
     * Caso ainda não exista conta criada (nome vazio, agência vazia ou saldo igual a zero),
     * imprime uma mensagem avisando que é preciso criar a conta antes.
     */
    public static void exibirResumo() {
        if (name.equals("") || agencyNumber.equals("") || balance == 0) {
            System.out.println("You must create your account first");
        } else {
            System.out.println("Resumo da conta: Nome: " + name
                    + " | Agência: " + agencyNumber
                    + " | Saldo: $" + balance);
        }
    }

    public static void main(String[] args) throws Exception {
        //TODO: To Know and import Scanner Class.
        //Show messages of user.
        //Get by Scanner Class the input values of terminal.
        //Show the message "Account Created"

        Scanner scanner = new Scanner(System.in);
while (true){
        System.out.println("Hello, Welcome to FutureBank, please press the number corresponding to the option you wish to perform:");
        System.out.println("To create your account, press -> 1");
        System.out.println("To show your balance, press -> 2");
        System.out.println("To show your nome, press -> 3");
        System.out.println("To see your number and agency, press -> 4");
        System.out.println("To show a summary of your account, press -> 5");
        System.out.println("To Exit -> 6");

            int inputUser = scanner.nextInt(); //get the input of the user

        //verification of input

        if (inputUser == 2) {
            if (balance == 0) {
                System.out.println (" You must create your account first");
            }
            else{
            System.out.println ("Your balance is $" + balance);
            }
        }

        if (inputUser == 3) {
            if (name.equals("")) {
              System.out.println (" You must create your account first");
             }
             else{
                System.out.println("Your name is:" + name);
             }
        }

        if (inputUser == 4) {
            if (agencyNumber.equals("")) {
            System.out.println (" You must create your account first");
            }
            else {
                System.out.println ("Your agency number is:" + agencyNumber);
            }
        }

        if (inputUser == 5) {
            // Nova opção de menu: exibe o resumo da conta em uma única linha.
            exibirResumo();
        }

        if (inputUser == 1) {
            scanner.nextLine();

            System.out.println ("Please, enter your name:");
            name = scanner.nextLine();

            System.out.println ("Please, enter the number of agency:");
            agencyNumber = scanner.nextLine();

            System.out.println ("Please, enter your initial balance:");
            String balanceInput = scanner.nextLine();

                // Convert to  double
                balance = Double.parseDouble(balanceInput.replace(",", "."));

            System.out.println ("Thank you for creating an account in our bank, your agency number is:" +agencyNumber+ ", and your balance is:" +balance+ "!");
        }
        if (inputUser == 6) {
            System.out.println("Exiting the program, Goodbye!");
            break;
        }
    }
    scanner.close();
    }
}
