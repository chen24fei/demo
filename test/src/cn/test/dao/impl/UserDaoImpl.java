package cn.test.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import cn.test.domain.User;

/**
 * UserDao µœ÷ 
 */
@Repository(value="userDao")
@Scope(value="singleton")
public class UserDaoImpl extends BaseDaoImpl<User>{
}
