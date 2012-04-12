package cn.test.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.test.dao.BaseDao;
import cn.test.domain.User;
import cn.test.service.UserService;

/**
 * userservice
 * @author Administrator
 *
 * @param <User>
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

	@Override
	@Resource(name="userDao")
	public void setDao(BaseDao<User> dao) {
		// TODO Auto-generated method stub
		super.setDao(dao);
	}
}
