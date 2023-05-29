package structural.decorator.decorators;

import structural.decorator.IMilkTea;
import structural.decorator.MilkTeaDecorator;

public class FruitPudding extends MilkTeaDecorator {

    public FruitPudding(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double cost() {
        return 3d + super.cost();
    }
}
