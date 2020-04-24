package Composite;

import java.util.ArrayList;

public class Playlist implements IComponent {

    private String playlistName;
    private ArrayList<IComponent> playlist;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.playlist = new ArrayList<IComponent>();
        System.out.println("Playlist " + playlistName + " is created");
    }

    public void play() {
        System.out.println("Play playlist " + this.playlistName + ":");

        for (IComponent component: this.playlist) {
            component.play();
        }
    };

    public String getName() {
        return this.playlistName;
    };

    public void add(IComponent component) {
        this.playlist.add(component);
        System.out.println("Add " + component.getName() + " to " + this.getName());
    }

    public void remove(IComponent component) {
        this.playlist.remove(component);
        System.out.println("Remove " + component.getName() + " from " + this.getName() + "\n");
    }
}
