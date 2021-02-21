package prosayj.thinking.spring4.assemblybean.xmlconfig.soundsystem.properties;

import org.springframework.beans.factory.annotation.Autowired;
import prosayj.thinking.spring4.support.CompactDisc;
import prosayj.thinking.spring4.support.MediaPlayer;

/**
 * CDPlayer
 *
 * @author yangjian
 */
public class CDPlayer implements MediaPlayer {
    private CompactDisc compactDisc;

    @Autowired
    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    @Override
    public void play() {
        compactDisc.play();
    }

}
