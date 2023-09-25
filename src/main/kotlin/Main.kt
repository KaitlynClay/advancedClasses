fun main(args: Array<String>) {
    var employee1 = Employee("Jade Lennox",
        PositionTitle.Administration,
        true,
        27.00,
        1);
    var employee2 = Employee("Will Treaty",
        PositionTitle.Production,
        false,
        22.00,
        2);
    var employee3 = Employee("Halt O'Carrick",
        PositionTitle.Maintenance,
        false,
        21.00,
        3);

    employee1.displayInfo();
    employee1.calculatePay(45);
    employee2.displayInfo();
    employee2.calculatePay(50);
    employee3.displayInfo();
    employee3.calculatePay(35);
}