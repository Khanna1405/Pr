import java.util.Scanner;

public class BankStatement extends Customer{
    void BankStatement() {
        System.out.println("Please enter 1 for debited amount statement and 2 for credited amt statement ");
        Scanner sc = new Scanner(System.in);
        UserInput = sc.nextInt();
        switch (UserInput) {
            case 1:
                //debit = sc.nextInt();

                System.out.println(name + " have " + accNo + "account no." + " having " + acctype + " account type " + "debited " + debit + "rupees on " + getDate());
                break;
            case 2:
                //Credit = sc.nextInt();
                System.out.println(name + " have account no. "+accNo + " having " + acctype + " account type " + "Credited " + Credit + "rupees on " + getDate());
                break;
            default:
                System.out.println("Not a valid option");
        }


    }
}
