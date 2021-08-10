package lotto.domain;

import java.util.Arrays;

public enum LottoRank {

    FIRST_PLACE(6, 2_000_000_000),
    SECOND_PLACE(5, 30_000_000, true),
    THIRD_PLACE(5, 1_500_000),
    FOURTH_PLACE(4, 50_000),
    FIFTH_PLACE(3, 5_000),
    NO_PLACE(0, 0);

    private final int matchCount;
    private final long amount;
    private final boolean isBonus;

    LottoRank(int matchCount, long amount) {
        this(matchCount, amount, false);
    }

    LottoRank(int matchCount, long amount, boolean isBonus) {
        this.matchCount = matchCount;
        this.amount = amount;
        this.isBonus = isBonus;
    }

    public static LottoRank of(int matchCount, boolean isBonus) {
        return Arrays.stream(values())
                .filter(rank -> rank.isBonus == isBonus)
                .filter(rank -> rank.matchCount == matchCount)
                .findFirst()
                .orElse(NO_PLACE);
    }

    public int getMatchCount() {
        return matchCount;
    }

    public long getAmount() {
        return amount;
    }
}
