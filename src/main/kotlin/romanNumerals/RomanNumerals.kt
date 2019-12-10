package romanNumerals


fun decimalToRoman(number: Int): String = (

            replicate("I")
        `|` replace("IIIII" , "V")
        `|` replace("VV"    , "X")
        `|` replace("XXXXX" , "L")
        `|` replace("LL"    , "C")
        `|` replace("CCCCC" , "D")
        `|` replace("DD"    , "M")

        `|` replace("DCCCC" , "CM")
        `|` replace("CCCC" , "CD")
        `|` replace("LXXXX"  , "XC")
        `|` replace("XXXX"  , "XL")
        `|` replace("VIIII" , "IX")
        `|` replace("IIII"  , "IV")

    )(number)

fun replicate(symbol: String): (Int) -> String =
    { number: Int -> IntRange(1, number).map { n -> symbol }.joinToString(separator = "") }

fun replace(toBeReplaced: String, replacement: String) =
    { s: String -> s.replace(toBeReplaced, replacement) }



