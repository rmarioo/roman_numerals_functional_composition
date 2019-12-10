package romanNumerals

import org.hamcrest.core.Is
import org.junit.Assert.assertThat


infix fun Any.shouldBe(expected: Any) {
    assertThat(this, Is.`is`(expected))
}
