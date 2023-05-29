package structural.composite;

import javax.swing.plaf.nimbus.NimbusStyle;

public class ClientTest {

    public static void main(String[] args) {
        Boss boss = new Boss("Duong", 60, 8000.8);
        BusinessAnalyst ba = new BusinessAnalyst("Dinh", 23, 1000.1);
        Leader leader = new Leader("Tien", 27, 4000.4);

        Developer dev1 = new Developer("Dev1", 25, 2000.2);
        Developer dev2 = new Developer("Dev2", 26, 2000.2);
        Developer dev3 = new Developer("Dev3", 27, 2000.2);

        boss.addEmployee(leader);
        boss.addEmployee(ba);

        leader.addEmployee(dev1);
        leader.addEmployee(dev2);
        leader.addEmployee(dev3);

        boss.printEmployee();
    }
}
