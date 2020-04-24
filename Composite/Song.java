package Composite;

public class Song implements IComponent {

    String songName;
    String artist;

    public Song(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
        System.out.println("Song " + songName + " is created");
    }

    public void play() {
        System.out.println("Play song " + this.songName);
    };

    public String getName() {
        return this.songName;
    };

    public String getArtist() {
        return this.artist;
    }
}
