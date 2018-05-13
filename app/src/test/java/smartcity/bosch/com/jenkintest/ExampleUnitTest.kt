package smartcity.bosch.com.jenkintest

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    @Throws(Exception::class)
    fun subscription_isCorrect() {

        //WE intentionally made the string null
        val myName: String? = null

        assertNull(myName)
    }
}
