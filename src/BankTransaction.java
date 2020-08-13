
import java.util.Scanner;

public class BankTransaction extends NewAccount{

    public int  debit, Credit, UserInput;

    Scanner sc=new Scanner(System.in);

    void Transaction() {
        System.out.println("Please choose Transaction option: enter 1 for debit and 2 for Credit:");
        Scanner scanner = new Scanner(System.in);
        UserInput = scanner.nextInt();
        switch (UserInput) {
            case 1:
                System.out.println("Please Enter the amount to be debited:");
                debit = scanner.nextInt();
                System.out.println("User having registered mobile no:" + mobileNo + " debited " + debit + "rupees from the account no. " + accNo);
                break;
            case 2:
                System.out.println("Please Enter Credit Amount:");
                Credit = scanner.nextInt();
                System.out.println("User having registered mobile no." + mobileNo + " credited " + Credit + " rupees to the account no: " + accNo);
                break;
            default:
                System.out.println("Not a valid option:");
        }


    }



}



