package romanNumerals

infix fun <A, B,C> ((A) -> B).`|`(other: (B) -> C): (A) -> C =
    { a: A -> other(this(a)) }
