package prosayj.thinking.spring4.assemblybean.autoconfig.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import prosayj.thinking.spring4.support.CompactDisc;
import prosayj.thinking.spring4.support.MediaPlayer;

/**
 * CDPlayer
 *
 * @author yangjian
 */
@Component
public class CDPlayer implements MediaPlayer {
    private final CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }

}
