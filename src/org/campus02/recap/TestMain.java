package org.campus02.recap;

public class TestMain {

    public static void main(String[] args) {
        DemoGeneric<String> demo = new DemoGeneric<String>(new String[10]);
        demo.add("Hallo");
        DemoGeneric<Integer> integer = new DemoGeneric<Integer>(new Integer[10]);
        integer.add(0);

        DemoGeneric<Double> doubles = new DemoGeneric<>(new Double[10]);
    }
}
