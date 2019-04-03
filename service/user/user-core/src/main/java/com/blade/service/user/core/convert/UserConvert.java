package com.blade.service.user.core.convert;

import com.blade.service.user.core.dao.po.User;
import com.blade.service.user.dto.UserDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

/**
 *
 * @author xiaofeidao
 * @date 2019/4/1
 */
@Component
public class UserConvert {

    public UserDTO toDTO(User user) {
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user, userDTO);
        return userDTO;
    }
}
