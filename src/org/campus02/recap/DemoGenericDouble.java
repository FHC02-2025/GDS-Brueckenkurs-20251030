package org.campus02.recap;

public class DemoGenericDouble {

    private Double[] strings;

    public DemoGenericDouble(Double[] strings) {
        this.strings = strings;
    }

    public void add(Double newValue) {
        strings[0] = newValue;
    }
}
