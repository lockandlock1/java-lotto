package lotto.domain;

import java.util.Objects;

public class LottoPurchaseNumber {

    private static final int LOTTO_BASE_PRICE = 1000;
    private static final String LOTTO_PURCHASE_NUMBER_INPUT_VALUE_ERROR_MESSAGE = "기본 가격 이하의 값(1000)은 입력할수 없습니다.";

    private final int value;

    public static LottoPurchaseNumber newInstance(int purchaseAmount) {
        return new LottoPurchaseNumber(purchaseAmount / LOTTO_BASE_PRICE);
    }

    public LottoPurchaseNumber(int purchaseNumber) {

        if(purchaseNumber == 0) {
            throw new IllegalArgumentException(LOTTO_PURCHASE_NUMBER_INPUT_VALUE_ERROR_MESSAGE);
        }

        this.value = purchaseNumber;

    }

    public int getLottoPurchaseNumber() {
        return this.value;
    }


    @Override
    public String toString() {
        return "LottoPurchaseNumber{" +
                "value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LottoPurchaseNumber that = (LottoPurchaseNumber) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
