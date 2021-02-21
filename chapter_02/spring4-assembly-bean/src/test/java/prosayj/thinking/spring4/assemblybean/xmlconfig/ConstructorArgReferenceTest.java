package prosayj.thinking.spring4.assemblybean.xmlconfig;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import prosayj.thinking.spring4.support.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:xmlconfig/ConstructorArgReferenceTest-context.xml"})
public class ConstructorArgReferenceTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer player;

    @Test
    public void play() {
        player.play();
        String property = System.getProperty("line.separator");
        assertEquals(
                "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles" + property,
                log.getLog());
    }

}
