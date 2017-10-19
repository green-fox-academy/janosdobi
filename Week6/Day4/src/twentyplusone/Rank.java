package twentyplusone;

import com.greenfox.jani.parkinglot.Color;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Rank {

    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    J(11),
    K(12),
    Q(13),
    A(14);

    private static final List<Rank> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();
    private int rank;

    Rank(int rank) {
        this.rank = rank;
    }

    public static Rank randomRank()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    public int getRank() {
        return rank;
    }
}