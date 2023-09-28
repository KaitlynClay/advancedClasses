/**
 * Main page
 * Defines the employee data variables and calls
 * them from the Employee and PositionTitle classes
 *
 * KMC 9/27/23
 */
fun main(args: Array<String>) {
    // defining employee data
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

// calling the function from the Employee class
    employee1.displayInfo();
    employee1.calculatePay(45);
    employee2.displayInfo();
    employee2.calculatePay(50);
    employee3.displayInfo();
    employee3.calculatePay(35);
}