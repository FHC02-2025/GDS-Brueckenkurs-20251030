package org.campus02.recap;

public class DemoGenericString {

    private String[] strings;

    public DemoGenericString(String[] strings) {
        this.strings = strings;
    }

    public void add(String newValue) {
        strings[0] = newValue;
    }
}
