import java.util.Scanner;
public class MonthlyBudgetPlanner {
    public static void main(String[]args) {

        Scanner savingsGoal = new Scanner(System.in);
        System.out.println("Enter Your Savings Goal: $");
        String potSavings = savingsGoal.nextLine();
        int savings = Integer.parseInt(potSavings);
        // gets the total income
        Scanner salaryInput = new Scanner(System.in);
        System.out.println("Enter Your Monthly Salary: $");
        String totalIncome = salaryInput.nextLine();
        int income = Integer.parseInt(totalIncome);
        
        Scanner addRent = new Scanner(System.in);
        System.out.println("Enter Your Rent: $");
        String rentExpense = addRent.nextLine();
        int rent = Integer.parseInt(rentExpense);

        Scanner addUtil = new Scanner(System.in);
        System.out.println("Enter Your Utilities: ");
        String utilExpense = addUtil.nextLine();
        int util = Integer.parseInt(utilExpense);

        Scanner addGrocs = new Scanner(System.in);
        System.out.println("Enter Your Groceries: ");
        String grocExpense = addGrocs.nextLine();
        int groc = Integer.parseInt(grocExpense);

        Scanner addTrans = new Scanner(System.in);
        System.out.println("Enter Your Transportation: ");
        String transExpense = addTrans.nextLine();
        int trans = Integer.parseInt(transExpense);

        Scanner addEntertainment = new Scanner(System.in);
        System.out.println("Enter Your Entertainment: ");
        String entertainExpense = addEntertainment.nextLine();
        int ent = Integer.parseInt(entertainExpense);

        Scanner addMisc = new Scanner(System.in);
        System.out.println("Enter Your Misc: ");
        String miscExpense = addMisc.nextLine();
        int misc = Integer.parseInt(miscExpense);

        if (income >= 0 && rent >= 0 && util >= 0 && groc >= 0 && trans >= 0 && ent >= 0 && misc >= 0) {
            System.out.println("Monthly Salary: $" + income);
            System.out.println("Yearly Salary: $" + income * 12);
            System.out.println("Total Rent: $" + rent);
            System.out.println("Total Utilities: $" + util);
            int housing = rent + util;
            System.out.println("Total Housing Expenses: $" + housing);
            int living = trans + groc;
            System.out.println("Total Living Expenses: $" + living);
            int other = ent + misc;
            System.out.println("Total Other Expenses: $" + other);

            int totalMonthly = housing + living + other;
            System.out.println("Total Monthly Expenses: $" + totalMonthly);
            System.out.println("Total Annual Expenses : $" + totalMonthly * 12);

            System.out.println("Monthly Savings Goal: $" + savings);
            int actSavings = income * 12 - totalMonthly * 12;
            System.out.println("Actual Yearly Savings Possible: $" + actSavings);
        }
        else {
            System.err.println("Error, number not entered");
        }
    }
};
