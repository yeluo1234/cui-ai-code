package com.yupi.yuaicodemother.common;

import lombok.Data;

/**
 * @author cui
 * @version 1.0
 * @description todo
 * @date 2025/11/25下午12:56
 */
@Data
public class PageRequest {

    /**
     * 当前页码
     */
    private int pageNum = 1;

    /**
     * 每页大小
     */
    private int pageSize = 10;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序顺序
     */
    private String sortOrder = "descend";
}
