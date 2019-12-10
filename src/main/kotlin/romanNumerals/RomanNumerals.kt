package romanNumerals


val symbolsMap = listOf(
    "IIIII" to "V",
    "VV"    to "X",
    "XXXXX" to "L",
    "LL"    to "C",
    "CCCCC" to "D",
    "DD"    to "M",

    "DCCCC" to "CM",
    "CCCC"  to "CD",
    "LXXXX" to "XC",
    "XXXX"  to "XL",
    "VIIII" to "IX",
    "IIII"  to "IV"
)

fun decimalToRoman(number: Int): String = (

             replicate("I")
         `|` replaceSymbols(symbolsMap)
    )(number)


fun replaceSymbols(symbols: List<Pair<String,String>>): (String) -> String =
{  s: String -> symbols.fold(s, { acc,symbol -> acc.replace(symbol.first,symbol.second) }) }

fun replicate(symbol: String): (Int) -> String =
    { number: Int -> IntRange(1, number).map { n -> symbol }.joinToString(separator = "") }



