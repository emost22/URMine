package com.urmine.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*
 * Swagger 설정을 위한 SwaggerConfig
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private ApiInfo apiInfo() {
        /*
         * API의 정보를 반환하는 메소드
         */
        return new ApiInfoBuilder()
                .title("U R Mine!")
                .description("포켓몬 띠브띠브씰 도감")
                .version("v1.0")
                .build();
    }
}
