package creational.abstract_factory_method;

public class MidRangeDeviceFactory extends ElectronicDeviceAbstractFactory{

    @Override
    Phone getPhone() {
        return new MidRangePhone();
    }

    @Override
    Laptop getLaptop() {
        return new MidRangeLaptop();
    }
}
