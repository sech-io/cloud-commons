package com.github.sech.commons.config;

import com.github.sech.commons.config.properties.ConfigProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 项目配置入口，统一规范
 *
 * @author sech.io
 */
@Configuration
@EnableConfigurationProperties(value = ConfigProperties.class)
public class FwCloudConfig {

}
