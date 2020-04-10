package Composite;

public class CompositeProgram {

    public static void main(String[] args) {

        Playlist playlist0 = new Playlist("Ukrainian songs");
        Playlist playlist1 = new Playlist("Океан Ельзи");

        Song song0 = new Song("Time", "O.Torvald", (float) 1.0);
        Song song1 = new Song("На картах світу", "Arlett", (float) 1.0);
        Song song2 = new Song("Перевал", "Океан Ельзи", (float) 1.0);
        Song song3 = new Song("Бухло", "Жадан і собаки", (float) 1.0);
        Song song4 = new Song("Хтось в небо летить", "Океан Ельзи", (float) 1.0);

        playlist0.add(song0);
        playlist0.add(song1);
        playlist0.add(playlist1);
        playlist1.add(song2);
        playlist0.add(song3);
        playlist1.add(song4);

        playlist0.play();
        playlist1.play();

        playlist0.remove(song0);
        playlist0.play();

        playlist0.remove(playlist1);
        playlist0.play();

        System.out.println("Name: " + song3.getName() + "\nArtist: " + song3.getArtist() + "\n");
        song3.play();
    }

}
