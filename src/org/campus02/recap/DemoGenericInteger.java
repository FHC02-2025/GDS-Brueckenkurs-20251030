package org.campus02.recap;

public class DemoGenericInteger {

    private Integer[] strings;

    public DemoGenericInteger(Integer[] strings) {
        this.strings = strings;
    }

    public void add(Integer newValue) {
        strings[0] = newValue;
    }
}
