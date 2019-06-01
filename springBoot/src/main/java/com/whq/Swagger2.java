package com.whq;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: wanghuanqing
 * @date: Create in 2019/6/1 17:34
 * @desc: 不需要结合springBoot即可使用swagger
 */
//注释掉不使用以下加载方式
//@Configuration
@EnableSwagger2
public class Swagger2 {
    @Bean
    public Docket newDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(createApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.whq"))
                .paths(PathSelectors.any()).build();
    }

    /**
     * @author: wanghuanqing
     * @date: 2019/6/1 17:44
     * @desc: 配置应用相关信息
     * @param
     * @return springfox.documentation.service.ApiInfo
     */
    public ApiInfo createApiInfo(){
        return new ApiInfoBuilder().title("Spring Boot swagger Test")
                .description("测试swagger和SpringBoot应用")
                .termsOfServiceUrl("localhost:8080")
                .contact(new Contact("whq" , "" , "1097864491@qq.com" ))
                .version("1.0")
                .build();
    }
}
