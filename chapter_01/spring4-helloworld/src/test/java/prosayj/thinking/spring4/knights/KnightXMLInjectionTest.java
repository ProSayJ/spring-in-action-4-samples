package prosayj.thinking.spring4.knights;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import prosayj.thinking.spring4.knights.service.Knight;
import prosayj.thinking.spring4.knights.support.FakePrintStream;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:knights/KnightXMLInjectionTest-context.xml"})
public class KnightXMLInjectionTest {

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
                "Fa la la, the knight is so brave!\n" +
                        "着手杀死巨龙！\n" +
                        "Tee hee hee, the brave knight did embark on a quest!\n",
                printStream.getPrintedString());
    }

}
