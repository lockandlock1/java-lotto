package calculator.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;


class OperatorTest {


    @ParameterizedTest
    @MethodSource("providedAddTestValue")
    void 더하기_테스트(String operator, Integer a, Integer b, Integer result) {
        assertThat(Operator.execute(operator, a, b)).isEqualTo(result);
    }

    private static Stream<Arguments> providedAddTestValue() {
        return Stream.of(
                Arguments.of("+", 1, 3, 4),
                Arguments.of("+", 2, 3, 5),
                Arguments.of("+", 3, 4, 7),
                Arguments.of("+", 4, 4, 8)

        );
    }

    @ParameterizedTest
    @MethodSource("providedAddTestValue")
    void 빼기_테스트(String operator, Integer a, Integer b, Integer result) {
        assertThat(Operator.execute(operator, a, b)).isEqualTo(result);
    }

    private static Stream<Arguments> providedSubtractionTestValue() {
        return Stream.of(
                Arguments.of("+", 1, 3, -2),
                Arguments.of("+", 2, 3, -1),
                Arguments.of("+", 3, 4, -1),
                Arguments.of("+", 4, 4, 0)

        );
    }

    @ParameterizedTest
    @MethodSource("providedAddTestValue")
    void 곱셉_테스트(String operator, Integer a, Integer b, Integer result) {
        assertThat(Operator.execute(operator, a, b)).isEqualTo(result);
    }

    private static Stream<Arguments> providedMultiplyTestValue() {
        return Stream.of(
                Arguments.of("+", 1, 3, 3),
                Arguments.of("+", 2, 3, 6),
                Arguments.of("+", 3, 4, 12),
                Arguments.of("+", 4, 4, 16)

        );
    }



    @Test
    void 나눗셈_테스트() {
        assertThatIllegalArgumentException().isThrownBy(() -> Operator.execute("/", 1, 3));

        assertThat(Operator.execute("/", 4, 4)).isEqualTo(1);
    }
}