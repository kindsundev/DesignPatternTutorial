package structural.decorator.decorators;

import structural.decorator.IMilkTea;
import structural.decorator.MilkTeaDecorator;

public class WhiteBubble extends MilkTeaDecorator {

    public WhiteBubble(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double cost() {
        return 1.5d + super.cost();
    }
}
