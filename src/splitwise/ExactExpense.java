package splitwise;

import java.util.List;

public class ExactExpense extends Expense {

    public ExactExpense(String id, double amount, User paidBy, List<Split> splitList, ExpenseMetadata expenseMetadata) {
        super(id, amount, paidBy, splitList, expenseMetadata);
    }

    @Override
    boolean validateExpense() {
        double totalAmount = getIndividualAmount();
        double currentAmount = 0;

        for (Split split: getSplitList()) {
            if (!(split instanceof ExactSplit)) {
                return false;
            } else {
                ExactSplit exactSplit = (ExactSplit) split;
                currentAmount += exactSplit.individualAmount;
            }
        }

        if (currentAmount != totalAmount) {
            return false;
        }

        return true;
    }

}
