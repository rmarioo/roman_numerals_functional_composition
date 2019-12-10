package romanNumerals


fun decimalToRoman(number: Int): String = (

            replicate("I")
        `|` replace("IIIII" , "V")
        `|` replace("VV"    , "X")
        `|` replace("XXXXX" , "L")
        `|` replace("LL"    , "C")
        `|` replace("CCCCC" , "L")
        `|` replace("DD"    , "M")

        `|` replace("XXXX"  , "XL")
        `|` replace("VIIII" , "IX")
        `|` replace("IIII"  , "IV")


    )(number)


fun replicate(symbol: String): (Int) -> String =
    { number: Int -> number.replicate(symbol) }

fun replace(toBeReplaced: String, replacement: String) =
    { s: String -> s.replace(toBeReplaced, replacement) }

private fun Int.replicate(symbol: String): String =
    IntRange(1, this).map { n -> symbol }.joinToString(separator = "")



