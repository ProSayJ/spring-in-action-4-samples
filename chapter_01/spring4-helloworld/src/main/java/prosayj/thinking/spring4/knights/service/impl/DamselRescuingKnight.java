package prosayj.thinking.spring4.knights.service.impl;

import prosayj.thinking.spring4.knights.service.Knight;

/**
 * 少女营救骑士
 *
 * @author yangjian
 */
public class DamselRescuingKnight implements Knight {

    private final SaveGirlTaskImpl quest;

    public DamselRescuingKnight() {
        this.quest = new SaveGirlTaskImpl();
    }

    @Override
    public void find() {
        quest.doTask();
    }

}
