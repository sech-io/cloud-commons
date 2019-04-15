package com.sech.commons.config.properties;

import lombok.Getter;
import lombok.Setter;

/**
 * 微信公众号相关配置
 *
 * @author sech.io
 */
@Setter
@Getter
public class WechatProperties {

    /**
     * 和公众号服务指定的webchat_id 一致
     */
    private String webchat_id;

    /**
     * 公众号服务指定的加密key，网络传输中加密
     */
    private String webchat_key;

    /**
     * 公众号服务指定的加密key，网络传输中加密
     */
    private String webchat_reskey;

    /**
     * 公众号授权服务接口URL
     */
    private String webchat_openid;
}
