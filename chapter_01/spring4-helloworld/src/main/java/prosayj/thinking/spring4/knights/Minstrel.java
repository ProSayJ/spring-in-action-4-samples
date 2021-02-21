package prosayj.thinking.spring4.knights;

import java.io.PrintStream;

/**
 * @author yangjian
 */
public class Minstrel {

    private final PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }


    public void singBeforeQuest() {
        stream.println("Fa la la, the knight is so brave!");
    }

    public void singAfterQuest() {
        stream.println("Tee hee hee, the brave knight " +
                "did embark on a quest!");
    }

}
