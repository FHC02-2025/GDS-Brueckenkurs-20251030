package org.campus02.genericdemo;

public class PairDemo {

    public static void main(String[] args) {
        // Schulfächer + Note
        Pair<String, Integer> pair1 = new Pair<>("Mathematik", 1);
        pair1.print();

        Pair<String, String> categories = new Pair<>("Obst", "Apfel");

        Pair<Integer, Integer> ints = new Pair<>(2,3);

        Pair<String, Integer> demo = new Pair<>("Hallo", 3);

    }
}
