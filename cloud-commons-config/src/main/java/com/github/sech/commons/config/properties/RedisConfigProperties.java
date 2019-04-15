package com.github.sech.commons.config.properties;

import lombok.Getter;
import lombok.Setter;

/**
 * Redis cache config set
 *
 * @author sech.io
 */
@Setter
@Getter
public class RedisConfigProperties {

    /**
     * 缓存前缀,默认'_'
     */
    private String prefix = "_";

    /**
     * 自定义 redis expiration 单位秒<br/>
     * 默认5分钟
     */
    private int expiration = 300;

}
