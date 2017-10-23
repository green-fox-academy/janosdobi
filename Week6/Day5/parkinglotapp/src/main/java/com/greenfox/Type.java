package com.greenfox;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Type {

    BMW, AUDI, MERCEDES, VOLKSWAGEN, HONDA, MAZDA, TOYOTA;

    private static final List<Type> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Type randomType()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}