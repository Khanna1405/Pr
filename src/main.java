


import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int UserOption, input, UserInput, debit, credit;
        System.out.println("Choose 1 to continue and any other integer to exit:");
        input = sc.nextInt();
        sc.nextLine();
        while (input == 1) {
            System.out.println(" for new customer press 1 and for existing customer press 2");
            UserInput = sc.nextInt();

            BankStatement CustInput = new BankStatement();


            if (UserInput == 1) {
                System.out.println("Please Enter Customer Name:");
                CustInput.name = sc.next();
                System.out.println("Please Enter registered mobile no. ");
                CustInput.mobileNo = sc.next();
                System.out.println("Please Entered PAN number");
                CustInput.PAN = sc.next();
                System.out.println(" Please add your account type:");
                CustInput.acctype = sc.next();
                NewAccount.CustomerDetail();



            } else if (UserInput == 2) {
                System.out.println(" Please enter an input, 1 for customer detail, 2 for transaction, 3 for account statement");
                UserOption = sc.nextInt();
                switch (UserOption) {
                    case 1:
                        CustInput.displayExistingCustDetail();
                        break;
                    case 2:
                        CustInput.Transaction();
                        break;
                    case 3:
                        CustInput.BankStatement();
                        break;
                    default:
                        System.out.println("not a valid input");
                        break;
                }

            }
            System.out.println("do you want to continue then press 1 else press anything else");
            input=sc.nextInt();
            System.out.println("Thanks for Coming");



        }


    }
}





