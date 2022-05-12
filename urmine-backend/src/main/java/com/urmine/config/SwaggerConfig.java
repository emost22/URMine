package com.urmine.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

/*
 * Swagger 설정을 위한 SwaggerConfig
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    public static final String SECURITY_SCHEMA_NAME = "JWT";
    public static final String AUTHORIZATION_SCOPE_GLOBAL = "global";
    public static final String AUTHORIZATION_SCOPE_GLOBAL_DESC = "accessEverything";

    private List<SecurityReference> defaultAuth() {
        /*
         * 요청에 포함되는 헤더를 전역으로 사용할 수 있도록 설정하는 메소드
         */
        AuthorizationScope authorizationScope = new AuthorizationScope(AUTHORIZATION_SCOPE_GLOBAL, AUTHORIZATION_SCOPE_GLOBAL_DESC);
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return newArrayList(new SecurityReference(SECURITY_SCHEMA_NAME, authorizationScopes));
    }

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
