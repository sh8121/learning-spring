package com.sboo.springboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.boot.web.reactive.function.client.WebClientCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class SpringbootTutorialApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringbootTutorialApplication.class);
        app.run(args);
    }

    @Bean
    public WebClientCustomizer webClientCustomizer() {
        return webClientBuilder -> webClientBuilder.baseUrl("http://localhost:8080");
        //혹은 Builder 자체를 새로 등록
    }

    @Bean
    public RestTemplateCustomizer restTemplateCustomizer() {
        return new RestTemplateCustomizer() {
            @Override
            public void customize(RestTemplate restTemplate) {
                restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
                //restTemplate 내부에서 사용하는 client를
                //java.net.httpconnection -> apache.httpclient 로 변경
            }
        };
    }

}
