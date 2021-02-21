package prosayj.thinking.spring4.assemblybean.mixedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import prosayj.thinking.spring4.support.CompactDisc;

/**
 * CDPlayerConfig
 *
 * @author yangjian
 */
@Configuration
public class CDPlayerConfig {

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

}
