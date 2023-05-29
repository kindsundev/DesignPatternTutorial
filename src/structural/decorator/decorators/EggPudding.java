package structural.decorator.decorators;

import structural.decorator.IMilkTea;
import structural.decorator.MilkTeaDecorator;

public class EggPudding extends MilkTeaDecorator {

    public EggPudding(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double cost() {
        return 3d + super.cost();
    }
}
