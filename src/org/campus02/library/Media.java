package org.campus02.library;

public class Media {

    private String title;
    private int year;
    private String type;

    // ALT + EINFG
    public Media(String title, int year, String type) {
        this.title = title;
        this.year = year;
        this.type = type;
    }

    public void display() {
        System.out.println("--------------");
        System.out.println("Media: ");
        System.out.println("title = " + title);
        System.out.println("year = " + year);
        System.out.println("type = " + type);
        System.out.println("--------------"); // STRG + D -> copy
    }

    // read-only type
    public String getType() {
        return type;
    }
}
