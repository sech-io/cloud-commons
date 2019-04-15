package com.github.sech.commons.rest.config;

import com.github.sech.commons.config.properties.ConfigProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * RestTemple Config
 *
 * @author sech.io
 */
@Configuration
public class RestTemplateConfiguration {

    @Resource
    private ConfigProperties fwConfigProperties;

    @Bean
    public RestTemplate restTemplate(ClientHttpRequestFactory factory) {
        return new RestTemplate(factory);
    }

    @Bean
    public ClientHttpRequestFactory simpleClientHttpRequestFactory() {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setReadTimeout(fwConfigProperties.getRestTemplate().getReadTimeout());
        factory.setConnectTimeout(fwConfigProperties.getRestTemplate().getConnectTimeout());
        return factory;
    }
}
