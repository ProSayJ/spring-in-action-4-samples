package prosayj.thinking.spring4.webmvchelloworld.spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import prosayj.thinking.spring4.webmvchelloworld.spittr.web.WebConfig;


/**
 * SpitterWebInitializer
 *
 * @author yangjian
 */
public class SpitterWebInitializer
        extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    /**
     * 指定配置类
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    /**
     * 将dispactherServlet 映射到 /
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}