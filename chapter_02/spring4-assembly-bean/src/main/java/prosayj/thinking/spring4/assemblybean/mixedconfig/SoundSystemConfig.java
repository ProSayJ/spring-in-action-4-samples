package prosayj.thinking.spring4.assemblybean.mixedconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * SoundSystemConfig
 *
 * @author yangjian
 */
@Configuration
@Import(CDPlayerConfig.class)
@ImportResource("classpath:mixedconfig/cd-config.xml")
public class SoundSystemConfig {

}
