package splitwise;

import java.util.List;

public abstract class Expense {

    private String id;
    private double individualAmount;
    private User paidBy;
    private List<Split> splitList;
    private ExpenseMetadata expenseMetadata;

    public Expense(String id, double individualAmount, User paidBy, List<Split> splitList, ExpenseMetadata expenseMetadata) {
        this.id = id;
        this.individualAmount = individualAmount;
        this.paidBy = paidBy;
        this.splitList = splitList;
        this.expenseMetadata = expenseMetadata;
    }

    abstract boolean validateExpense();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getIndividualAmount() {
        return individualAmount;
    }

    public void setIndividualAmount(double individualAmount) {
        this.individualAmount = individualAmount;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }

    public List<Split> getSplitList() {
        return splitList;
    }

    public void setSplitList(List<Split> splitList) {
        this.splitList = splitList;
    }

    public ExpenseMetadata getExpenseMetadata() {
        return expenseMetadata;
    }

    public void setExpenseMetadata(ExpenseMetadata expenseMetadata) {
        this.expenseMetadata = expenseMetadata;
    }
}
