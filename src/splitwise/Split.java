package splitwise;

public class Split {

    private User paidFor;
    double individualAmount;

    public Split(User paidFor) {
        this.paidFor = paidFor;
    }

    public User getPaidFor() {
        return paidFor;
    }

    public void setPaidFor(User paidFor) {
        this.paidFor = paidFor;
    }

    public double getIndividualAmount() {
        return individualAmount;
    }

    public void setIndividualAmount(double individualAmount) {
        this.individualAmount = individualAmount;
    }
}
