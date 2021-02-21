package prosayj.thinking.spring4.knights.service.impl;

import prosayj.thinking.spring4.knights.service.Task;

import java.io.PrintStream;

/**
 * 屠龙任务
 *
 * @author yangjian
 */
public class KillDragonTaskImpl implements Task {
    private final PrintStream stream;

    public KillDragonTaskImpl(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void doTask() {
        stream.println("着手杀死巨龙！");
    }

}
