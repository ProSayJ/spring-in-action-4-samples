package prosayj.thinking.spring4.assemblybeanhighlevel.externals.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * EnvironmentConfigWithRequiredProperties
 *
 * @author yangjian
 */
@Configuration
public class EnvironmentConfigWithDefaults {

    @Autowired
    private Environment env;

    @Bean
    public BlankDisc blankDisc() {
        return new BlankDisc(
                env.getProperty("disc.title", "Rattle and Hum"),
                env.getProperty("disc.artist", "U2"));
    }

}
