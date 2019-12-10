package romanNumerals

import org.junit.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource


class RomanNumeralsKtTest {

    @Test
    fun `generate sequence of I for 1`() {
        replicate("I")(1) shouldBe "I"
    }

    @Test
    fun `generate sequence of I for 4`() {
        replicate("I")(4) shouldBe "IIII"
    }

    @ParameterizedTest
    @CsvSource(
        "1, I",
        "2, II",
        "3, III",
        "4, IV",
        "5, V",
        "8, VIII",
        "9, IX",
        "10, X",
        "14, XIV",
        "15, XV",
        "40, XL",
        "50, L",
        "90, XC",
        "100, C",
        "400, CD",
        "500, D",
        "900, CM",
        "1000, M",
        "691, DCXCI",
        "431, CDXXXI",
        "1944, MCMXLIV",
        "1943, MCMXLIII"
    )
    fun convert(decimal: Int, roman: String) {
        decimalToRoman(decimal) shouldBe roman
    }
}

