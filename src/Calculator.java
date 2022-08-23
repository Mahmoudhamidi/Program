
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
    Processes_method proses= new Processes_method();

    System.out.println("Enter number one : ");
    double number_one= input.nextDouble();

    System.out.println("Enter number tow : ");
    double number_tow=input.nextDouble();

    System.out.println("Enter one of these signs ( + , - , * , / ) : ");
    String signal=input.next();

    System.out.println("The result : ");

    switch (signal){
        case "+":
            System.out.println(proses.sum(number_one,number_tow));
            break;
        case "-":
            System.out.println(proses.minus(number_one,number_tow));
            break;
        case "*":
            System.out.println(proses.multi(number_one,number_tow));
            break;
        case "/":
            System.out.println(proses.dividing(number_one,number_tow));
            break;
        default:
            System.out.println("You must enter one of these signs ( + , - , * , /  ).");
    }//end switch


    }// end method main ()

}//end class Calculator
