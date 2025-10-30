package org.campus02.genericdemo;

public class Pair<K, V> {

    private K left;
    private V right;

    public Pair(K left, V right) {
        this.left = left;
        this.right = right;
    }

    public void print() {
        System.out.println("left = " + left);
        System.out.println("right = " + right);
    }
}
