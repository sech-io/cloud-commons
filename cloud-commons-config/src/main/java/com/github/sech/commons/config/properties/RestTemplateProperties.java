package com.github.sech.commons.config.properties;

import lombok.Getter;
import lombok.Setter;

/**
 * RestTemplate config set
 *
 * @author sech.io
 */
@Setter
@Getter
public class RestTemplateProperties {

    /**
     * http read timeout ms
     */
    private int readTimeout = 15000;

    /**
     * http connect timeout ms
     */
    private int connectTimeout = 15000;
}
