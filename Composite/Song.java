package Composite;

public class Song implements IComponent {

    String songName;
    String artist;
    float speed;

    public Song(String songName, String artist, float speed) {
        this.songName = songName;
        this.artist = artist;
        this.speed = speed;
    }

    public void play() {
        System.out.println("Play " + this.songName + "\n");
    };

    public void setPlaybackSpeed(float speed) {
        this.speed = speed;
        System.out.println("Set playback speed " + speed + " to " + this.getName() + "\n");
    };

    public String getName() {
        return this.songName;
    };

    public String getArtist() {
        return this.artist;
    }
}
