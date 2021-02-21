package prosayj.thinking.spring4.knights;

import org.springframework.context.support.
        ClassPathXmlApplicationContext;
import prosayj.thinking.spring4.knights.service.Knight;

/**
 * 骑士
 *
 * @author yangjian
 */
public class KnightMain {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("META-INF/spring/knight.xml");
        Knight knight = context.getBean(Knight.class);
        knight.find();
        context.close();
    }

}
