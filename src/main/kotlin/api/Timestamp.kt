package trident.api

inline class Timestamp(val milliseconds: Long) {
    constructor() : this(System.currentTimeMillis())

    private val daysTotal
        get() = milliseconds / 86400000
    private val millisToday
        get() = milliseconds % 86400000
    private val yearsPassedApprox
        get() = daysTotal.toInt() / 365

    val year
        get() = yearsPassedApprox + 1970
    val month
        get() = (day / 30.4166666667).toInt()
    val day
        get() = (daysTotal - (yearsPassedApprox * 365 + countLeapYears(yearsPassedApprox.toLong()))).toInt()
    val hour
        get() = (millisToday / 3600000).toInt()
    val minute
        get() = (millisToday % 3600000 / 60000).toInt()
    val second
        get() = (millisToday % 60000 / 1000).toInt()

    companion object {
        private fun countLeapYears(yearsPassed: Long): Int {
            var count = 0
            for (i in 1970 until 1970 + yearsPassed) {
                if (isLeapYear(i.toInt())) {
                    count++
                }
            }
            return count
        }

        private fun isLeapYear(year: Int): Boolean {
            return year % 4 == 0 && year % 100 != 0 || year % 400 == 0
        }
    }
}