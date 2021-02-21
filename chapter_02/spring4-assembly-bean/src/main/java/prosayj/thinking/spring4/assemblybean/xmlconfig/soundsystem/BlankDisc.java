package prosayj.thinking.spring4.assemblybean.xmlconfig.soundsystem;

import prosayj.thinking.spring4.support.CompactDisc;

/**
 * BlankDisc
 *
 * @author yangjian
 */
public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

}
