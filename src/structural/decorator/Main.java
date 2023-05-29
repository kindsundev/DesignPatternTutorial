package structural.decorator;

import structural.decorator.decorators.*;

public class Main {
    public static void main(String[] args) {
        IMilkTea firstMilkTea = new EggPudding(
                                    new FruitPudding(
                                        new BlackSugar(
                                            new Bubble(
                                                new MilkTea()))));

        IMilkTea secondMilkTea = new EggPudding(
                                    new BlackSugar(
                                        new WhiteBubble(
                                            new MilkTea())));

        System.out.println("First MilkTea\t" + firstMilkTea.cost());

        System.out.println("Second MilkTea\t" + secondMilkTea.cost());

    }
}
