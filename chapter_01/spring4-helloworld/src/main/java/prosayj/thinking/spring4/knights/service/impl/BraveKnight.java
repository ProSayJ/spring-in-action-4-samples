package prosayj.thinking.spring4.knights.service.impl;

import prosayj.thinking.spring4.knights.service.Task;
import prosayj.thinking.spring4.knights.service.Knight;

/**
 * 勇敢的骑士
 *
 * @author yangjian
 */
public class BraveKnight implements Knight {

    private final Task quest;

    public BraveKnight(Task quest) {
        this.quest = quest;
    }

    @Override
    public void find() {
        quest.doTask();
    }

}
