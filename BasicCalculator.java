import java.util.Scanner;

public class BasicCalculator {

    public static double add(double n1 , double n2){
        return n1 + n2;
    }
    public static double subtract( double n1, double n2){
        return n1-n2;
    }
    public static double multiply (double n1, double n2){
        return n1*n2;
    }
    public static double divide (double n1, double n2){
        if(n2==0){
            System.out.println("Division by zero is undefined");
            return Double.NaN;
        }
        return n1/n2;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean cont = true;

        while(cont){
            System.out.println("Basic Calculator");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Miltiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.println("Choose an option 1-5");

            int choice = in.nextInt();
            if(choice == 5){
                cont = false;
                System.out.println("Exiting Calculator Bye Bye");
                break;
            }
            System.out.println("Enter first no.");
            double a = in.nextDouble();
            System.out.println("Enter Second no.");
            double b = in.nextDouble();

            double res = 0;

            switch (choice) {
            case 1:res = add(a, b);
                    break;
            case 2: res  = subtract(a, b);
            break;
            case 3: res = multiply(a, b);
            break;
            case 4: res = divide(a, b);
            break;
            default:System.out.println("Invalid choice , Please try again");
                continue;
            }
            System.out.println("Result : "+res);
        }
        in.close();
        
    }
}
