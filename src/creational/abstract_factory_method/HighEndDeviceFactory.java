package creational.abstract_factory_method;

public class HighEndDeviceFactory extends ElectronicDeviceAbstractFactory{

    @Override
    Phone getPhone() {
        return new HighEndPhone();
    }

    @Override
    Laptop getLaptop() {
        return new HighEndLaptop();
    }
}
