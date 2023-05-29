package behavioral.strategy;

public class EightyDiscountStrategy implements PromoteStrategy{
    @Override
    public double doDiscount(double price) {
        return price * 0.2;
    }
}
