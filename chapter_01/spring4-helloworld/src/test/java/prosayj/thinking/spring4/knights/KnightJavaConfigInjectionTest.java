package prosayj.thinking.spring4.knights;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import prosayj.thinking.spring4.knights.service.Knight;
import prosayj.thinking.spring4.knights.support.FakePrintStream;
import prosayj.thinking.spring4.knights.support.KnightConfig;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = KnightConfig.class, loader = AnnotationConfigContextLoader.class)
public class KnightJavaConfigInjectionTest {

    @Autowired
    private Knight knight;

    @Autowired
    private FakePrintStream printStream;

    @After
    public void clearPrintStream() {
        printStream.clear();
    }

    @Test
    public void shouldInjectKnightWithSlayDragonQuest() {
        knight.find();
        assertEquals(
                "着手杀死巨龙！\n",
                printStream.getPrintedString());
    }

}
