package splitwise;

import java.util.List;
import java.util.UUID;

public class ExpenseCreationService {

    public static Expense createExpense(
            ExpenseType expenseType, double totalAmount, User paidBy, List<Split> splitList, ExpenseMetadata expenseMetadata) {

        double currentAmount = 0;

        switch (expenseType) {
            case EXACT:
                return new ExactExpense(
                        UUID.randomUUID().toString(),
                        totalAmount,
                        paidBy,
                        splitList,
                        expenseMetadata
                );
            case EQUAL:
                for (int i=0;i<splitList.size();i++) {
                    if (i == splitList.size()-1) {
                        splitList.get(i).setIndividualAmount(totalAmount - currentAmount);

                    } else {
                        double userAmount = totalAmount/splitList.size();
                        splitList.get(i).setIndividualAmount(userAmount);
                        currentAmount += userAmount;
                    }
                }

                return new EqualExpense(
                        UUID.randomUUID().toString(),
                        totalAmount,
                        paidBy,
                        splitList,
                        expenseMetadata
                );
            case PERCENT:
                for (int i=0;i<splitList.size();i++) {
                    if (i == splitList.size()-1) {
                        splitList.get(i).setIndividualAmount(totalAmount - currentAmount);

                    } else {
                        PercentSplit percentSplit = (PercentSplit) splitList.get(i);
                        double userAmount = (percentSplit.getPercentage() * totalAmount)/100;
                        splitList.get(i).setIndividualAmount(userAmount);
                        currentAmount += userAmount;
                    }
                }

                return new PercentExpense(
                        UUID.randomUUID().toString(),
                        totalAmount,
                        paidBy,
                        splitList,
                        expenseMetadata
                );
            default:
                return null;
        }
    }
}
