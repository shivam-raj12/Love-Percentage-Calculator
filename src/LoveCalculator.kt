/**
 * @param [personName] Your name
 * @param [crushName] Your crush name
 * @return The calculated love percentage between you and your crush.
 */
fun calculateLove(personName: String, crushName: String): String? {
    var loverName = (personName + "loves" + crushName).lowercase()
    var digit = ""
    var percent: String
    while (loverName.isNotEmpty()) {
        val c = loverName[0]
        digit += loverName.count { it == c }
        loverName = loverName.filter { it != c }
    }
    percent = digit
    try {
        while (percent.toLong() > 100) { // If it is <= 100, then just return the percent
            digit = ""
            while (percent.isNotEmpty()) {
                digit += if (percent.length >= 2) {
                    (percent.first().digitToInt() + percent.last().digitToInt())
                } else {
                    percent.first().digitToInt()
                }
                percent = percent.drop(1)
                percent = percent.dropLast(1)
            }
            percent = digit
        }
        return percent
    } catch (e: NumberFormatException) {
        println("Entered name is too much long.")
        return null
    } catch (e: Exception) {
        println("An unexpected error occurred while calculating your love percentage :(")
        return null
    }
}