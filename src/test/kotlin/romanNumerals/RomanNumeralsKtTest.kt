package romanNumerals

import org.junit.Test

class RomanNumeralsKtTest {

    @Test
    fun `generate sequence of I for 1`() {
        replicate("I")(1) shouldBe "I"
    }

    @Test
    fun `generate sequence of I for 4`() {
        replicate("I")(4) shouldBe "IIII"
    }

    @Test
    fun `decimal 26 to roman 26`() {
        decimalToRoman(26) shouldBe "XXVI"
    }

    @Test
    fun `decimal 49 to roman `() {
        decimalToRoman(49) shouldBe "XLIX"
    }
}

