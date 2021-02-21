package prosayj.thinking.spring4.knights.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import prosayj.thinking.spring4.knights.service.impl.BraveKnight;
import prosayj.thinking.spring4.knights.service.Knight;
import prosayj.thinking.spring4.knights.service.Task;
import prosayj.thinking.spring4.knights.service.impl.KillDragonTaskImpl;

/**
 * KnightConfig
 *
 * @author yangjian
 */
@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Task quest() {
        return new KillDragonTaskImpl(System.out);
    }

}
