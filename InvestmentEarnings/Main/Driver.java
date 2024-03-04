import java.util.Scanner; //import Scanner class from java.util package
import java.text.NumberFormat; //import NumberFormat class from java.text package

public class Driver {
    public static void main(String[] args) { //main method
        Scanner scanner = new Scanner(System.in); //create scanner object
        System.out.print("Enter the your buy in price per share: "); //prompt user to enter buying price
        double buyingPrice = scanner.nextDouble(); //get buying price from user
        int day = 1; //initialize day to 1
        double closingPrice = buyingPrice; //initialize closing price to buying price
        NumberFormat nf = NumberFormat.getCurrencyInstance(); //create NumberFormat object

        while (true) { //loop until user enters -1
            System.out.println("Enter the closing price for day " + day + " or -1 to exit: "); //prompt user to enter closing price
            closingPrice = scanner.nextDouble(); //get closing price from user
            if (closingPrice == -1) break; //exit loop if user enters -1
            double earnings = closingPrice - buyingPrice; //calculate earnings
            if (earnings > 0) { //if earnings is positive
                System.out.println("Your stock has increased by " + nf.format(earnings) + " per share on day " + day); //print earnings
            } else if (earnings < 0) { //if earnings is negative
                System.out.println("You stock has decreased by " + nf.format(earnings) + " per share on day " + day); //print loss
            } else { //if earnings is zero
                System.out.println("You broke even on day " + day); //print break even
            }
            day += 1; //increment day
        }
        scanner.close(); //close scanner
    }
}