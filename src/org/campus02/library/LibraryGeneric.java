package org.campus02.library;

public class LibraryGeneric<T> {

    private T[] mediaArray;
    private int currentIndex = 0;

    public LibraryGeneric(T[] mediaArray) {
        this.mediaArray = mediaArray;
    }

    public void add1(T media) {
        // Variante 1
        if (currentIndex >= mediaArray.length) {
            return;
        }

        mediaArray[currentIndex] = media;
        currentIndex++;

    }

    public void add2(T media) {
        if (currentIndex < mediaArray.length) {
            mediaArray[currentIndex++] = media;
        } else {
            System.out.println("Größe überschritten");
        }
    }

    public void displayAll() {
        for (int i = 0; i < currentIndex; i++) {
            ((Media) mediaArray[i]).display();
        }
    }

    public void displayAllNotNull() {
        for (int i = 0; i < mediaArray.length; i++) {
            if (mediaArray[i] != null) {
                ((Media) mediaArray[i]).display();
            }
        }
    }

    public void ifdemo() {
        boolean healthy = true;
        if (healthy) {
            System.out.println("Juhu, ich bin gesund");
        }
        // else nicht zwingend notwendig

        if (healthy) {
            System.out.println("Juhu, ich bin gesund");
        } else {
            System.out.println("Oh nein, leider bin ich krank");
        }

        boolean shinyDay = true;
        if (healthy) {
            System.out.println("Juhu, ich bin gesund");
        } else if (shinyDay) {
            System.out.println("Super, es scheint die Sonne");
        }
        // else nicht zwinged erforderlich
    }

}
