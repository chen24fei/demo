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
	//ע��
	public String reg(){
		userService.saveEntity(model);
		return SUCCESS;
	}
	//��֤������Ч��
	public void validateReg(){
		if(!ValidateUtil.isValid(model.getEmail())){
			addFieldError("email","email������д��");
		}
		if(!ValidateUtil.isValid(model.getNickName())){
			addFieldError("nickName", "�ǳƱ�����д��");
		}
		if(!ValidateUtil.isValid(model.getPassword())){
			addFieldError("password", "���������д");
		}
		if(super.hasErrors()){
			return;
		}
		//�ж����������Ƿ�һ��---��ʱ����
		//���ݿ��ж�
		String hql = "from User u where u.email=?";
		List<User> users = userService.findEntityByHQL(hql, model.getEmail());
		if(ValidateUtil.isValid(users)){
			addFieldError("email","�������ѱ�ע�ᣡ");
		}
	}

}
