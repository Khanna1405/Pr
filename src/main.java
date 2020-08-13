import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.rmi.runtime.NewThreadAction;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int UserOption, input, UserInput,debit,credit;
        System.out.println("Choose 1 to continue and any other integer to exit:");
        input = sc.nextInt();
        sc.nextLine();
        while (input == 1) {
            System.out.println(" for new customer press 1 and for existing customer press 2");
            UserInput = sc.nextInt();
            Customer CustInput= new Customer();
            BankStatement CustInput3=new BankStatement();


            if (UserInput==1){
                System.out.println("Please Enter Customer Name:");
                CustInput.name=sc.next();
                System.out.println("Please Enter registered mobile no. ");
                CustInput.mobileNo=sc.next();
                System.out.println("Please Entered PAN number");
                CustInput.PAN=sc.next();
                System.out.println(" please entered registered email id:");
                CustInput.emailID=sc.next();
                System.out.println(" Please add your account type:");
                CustInput.acctype=sc.next();
                System.out.println("Please add branch code:");
                CustInput.Branch=sc.next();
                NewAccount.CustomerDetail();



            }
            else if (UserInput==2){
                System.out.println(" Please enter an input, 1 for customer detail, 2 for transaction, 3 for account statement");
                UserOption=sc.nextInt();
                switch(UserOption){
                    case 1:
                        CustInput.displayExistingCustDetail();
                        break;
                    case 2:
                        CustInput.Transaction();
                        break;
                    case 3:
                        CustInput3.BankStatement();
                        break;
                    default:
                        System.out.println("not a valid input");
                        break;
                }



            }
            //System.out.println("Thanks for Coming");

        }


    }
}
