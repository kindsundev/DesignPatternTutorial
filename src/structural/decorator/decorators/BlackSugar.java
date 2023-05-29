package structural.decorator.decorators;

import structural.decorator.IMilkTea;
import structural.decorator.MilkTeaDecorator;

public class BlackSugar extends MilkTeaDecorator {

    public BlackSugar(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double cost() {
        return 2d + super.cost();
    }
}
