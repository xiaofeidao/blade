package com.blade.service.user.core;

import com.blade.service.user.UserService;
import com.blade.service.user.core.convert.UserConvert;
import com.blade.service.user.core.dao.po.User;
import com.blade.service.user.core.dao.repository.UserRepository;
import com.blade.service.user.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author xiaofeidao
 * @date 2019/4/1
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConvert userConvert;

    @Override
    public UserDTO getByUid(String uid) {
        User user = userRepository.findByUid(uid);
        if(user == null){
            return null;
        }
        return userConvert.toDTO(user);
    }

}
