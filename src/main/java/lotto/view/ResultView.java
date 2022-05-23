package lotto.view;

import lotto.domain.LottoPurchaseNumber;

public class ResultView {

    private static final String INSTANCE_ERROR_MESSAGE = "ResultView 클래스를 인스턴스화 할수 없습니다.";
    private static final String LOTTO_PURCHASE_NUMBER_DEFAULT_MESSAGE = "개를 구매했습니다.";
    private static final StringBuffer sb = new StringBuffer("");

    private ResultView() {
        throw new AssertionError(INSTANCE_ERROR_MESSAGE);
    }


    public static void printLottoPurchaseNumber(LottoPurchaseNumber lottoPurchaseNumber) {
        sb.setLength(0);

        sb.append(lottoPurchaseNumber)
            .append(LOTTO_PURCHASE_NUMBER_DEFAULT_MESSAGE);

        System.out.println(sb.toString());
    }

}
