package org.campus02.library;

public class DemoApp {

    public static void main(String[] args) {
        Media media1 = new Media("Mobby Dick", 1950, "Book");
        media1.display();

        //media1.year = 1919; // funktioniert nicht, da private
        String typeOfMedia1 = media1.getType();
        System.out.println("typeOfMedia1 = " + typeOfMedia1);

        Library library = new Library(new Media[10]);
        library.add1(media1);
        library.displayAll();
        library.displayAllNotNull();

    }
}
