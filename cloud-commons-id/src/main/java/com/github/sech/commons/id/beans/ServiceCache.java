package com.github.sech.commons.id.beans;

import lombok.Data;

import java.io.Serializable;

/**
 * 服务缓存，可以扩展为服务单独部署或者请求远程接口
 *
 * @author sech.io
 */
@Data
public class ServiceCache implements Serializable {

    private static final long serialVersionUID = 2665288390514264548L;

    /**
     * host
     */
    private String host;

    /**
     * 端口号
     */
    private int port;

}
