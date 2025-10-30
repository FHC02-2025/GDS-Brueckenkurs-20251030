package org.campus02.recap;

public class DemoGeneric<T> {

    private T[] strings;

    public DemoGeneric(T[] strings) {
        this.strings = strings;
    }

    public void add(T newValue) {
        strings[0] = newValue;
    }
}
