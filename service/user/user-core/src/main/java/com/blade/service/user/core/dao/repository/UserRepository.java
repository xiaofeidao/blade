package com.blade.service.user.core.dao.repository;

import com.blade.service.user.core.dao.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author xiaofeidao
 * @date 2019/4/1
 */
public interface UserRepository extends JpaRepository<User, Long>{

    User findByUid(String uid);
}
