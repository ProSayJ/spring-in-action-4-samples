package prosayj.thinking.spring4.assemblybean.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import prosayj.thinking.spring4.support.CompactDisc;
import prosayj.thinking.spring4.support.MediaPlayer;

/**
 * CDPlayer
 *
 * @author yangjian
 */
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }

}
