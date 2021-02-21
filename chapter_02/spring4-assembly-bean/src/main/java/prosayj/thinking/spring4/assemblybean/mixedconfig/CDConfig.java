package prosayj.thinking.spring4.assemblybean.mixedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import prosayj.thinking.spring4.support.CompactDisc;

/**
 * CDConfig
 *
 * @author yangjian
 */
@Configuration
public class CDConfig {
    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }
}