package creational.abstract_factory_method;

public class ElectronicDeviceFactory {

    public static ElectronicDeviceAbstractFactory getFactory(Segment segment) {
        switch (segment) {
            case MID_RANGE:
                return new MidRangeDeviceFactory();
            case HIGH_RANGE:
                return new HighEndDeviceFactory();
            default:
                throw new UnsupportedOperationException("this device is unsupported");
        }

    }
}
