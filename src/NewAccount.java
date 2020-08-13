import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class NewAccount  {
    public static String name;
    //public static String accNo;
    public static int accNo=2045344598;
    public  static String PAN, acctype,gender,emailID,Branch;
    public  static String mobileNo;
    Scanner sc=new Scanner(System.in);
    /*public String accNo(){
        System.out.println("Enter branch code");
        accNo= Branch+"1234";
        return accNo;

    }*/


    public static String getDate() {
        DateFormat df = new SimpleDateFormat();
        Date dateobj = new Date();
        return df.format(dateobj);
    }

    public static void CustomerDetail() {
        System.out.println("Hi, " + name + " you have successfully added account number " +accNo+" with " +acctype + " account with PAN number:" + PAN + " and emailID: " + emailID + "& Mobile No.:" + mobileNo+" has been registered with our bank on: "+getDate());

    }
    public static void displayExistingCustDetail(){
        System.out.println(" Hi, "+ name+" Welcome to the Bank. Your Account Number is: "+ accNo+ " and you have "+ acctype+ " account in this bank with registered mobile number: " +mobileNo );

    }





}
