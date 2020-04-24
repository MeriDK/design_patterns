package Composite;

public class CompositeProgram {

    public static void main(String[] args) {

        Playlist playlist0 = new Playlist("Ukrainian songs");
        Playlist playlist1 = new Playlist("Океан Ельзи");
        System.out.println();

        Song song0 = new Song("Time", "O.Torvald");
        Song song1 = new Song("На картах світу", "Arlett");
        Song song2 = new Song("Перевал", "Океан Ельзи");
        Song song3 = new Song("Бухло", "Жадан і собаки");
        Song song4 = new Song("Хтось в небо летить", "Океан Ельзи");
        System.out.println();

        playlist0.add(song0);
        playlist0.add(song1);
        playlist0.add(playlist1);
        playlist1.add(song2);
        playlist0.add(song3);
        playlist1.add(song4);
        System.out.println();

        playlist0.play();
        System.out.println();

        playlist0.remove(song0);
        playlist0.play();
        System.out.println();

        playlist0.remove(playlist1);
        playlist0.play();
        System.out.println();

        System.out.println("Name: " + song3.getName() + "\nArtist: " + song3.getArtist());
        song3.play();
    }

}
