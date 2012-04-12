package cn.test.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.test.domain.User;
import cn.test.service.UserService;

@Controller("userAction")
@Scope("prototype")
public class UserAction extends BaseAction<User> {

	private static final long serialVersionUID = 5560616425783961911L;
	
	@Resource
	private UserService service;
	private User model = new User();
	@Override
	public User getModel() {
		return model;
	}
	public String doTest(){
		return SUCCESS;
	}

}
