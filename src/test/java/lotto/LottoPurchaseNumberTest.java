package lotto;

import lotto.domain.LottoPurchaseNumber;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class LottoPurchaseNumberTest {


    @ParameterizedTest
    @CsvSource(value = {"1000,1", "14000,14", "7000,7"})
    void 로또_구매_개수테스트(int money, int result) {

        LottoPurchaseNumber lottoPurchaseNumber = LottoPurchaseNumber.newInstance(money);

        assertThat(lottoPurchaseNumber.getLottoPurchaseNumber()).isEqualTo(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {900})
    void 로또_구매_유효성_테스트(int money) {

        assertThatIllegalArgumentException().isThrownBy(() -> LottoPurchaseNumber.newInstance(money));

    }
}
