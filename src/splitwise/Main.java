package splitwise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ExpenseMangerService expenseMangerService = new ExpenseMangerService();

        expenseMangerService.addUser(new User("pranjul", "Pranjul Jani", "xyz@gmail.com", "9xxxx"));
        expenseMangerService.addUser(new User("prateek", "Prateel Kalra", "abc@gmail.com", "7xxxx"));
        expenseMangerService.addUser(new User("aman", "Aman Gupta", "pqr@gmail.com", "8xxxx"));
        expenseMangerService.addUser(new User("arpit", "Arpit Ojha", "uvw@gmail.com", "6xxxx"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String command = scanner.nextLine();
            String[] commands = command.split(" ");
            String commandType = commands[0];

            switch (commandType) {
                case "SHOW":
                    if (commands.length == 1) {
                        expenseMangerService.showAllBalances();
                    } else {
                        expenseMangerService.showBalance(commands[1]);
                    }
                    break;

                case "EXPENSE":
                    String paidBy = commands[1];
                    Double amount = Double.parseDouble(commands[2]);
                    int noOfUsers = Integer.parseInt(commands[3]);
                    String expenseType = commands[4 + noOfUsers];
                    List<Split> splits = new ArrayList<>();
                    switch (expenseType) {
                        case "EQUAL":
                            for (int i = 0; i < noOfUsers; i++) {
                                splits.add(new EqualSplit(expenseMangerService.userMap.get(commands[4 + i])));
                            }
                            expenseMangerService.addExpense(ExpenseType.EQUAL, amount, paidBy, splits, null);
                            break;
                        case "EXACT":

                            for (int i = 0; i < noOfUsers; i++) {
                                splits.add(new ExactSplit(expenseMangerService.userMap.get(commands[4 + i]), Double.parseDouble(commands[5 + noOfUsers + i])));
                            }
                            expenseMangerService.addExpense(ExpenseType.EXACT, amount, paidBy, splits, null);
                            break;

                        case "PERCENT":
                            for (int i = 0; i < noOfUsers; i++) {
                                splits.add(new PercentSplit(expenseMangerService.userMap.get(commands[4 + i]), Double.parseDouble(commands[5 + noOfUsers + i])));
                            }
                            expenseMangerService.addExpense(ExpenseType.PERCENT, amount, paidBy, splits, null);
                            break;
                    }
                    break;
            }
        }
    }
}
