import java.util.Scanner;

public class BankAccountSimulator {
    public static void main(String[] args) throws Exception {
        //TODO: To Know and import Scanner Class.
        //Show messages of user.
        //Get by Scanner Class the input values of terminal.
        //Show the message "Account Created"
        String name = "";
        double balance = 0;
        String agencyNumber = "";

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
        if (inputUser == 5) {
            System.out.println("Exiting the program, Goodbye!");
            break;
        }
    } 
    scanner.close();
    } 
}
