package com.blade.web.convert.impl;

import com.blade.service.user.dto.UserDTO;
import com.blade.web.convert.BladeWebConvert;
import com.blade.web.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

/**
 *
 * @author xiaofeidao
 * @date 2019/4/1
 */
@Component
public class UserWebConvert extends BladeWebConvert {


    public User toModel(UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        return user;
    }
}
