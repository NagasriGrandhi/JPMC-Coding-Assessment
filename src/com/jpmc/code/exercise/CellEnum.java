package com.jpmc.code.exercise;

import java.util.HashMap;
import java.util.Map;

public enum CellEnum {
    ALIVE('O'), DEAD('.');

    private char value;

    CellEnum(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }
    private static final Map<Character, CellEnum> cellEnumMap = new HashMap();
    static {
        // populating the map
        for (CellEnum myEnum : values()) {
            cellEnumMap.put(myEnum.getValue(), myEnum);
        }
    }

    public static CellEnum getCellEnum(char value) {
        return cellEnumMap.get(value);
    }
}
