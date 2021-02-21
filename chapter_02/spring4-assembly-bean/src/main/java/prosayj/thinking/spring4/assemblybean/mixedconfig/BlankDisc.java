package prosayj.thinking.spring4.assemblybean.mixedconfig;

import prosayj.thinking.spring4.support.CompactDisc;

import java.util.List;

/**
 * BlankDisc
 *
 * @author yangjian
 */
public class BlankDisc implements CompactDisc {

    private final String title;
    private final String artist;
    private final List<String> tracks;

    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }

}