import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Scanner has been defined.
        Scanner ak = new Scanner(System.in);

        //Variables have been initialized.
        double n1,n2;
        int select;

        //Get values from the user.
        System.out.print("Please enter number one = ");
        n1= ak.nextDouble();

        System.out.print("Please enter number two = ");
        n2=ak.nextDouble();

        System.out.println("Please select your operation = \n1-Addition\n2-Substraction\n3-Division\n4-Multiplication");
        select=ak.nextInt();
        System.out.println("Your selection = " +select);

        //The calculation has been performed.
        //First way for solution;

        /* if (select==1) { System.out.print("Addition = " + (n1+n2));}
            else if(select==2){System.out.print("Substraction = "+(n1-n2));}
            else if(select==3) {
                if (n2 != 0) {
                    System.out.print("Division = " + (n1 / n2));}
                        else {
                            System.out.print("Your selection is wrong! Please enter different number from '0'");}}
            else if(select==4){System.out.print("Multiplication = "+(n1*n2));}
        else {System.out.print("Choose numbers between 1 and 4"); } */

        //Second way for solution;
        switch (select){
            case 1: System.out.print("Addition = " + (n1+n2));
            break;
            case 2: System.out.print("Substraction = "+(n1-n2));
            break;
            case 3:
                if (n2!=0){System.out.print("Division = " + (n1 / n2));}
                    else{System.out.print("Your selection is wrong! Please enter different number from '0'");} //A warning has been issued.
                        break;
            case 4: System.out.print("Division = " + (n1 / n2));
            break;
            default:System.out.print("Choose numbers between 1 and 4");
        }
    }
}