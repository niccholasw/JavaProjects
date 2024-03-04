import java.util.ArrayList;
import java.util.Scanner;

public class BudgetCalculator {
    public static void main(String[] args) {
        System.out.println("What is your total budget?");
        Scanner scanner = new Scanner(System.in);
        double budget = scanner.nextDouble();
        double sum = 0;
        int i = 0;
        ArrayList<Double> proportion = new ArrayList<Double>();
        System.out.println("Enter the proportion of the budget you want to allocate to each category.");
        System.out.println("The system will stop if cumulative proportion exceeds 100%.");
        do {
            System.out.println("Your proportion of expense " + (i + 1) + " is:");
            double temp = scanner.nextDouble();
            proportion.add(temp);
            sum += proportion.get(i);
            i++;
        } while (sum <= 100);
        scanner.close();
        if (sum > 100){
            double cumulativeSum = 0.0;
            for (int j = 0; j < proportion.size() - 1; j++){
                cumulativeSum += proportion.get(j);
            }
            proportion.set(proportion.size() - 1, 100.0 - cumulativeSum);
        }
        for (double value : proportion) {
            double expense = value * budget / 100.0;
            System.out.println("Your " + value + "% equals $" + expense);
        }
    }
}
