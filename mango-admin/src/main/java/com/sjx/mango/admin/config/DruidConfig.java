package sjx.demo.config;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.servlet.Servlet;
import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author sjx
 */
@Configuration
public class DruidConfig{
    @Bean
    @ConditionalOnMissingBean
    public DataSource druidDataSource(){
        Properties pro = new Properties();
        try {
            pro.load(DruidConfig.class.getClassLoader()
                    .getResourceAsStream("druid.properties"));
            return DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Bean
    @ConditionalOnMissingBean
    public ServletRegistrationBean<Servlet> druidServlet(){
        ServletRegistrationBean<Servlet> servletRegistrationBean =
                new ServletRegistrationBean<> (new StatViewServlet(), "/druid/*");

        servletRegistrationBean.addInitParameter("allow","127.0.0.1,139.196.87.48");

        servletRegistrationBean.addInitParameter("deny","192.168.1.119");
        servletRegistrationBean.addInitParameter("loginUsername","admin");
        servletRegistrationBean.addInitParameter("loginPassword","admin");
        servletRegistrationBean.addInitParameter("resetEnable","true");
        return servletRegistrationBean;

    }

    @Bean
    @ConditionalOnMissingBean
    public FilterRegistrationBean<Filter> filterRegistrationBean(){
        return new FilterRegistrationBean<> (new WebStatFilter());
    }
}
