package com.github.sech.commons.id.beans;

import com.github.sech.commons.id.IdWorker;
import lombok.Data;

/**
 * IdWorker 封装
 *
 * @author sech.io
 */
@Data
public class IdWorkerWrapper {

    /**
     * 数据中心ID ( 0 - 31 )
     */
    private long centerId;

    /**
     * 机器ID ( 0 - 31 )
     */
    private long workerId;

    /**
     * ID生成器
     */
    private IdWorker idWorker;

    /**
     * 缓存键
     */
    private String cacheKey;

    /**
     * host ip 缓存值
     */
    private ServiceCache serviceCache;

}
