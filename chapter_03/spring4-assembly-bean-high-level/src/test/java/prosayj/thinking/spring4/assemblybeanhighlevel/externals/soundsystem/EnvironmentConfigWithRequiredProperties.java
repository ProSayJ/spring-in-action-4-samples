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
public class EnvironmentConfigWithRequiredProperties {

    @Autowired
    private Environment env;

    @Bean
    public BlankDisc blankDisc() {
        return new BlankDisc(
                env.getRequiredProperty("disc.title"),
                env.getRequiredProperty("disc.artist"));
    }

}
