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
    fun `decimal to roman`() {
        decimalToRoman(26) shouldBe "XXVI"
    }

    @Test
    fun `decimal to roman 49`() {
        decimalToRoman(49) shouldBe "XLIX"
    }
}

