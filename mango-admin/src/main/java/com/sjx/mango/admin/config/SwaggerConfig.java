package sjx.demo.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author sjx
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig{
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage("sjx.demo.controller"))
                .build().apiInfo(new ApiInfoBuilder()
                        .title("Swagger")
                .description("test")
                .version("9.0")
                .license("License")
                .licenseUrl("http:sjx1310.github.io")
                .build());
    }
}
