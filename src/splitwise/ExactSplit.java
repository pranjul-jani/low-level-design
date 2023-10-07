package splitwise;

public class ExactSplit extends Split {

    public ExactSplit(User paidFor, double individualAmount) {
        super(paidFor);
        this.individualAmount = individualAmount;
    }
}
