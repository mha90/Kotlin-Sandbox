package json

import org.testng.Assert.assertEquals
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test

/**
 * Created by Mohamed Hassan on 6/15/2017.
 * mhabulazm@gmail.com
 */
class JsonGeneratorKtTest {
    @BeforeMethod
    fun setUp() {
    }

    @Test
    fun testGetLimitedIndex() {
        assertEquals(getRandomLimitedIndex(10), 1)
        assertEquals(getRandomLimitedIndex(15), 2)
        assertEquals(getRandomLimitedIndex(16), 1)
        assertEquals(getRandomLimitedIndex(17), 0)
        assertEquals(getRandomLimitedIndex(25), 3)
        assertEquals(getRandomLimitedIndex(49), 4)
    }

}