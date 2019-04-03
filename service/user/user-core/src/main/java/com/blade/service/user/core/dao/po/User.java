package com.blade.service.user.core.dao.po;

import com.blade.common.po.BasePO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author xianglong
 * @date 2019/4/1
 */
@Table(name = "user_info")
@Entity
@Data
public class User extends BasePO {

    private String uid;
}
