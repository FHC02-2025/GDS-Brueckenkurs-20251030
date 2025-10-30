package org.campus02.library;

public class Library {

    private Media[] mediaArray;
    private int currentIndex = 0;

    public Library(Media[] mediaArray) {
        this.mediaArray = mediaArray;
    }

    public void add1(Media media) {
        // Variante 1
        if (currentIndex >= mediaArray.length) {
            return;
        }

        mediaArray[currentIndex] = media;
        currentIndex++;

    }

    public void add2(Media media) {
        if (currentIndex < mediaArray.length) {
            mediaArray[currentIndex++] = media;
        } else {
            System.out.println("Größe überschritten");
        }
    }

    public void displayAll() {
        for (int i = 0; i < currentIndex; i++) {
            mediaArray[i].display();
        }
    }

    public void displayAllNotNull() {
        for (int i = 0; i < mediaArray.length; i++) {
            if (mediaArray[i] != null) {
                mediaArray[i].display();
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

    public void checkMediaType(Media media) {
        if (media.getType().equals("Book")) {
            System.out.println("This is a book");
        } else if (media.getType().equals("Magazine")) {
            System.out.println("This is a magazine");
        } else if (media.getType().equals("Movie")) {
            System.out.println("This is a movie");
        } else {
            System.out.println("Unknown media type");
        }
    }
}
