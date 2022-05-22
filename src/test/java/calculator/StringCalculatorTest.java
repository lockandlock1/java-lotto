package calculator;

import calculator.domain.Calculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


public class StringCalculatorTest {

    @Test
    void 입력값_검증_테스트() {

        assertThatIllegalArgumentException().isThrownBy(() -> Calculator.inputValidateAndSplit(""));

        assertThatNullPointerException().isThrownBy(() -> Calculator.inputValidateAndSplit(null));

        assertThatIllegalArgumentException().isThrownBy(() -> Calculator.inputValidateAndSplit("2 ? 3 + 4"));
    }

    @Test
    void 사칙연산_테스트() {

        assertThat(Calculator.calculate("2 + 3 * 4 / 2 - 3")).isEqualTo(7);
        assertThat(Calculator.calculate("5 - 3 / 2 / 1 * 3 + 2")).isEqualTo(5);
    }
}
