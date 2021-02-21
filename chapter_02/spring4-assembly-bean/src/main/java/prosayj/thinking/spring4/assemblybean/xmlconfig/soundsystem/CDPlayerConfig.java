package prosayj.thinking.spring4.assemblybean.xmlconfig.soundsystem;

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
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(compactDisc());
    }

}
