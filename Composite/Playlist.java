package Composite;

import java.util.ArrayList;

public class Playlist implements IComponent {

    private String playlistName;
    private ArrayList<IComponent> playlist;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.playlist = new ArrayList<IComponent>();
    }

    public void play() {
        System.out.println("Play " + this.playlistName + ":");

        for (IComponent component: this.playlist) {
            System.out.println(component.getName());
        }

        System.out.println();
    };

    public void setPlaybackSpeed(float speed) {
        System.out.println("Set playback speed " + speed + " to " + this.getName() + "\n");
        for (IComponent component: this.playlist) {
            component.setPlaybackSpeed(speed);
        }
    };

    public String getName() {
        return this.playlistName;
    };

    public void add(IComponent component) {
        this.playlist.add(component);
        System.out.println("Add " + component.getName() + " to " + this.getName() + "\n");
    }

    public void remove(IComponent component) {
        this.playlist.remove(component);
        System.out.println("Remove " + component.getName() + " from " + this.getName() + "\n");
    }
}
