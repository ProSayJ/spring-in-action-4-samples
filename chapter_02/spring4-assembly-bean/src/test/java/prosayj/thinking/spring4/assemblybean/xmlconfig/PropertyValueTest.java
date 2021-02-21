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
@ContextConfiguration(locations = {"classpath:xmlconfig/PropertyValueTest-context.xml"})
public class PropertyValueTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer player;

    @Test
    public void play() {
        player.play();
        String property = System.getProperty("line.separator");
        assertEquals(
                "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles" + property +
                        "-Track: Sgt. Pepper's Lonely Hearts Club Band" + property +
                        "-Track: With a Little Help from My Friends" + property +
                        "-Track: Lucy in the Sky with Diamonds" + property +
                        "-Track: Getting Better" + property +
                        "-Track: Fixing a Hole" + property +
                        "-Track: She's Leaving Home" + property +
                        "-Track: Being for the Benefit of Mr. Kite!" + property +
                        "-Track: Within You Without You" + property +
                        "-Track: When I'm Sixty-Four" + property +
                        "-Track: Lovely Rita" + property +
                        "-Track: Good Morning Good Morning" + property +
                        "-Track: Sgt. Pepper's Lonely Hearts Club Band (Reprise)" + property +
                        "-Track: A Day in the Life" + property,
                log.getLog());
    }

}
