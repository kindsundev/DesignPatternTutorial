package behavioral.strategy;

public class HalfDiscountStrategy implements PromoteStrategy{
    @Override
    public double doDiscount(double price) {
        return price * 0.5;
    }
}
