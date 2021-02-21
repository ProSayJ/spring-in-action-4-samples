package prosayj.thinking.spring4.knights.service.impl;

import prosayj.thinking.spring4.knights.service.Task;

/**
 * 营救少女任务
 *
 * @author yangjian
 */
public class SaveGirlTaskImpl implements Task {

    @Override
    public void doTask() {
        System.out.println("着手准备营救少女");
    }

}
