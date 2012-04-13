package cn.test.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.test.domain.User;
import cn.test.service.UserService;
import cn.test.util.ValidateUtil;

@Controller("userAction")
@Scope("prototype")
public class UserAction extends BaseAction<User>{
	private static final long serialVersionUID = 5560616425783961911L;
	@Resource
	private UserService userService;
	private User model = new User();
	@Override
	public User getModel() {
		return model;
	}
	//注册
	public String reg(){
		userService.saveEntity(model);
		return SUCCESS;
	}
	//验证数据有效性
	public void validateReg(){
		if(!ValidateUtil.isValid(model.getEmail())){
			addFieldError("email","email必须填写！");
		}
		if(!ValidateUtil.isValid(model.getNickName())){
			addFieldError("nickName", "昵称必须填写！");
		}
		if(!ValidateUtil.isValid(model.getPassword())){
			addFieldError("password", "密码必须填写");
		}
		if(super.hasErrors()){
			return;
		}
		//判断两次密码是否一致---暂时空着
		//数据库判断
		String hql = "from User u where u.email=?";
		List<User> users = userService.findEntityByHQL(hql, model.getEmail());
		if(ValidateUtil.isValid(users)){
			addFieldError("email","该邮箱已被注册！");
		}
	}

}
