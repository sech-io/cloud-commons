package com.sech.commons.config.meta;

import lombok.Data;

import java.io.Serializable;

/**
 * PathMeta
 *
 * @author sech.io
 */
@Data
public class PathMeta implements Serializable {

    private static final long serialVersionUID = 1498404943076628877L;

    /**
     * 应用名称
     */
    private String owner;

    /**
     * 文件路径
     */
    private String path;

    /**
     * 描述
     */
    private String description;

}
