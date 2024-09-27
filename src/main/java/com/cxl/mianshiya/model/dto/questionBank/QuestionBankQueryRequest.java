package com.cxl.mianshiya.model.dto.questionBank;

import com.cxl.mianshiya.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 查询题库请求
 *
 *  
 *   
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QuestionBankQueryRequest extends PageRequest implements Serializable {

    /**
     * id
     */
    private Long id;
    /**
     * notId
     */
    private Long notId;
    /**
     * 标题
     */
    private String title;

    /**
     * 描述
     */
    private String description;
    /**
     * 图片
     */
    private String picture;
    /**
     * 用户id
     */
    private Long userId;

    private static final long serialVersionUID = 1L;
}