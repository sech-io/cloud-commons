package com.github.sech.commons.base.page;

import com.github.sech.commons.base.constant.GlobalConstant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * page 查询参数封装
 *
 * @author sech.io
 */
@ApiModel(description = "分页查询表单")
public class PageParams {

    /**
     * 当前页码
     */
    @ApiModelProperty(value = "当前页码，默认1")
    private Integer currentPage = 1;

    /**
     * 每页多少条 limit
     */
    @ApiModelProperty(value = "每页多少条，默认10条")
    private Integer pageSize = GlobalConstant.PAGE_NUM;

    public Integer getCurrentPage() {
        currentPage = (null == currentPage || currentPage <= 0) ? 1 : currentPage;
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return (null == pageSize || pageSize < 0) ? GlobalConstant.PAGE_NUM : pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

}
