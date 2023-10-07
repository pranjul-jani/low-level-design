package splitwise;

import java.util.List;

public class EqualExpense extends Expense {

    public EqualExpense(String id, double amount, User paidBy, List<Split> splitList, ExpenseMetadata expenseMetadata) {
        super(id, amount, paidBy, splitList, expenseMetadata);
    }

    @Override
    boolean validateExpense() {
        for (Split split : getSplitList()) {
            if (!(split instanceof EqualSplit)) {
                return false;
            }
        }

        return true;
    }

}
