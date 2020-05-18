package com.benny.traveladvisor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Description: This is the Swagger2 configuration class
 * @author benny.li
 * Date: 2020/5/18
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.benny.traveladvisor.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * Description: 构建api文档的详细信息函数
     * @author benny.li
     * Date: 2020/5/18
     * @return springfox.documentation.service.ApiInfo
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("Timatic3 - Travel Advisor API")
                //条款地址
                .termsOfServiceUrl("http://127.0.0.1/")
                .version("1.0")
                //描述
                .description("This is the API wrapper for getting the travel advisory/requirement by calling Timatic3 API." + "\n" +
                        "<br/><hr/><font size=5 color=#FF0000><B>Digital signature</B></font><hr/>" +
                        "<br/>In each API call, a \"sign\" parameter needs to be provided as an authentication. Partner and Service Provider team must exchange RSA keys before making API calls, and the length of RSA key must be 2048 bits." +
                        "<br/><br/>When making API call, partner uses the RSA private key to sign the API request. After receiving the API request, Service Provider will use the partner's RSA public key to verify whether the signature is matched to the content of API request." +
                        "<br/><br/>Similarly, when partner receives the API response, it is highly recommended that partner verifies the signature of API response by using Service Provider's RSA public key." +
                        "<br/><br/>The following illustrates the interaction flow:" +
                        "<br/>1. Sign API request with partner's RSA private key" +
                        "<br/>2. Send API request" +
                        "\n  2.1 Service Provider to verify the signature by using partner's RSA public key" +
                        "\n  2.2 Service Provider to process the request" +
                        "\n  2.3 Service Provider to sign the API response by using Service Provider's RSA private key" +
                        "\n  2.4 Send API response to client" +
                        "<br/>3. Partner to verify API response by using Service Provider's RSA public key")
                .build();
    }
}
