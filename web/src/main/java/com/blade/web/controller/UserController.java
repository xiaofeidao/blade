package com.blade.web.controller;

import com.blade.service.user.UserService;
import com.blade.service.user.dto.UserDTO;
import com.blade.web.convert.impl.UserWebConvert;
import com.blade.web.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author xiaofeidao
 * @date 2019/4/1
 */
@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserWebConvert userWebConvert;

    @RequestMapping(value = "/{uid}", method = RequestMethod.GET)
    @ResponseBody
    public User getById(@PathVariable("uid") String uid) {
        UserDTO userDTO = userService.getByUid(uid);
        return userWebConvert.toModel(userDTO);
    }

}
