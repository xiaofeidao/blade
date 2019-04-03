package com.blade.service.user;

import com.blade.service.user.dto.UserDTO;

/**
 *
 * @author xiaofeidao
 * @date 2019/4/1
 */
public interface UserService {

    UserDTO getByUid(String uid);
}
