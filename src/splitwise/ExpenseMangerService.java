package splitwise;

import java.util.*;

public class ExpenseMangerService {

    List<Expense> expenseList;
    Map<String, User> userMap;
    Map<String, Map<String, Double>> balanceSheet;

    public ExpenseMangerService() {
        this.expenseList = new ArrayList<>();
        this.userMap = new HashMap<>();
        this.balanceSheet = new HashMap<>();
    }

    public void addUser(User user) {
        userMap.put(user.getUserId(), user);
        balanceSheet.put(user.getUserId(), new HashMap<>());
    }

    public void addExpense(
            ExpenseType expenseType, double amount, String paidBy, List<Split> splitList, ExpenseMetadata expenseMetadata) {

        Expense expense = ExpenseCreationService.createExpense(
                expenseType, amount, userMap.get(paidBy), splitList, expenseMetadata);

        if (!expense.validateExpense()) {
            System.out.println("Wrong set of inputs");
            return;
        }

        expenseList.add(expense);

        for (Split split : expense.getSplitList()) {
            String paidTo = split.getPaidFor().getUserId();

            Map<String, Double>  balances = balanceSheet.get(paidBy);

            balances.put(paidTo, balances.getOrDefault(paidTo, 0.0) + split.getIndividualAmount());

            balances = balanceSheet.get(paidTo);

            balances.put(paidBy, balances.getOrDefault(paidBy, 0.0) - split.getIndividualAmount());
        }

        System.out.println("Expense added");

    }

    public void showBalance(String userId) {
        if (balanceSheet.get(userId).isEmpty()) {
            System.out.println("No Balances for User " + userId + " found");
        }

        balanceSheet.get(userId).forEach((key, value) -> printBalance(userId, key, value));
    }

    public void showAllBalances() {

        boolean isEmpty = true;

        for (Map.Entry<String, Map<String, Double>> allBalances : balanceSheet.entrySet()) {
           Map<String, Double> currentUserBalance = allBalances.getValue();

            for (Map.Entry<String, Double> userBalance : allBalances.getValue().entrySet()) {
                if (userBalance.getValue() > 0) {
                    isEmpty = false;
                    printBalance(allBalances.getKey(), userBalance.getKey(), userBalance.getValue());
                }
            }

        }

        if (isEmpty) {
            System.out.println("No balances found");
        }

    }

    private void printBalance(String user1, String user2, double amount) {

        String user1Name = userMap.get(user1).getName();
        String user2Name = userMap.get(user2).getName();

        if (amount < 0) {
            System.out.println(user1Name + " owes " + user2Name + ": " + Math.abs(amount));
        } else if (amount > 0) {
            System.out.println(user2Name + " owes " + user1Name + ": " + Math.abs(amount));
        }
    }
}
