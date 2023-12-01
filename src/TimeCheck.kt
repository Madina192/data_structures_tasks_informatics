import java.text.SimpleDateFormat
import java.util.*

    fun main() {
        //val currentMinute = Calendar.getInstance().get(Calendar.MINUTE)
        isItTimeToStart("2023-11-27, 20:06:00")
    }

    private fun isItTimeToStart(dt: String): Boolean {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd, HH:mm:ss")
        val targetDateTime = dateFormat.parse(dt)
        val currentTime = Date()
        return currentTime.time > targetDateTime.time
    }
