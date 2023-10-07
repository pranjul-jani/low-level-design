package splitwise;

import java.util.List;

public class PercentExpense extends Expense {

    public PercentExpense(String id, double amount, User paidBy, List<Split> splitList, ExpenseMetadata expenseMetadata) {
        super(id, amount, paidBy, splitList, expenseMetadata);
    }

    @Override
    boolean validateExpense() {
        double currentPercentage = 0;

        for (Split split: getSplitList()) {
            if (!(split instanceof PercentSplit)) {
                return false;
            } else {
                PercentSplit percentSplit = (PercentSplit) split;
                currentPercentage += percentSplit.percentage;
            }
        }

        if (currentPercentage != 100) {
            return false;
        }

        return true;

    }

}
