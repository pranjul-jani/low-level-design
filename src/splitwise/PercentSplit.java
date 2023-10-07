package splitwise;

public class PercentSplit extends Split {

    double percentage;

    public PercentSplit(User paidFor, double percentage) {
        super(paidFor);
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

}
