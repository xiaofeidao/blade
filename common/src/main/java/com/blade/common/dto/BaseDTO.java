package com.blade.common.dto;


import lombok.Data;

import java.util.Date;

/**
 *
 * @author xiaofeidao
 * @date 2019/4/1
 */
@Data
public class BaseDTO {

    protected Long id;

    protected Date createdTIme;

    protected Date updatedTime;

    protected String createdBy;

    protected String updatedBy;

}
