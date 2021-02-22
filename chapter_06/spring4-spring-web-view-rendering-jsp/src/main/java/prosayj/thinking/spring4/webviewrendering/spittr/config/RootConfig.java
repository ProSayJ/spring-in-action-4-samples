package prosayj.thinking.spring4.webviewrendering.spittr.config;

import java.util.regex.Pattern;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.core.type.filter.RegexPatternTypeFilter;


/**
 * RootConfig
 *
 * @author yangjian
 */
@Configuration
@Import(DataConfig.class)
@ComponentScan(basePackages = {"prosayj.thinking.spring4.webviewrendering"},
        excludeFilters = {
                @Filter(type = FilterType.CUSTOM, value = RootConfig.WebPackage.class)
        })
public class RootConfig {
    public static class WebPackage extends RegexPatternTypeFilter {
        public WebPackage() {
            super(Pattern.compile("prosayj.thinking.spring4.webmvchelloworld.spittr\\.web"));
        }
    }
}
