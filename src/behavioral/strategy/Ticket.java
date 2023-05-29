package behavioral.strategy;

public class Ticket {
    private double price;
    private PromoteStrategy promoteStrategy;
    private String name;

    public Ticket() {
    }

    public Ticket(PromoteStrategy promoteStrategy) {
        this.promoteStrategy = promoteStrategy;
    }

    public void setPromotionStrategy(PromoteStrategy promoteStrategy) {
        this.promoteStrategy = promoteStrategy;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPromotePrice() {
        return promoteStrategy.doDiscount(price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public PromoteStrategy getPromoteStrategy() {
        return promoteStrategy;
    }

    public void setPromoteStrategy(PromoteStrategy promoteStrategy) {
        this.promoteStrategy = promoteStrategy;
    }

    public String getName() {
        return name;
    }
}
