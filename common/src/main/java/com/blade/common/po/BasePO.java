package com.blade.common.po;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 *
 * @author xiaofeidao
 * @date 2019/4/1
 */
@Data
@MappedSuperclass
@EqualsAndHashCode
public class BasePO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    protected Date createTime;

    protected Date updateTime;

    protected String createdBy;

    protected String updatedBy;
}
