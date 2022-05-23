package lotto.view;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    private static final String INSTANCE_ERROR_MESSAGE = "InputView 클래스를 인스턴스화 할수 없습니다";
    private static final String PURCHASE_AMOUNT_ENTER_MESSAGE = "구매금액을 입력해 주세요.";


    private InputView() {
        throw new AssertionError(INSTANCE_ERROR_MESSAGE);
    }

    public static int enterPurchaseAmount() {
        System.out.println(PURCHASE_AMOUNT_ENTER_MESSAGE);

        return scanner.nextInt();
    }

}
