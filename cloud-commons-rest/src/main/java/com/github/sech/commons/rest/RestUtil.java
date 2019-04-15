package com.github.sech.commons.rest;

import com.github.sech.commons.utils.StringHelper;
import org.springframework.web.client.RestTemplate;

/**
 * 通过请求URL获取不同类别的RestTemplate
 *
 * @author sech.io
 */
public class RestUtil {

    public static final String HTTPS = "https";

    public static RestTemplate restTemplate(String reqUrl) {
        if (StringHelper.isBlank(reqUrl)) return new RestTemplate();

        return reqUrl.startsWith(HTTPS) ? new RestTemplate(new RestClientRequestFactory())
                : new RestTemplate();
    }
}
