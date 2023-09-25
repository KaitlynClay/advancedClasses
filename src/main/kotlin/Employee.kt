import java.text.DecimalFormat

class Employee(
    var nameEmployee: String,
    var positionEmployee: PositionTitle,
    var salaryEmployee: Boolean,
    var payRateEmployee: Double,
    var shiftEmployee: Int) {

    fun displayInfo(){
        println("$nameEmployee\n" +
        "$positionEmployee is salary: $salaryEmployee\n" +
                "The shift they work is $shiftEmployee\n" +
        "Employee's pay rate is: $payRateEmployee per hour")
    }

    fun calculatePay(hours: Int){
        var totPay: Double
        var payRate: Double
        if (hours <= 40){
            payRate = payRateEmployee
        } else if (hours > 40){
            payRate = payRateEmployee * 1.5
        }else{
            print("Invalid hours")
            return
        }
        when (shiftEmployee) {
            1 -> {
                totPay = hours * payRate
            }
            2 -> {
                totPay = hours * (payRate * 1.05)
            }
            3 -> {
                totPay = hours * (payRate * 1.1)
            }
            else -> {
                println("We don't have that number of shifts.")
                return
            }
        }


        var payFormat = DecimalFormat("#.##")
        var formattedPay = payFormat.format(totPay)
        println("They made $$formattedPay this week.\n")

    }
}