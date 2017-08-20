package dong.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Java配置DispatcherServlet 不需要使用web.xml文件
 * 继承AbstractAnnotationConfigDispatcherServletInitializer，
 * 会自动配置Dispatcher-Servlet和Spring应用上下文
 * 并加载配置文件或配置类中所声明的bean
 * Created by DONGSHILEI on 2017/8/2.
 */
public class DongWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    /**
     * 将DispatcherServlet映射到"/"
     * @return
     */
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
