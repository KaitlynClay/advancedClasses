import java.text.DecimalFormat

/**
 * Employee class
 * defines variables for the data being passed from the Main file.
 * fun displayInfo() will format the data to be printed
 * fun calculatePay() will find how much the employee is getting paid
 * and format it to be printed
 *
 * KMC 9/27/23
 */
class Employee(
    // defining variables that are coming from Main
    var nameEmployee: String,
    var positionEmployee: PositionTitle,
    var salaryEmployee: Boolean,
    var payRateEmployee: Double,
    var shiftEmployee: Int) {

    // formats the employee name, position, salary, shift, and
    // pay rate to be printed in Main
    fun displayInfo(){
        println("$nameEmployee\n" +
        "$positionEmployee is salary: $salaryEmployee\n" +
                "The shift they work is $shiftEmployee\n" +
        "Employee's pay rate is: $payRateEmployee per hour")
    }

    // calculating what the employee will be paid
    fun calculatePay(hours: Int){
        var totPay: Double = 0.0
        var payRate: Double = payRateEmployee
        var overT: Double

        // taking into consideration how many hours they worked
        // calculating how much they were paid for the week and
        when (shiftEmployee) {
            1 -> {
                if (hours <= 40)
                    totPay = hours * payRate
                else if (hours > 40) {
                    overT = ((hours - 40) * (payRate * 1.5)) + (40 * payRate)
                    totPay = overT
                }
            }
            2 -> {
                if (hours <= 40)
                    totPay = hours * (payRate * 1.05)
                else if (hours > 40) {
                    overT = ((hours - 40) * ((payRate * 1.05) * 1.5)) + (40 * (payRate * 1.05))
                    totPay = overT
                }
            }
            3 -> {
                if (hours <= 40)
                    totPay = hours * (payRate * 1.1)
                else if (hours > 40) {
                    overT = ((hours - 40) * ((payRate * 1.1) * 1.5)) + (40 * (payRate * 1.1))
                    totPay = overT
                }
            }
            else -> {
                println("We don't have that number of shifts.")
                return
            }
        }

        // formatting the pay to be printed in Main
        var payFormat = DecimalFormat("#.##")
        var formattedPay = payFormat.format(totPay)
        println("They made $$formattedPay this week.\n")

    }
}