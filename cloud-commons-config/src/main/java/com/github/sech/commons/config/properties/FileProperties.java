package com.github.sech.commons.config.properties;

import com.github.sech.commons.config.meta.PathMeta;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * file config set
 *
 * @author sech.io
 */
@Setter
@Getter
public class FileProperties {

    /**
     * 根路径
     */
    private String rootPath;

    /**
     * 文件路径 ( key : pathCode )
     */
    private Map<String, PathMeta> path;

}
