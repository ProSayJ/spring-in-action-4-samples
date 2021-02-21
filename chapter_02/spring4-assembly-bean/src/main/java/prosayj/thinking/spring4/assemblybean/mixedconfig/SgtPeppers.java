package prosayj.thinking.spring4.assemblybean.mixedconfig;


import prosayj.thinking.spring4.support.CompactDisc;

/**
 * SgtPeppers
 *
 * @author yangjian
 */
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

}
