import java.util.Scanner;

public class BankAccountSimulator {

    // Campos de instância para que métodos da classe (como exibirResumo) possam acessar o estado da conta.
    private String name = "";
    private String agencyNumber = "";
    private double balance = 0;

    public static void main(String[] args) throws Exception {
        //TODO: To Know and import Scanner Class.
        //Show messages of user.
        //Get by Scanner Class the input values of terminal.
        //Show the message "Account Created"

        BankAccountSimulator account = new BankAccountSimulator();

        Scanner scanner = new Scanner(System.in);
while (true){
        System.out.println("Hello, Welcome to FutureBank, please press the number corresponding to the option you wish to perform:");
        System.out.println("To create your account, press -> 1");
        System.out.println("To show your balance, press -> 2");
        System.out.println("To show your nome, press -> 3");
        System.out.println("To see your number and agency, press -> 4");
        System.out.println("To Exit -> 5");

            int inputUser = scanner.nextInt(); //get the input of the user

        //verification of input

        if (inputUser == 2) {
            if (account.balance == 0) {
                System.out.println (" You must create your account first");
            }
            else{
            System.out.println ("Your balance is $" + account.balance);
            }
        }

        if (inputUser == 3) {
            if (account.name.equals("")) {
              System.out.println (" You must create your account first");
             }
             else{
                System.out.println("Your name is:" + account.name);
             }
        }

        if (inputUser == 4) {
            if (account.agencyNumber.equals("")) {
            System.out.println (" You must create your account first");
            }
            else {
                System.out.println ("Your agency number is:" + account.agencyNumber);
            }
        }

        if (inputUser == 1) {
            scanner.nextLine();

            System.out.println ("Please, enter your name:");
            account.name = scanner.nextLine();

            System.out.println ("Please, enter the number of agency:");
            account.agencyNumber = scanner.nextLine();

            System.out.println ("Please, enter your initial balance:");
            String balanceInput = scanner.nextLine();

                // Convert to  double
                account.balance = Double.parseDouble(balanceInput.replace(",", "."));

            System.out.println ("Thank you for creating an account in our bank, your agency number is:" + account.agencyNumber + ", and your balance is:" + account.balance + "!");
        }
        if (inputUser == 5) {
            System.out.println("Exiting the program, Goodbye!");
            break;
        }
    }
    scanner.close();
    }

    /**
     * Exibe um resumo da conta em uma única linha, em português.
     * Caso a conta ainda não tenha sido criada (campos vazios/zero),
     * informa o usuário em vez de imprimir lixo.
     */
    public void exibirResumo() {
        if ((name == null || name.isEmpty())
                && (agencyNumber == null || agencyNumber.isEmpty())
                && balance == 0) {
            System.out.println("Resumo da conta — Conta ainda não foi criada.");
            return;
        }

        String nomeExibir = (name == null || name.isEmpty()) ? "(não informado)" : name;
        String agenciaExibir = (agencyNumber == null || agencyNumber.isEmpty()) ? "(não informada)" : agencyNumber;

        System.out.println("Resumo da conta — Nome: " + nomeExibir
                + " | Agência: " + agenciaExibir
                + " | Saldo: R$ " + balance);
    }
}
