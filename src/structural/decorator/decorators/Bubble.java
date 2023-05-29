package structural.decorator.decorators;

import structural.decorator.IMilkTea;
import structural.decorator.MilkTeaDecorator;

public class Bubble extends MilkTeaDecorator {

    public Bubble(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double cost() {
        return 1d + super.cost();
    }
}
