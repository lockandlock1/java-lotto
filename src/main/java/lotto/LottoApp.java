package lotto;

import lotto.domain.LottoPurchaseNumber;
import lotto.view.InputView;
import lotto.view.ResultView;

public class LottoApp {
    public static void main(String[] args) {
        int purchaseAmount = InputView.enterPurchaseAmount();

        LottoPurchaseNumber lottoPurchaseNumber = LottoPurchaseNumber.newInstance(purchaseAmount);

        ResultView.printLottoPurchaseNumber(lottoPurchaseNumber);

    }
}
