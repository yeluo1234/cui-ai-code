package com.yupi.yuaicodemother.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author cui
 * @version 1.0
 * @description todo
 * @date 2025/11/25下午12:59
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
