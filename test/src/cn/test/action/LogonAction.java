package cn.test.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.test.domain.User;
import cn.test.service.UserService;
import cn.test.util.ValidateUtil;

import com.opensymphony.xwork2.ActionSupport;

@Controller("logonAction")
@Scope("prototype")
public class LogonAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 2483854802877638294L;
	/**” œ‰*/
	private String email;
	/**√‹¬Î*/
	private String password;
	/**userService*/
	@Resource
	private UserService userService;
	private Map<String, Object> sessionMap;
	@Override
	public void validate() {
		if(!ValidateUtil.isValid(email)){
			addFieldError("email","” œ‰ÃÓ–¥¥ÌŒÛ£°");
		}
		if(!ValidateUtil.isValid(password)){
			addFieldError("password","√‹¬ÎÃÓ–¥¥ÌŒÛ£°");
		}
		if(hasErrors()){
			return;
		}
	}
	@Override
	public String execute() throws Exception {
		String hql = "from User where email=?";
		List<User> users = userService.findEntityByHQL(hql, email);
		if(ValidateUtil.isValid(users)){
			User user = users.get(0);
			if(user.getPassword().equals(password)){
				sessionMap.put("user", user);
				return SUCCESS;
			}
		}
		addActionError("”√ªß√˚ªÚ√‹¬Î¥ÌŒÛ£°");
		return INPUT;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setSession(Map<String, Object> arg0) {
		sessionMap = arg0;
	}
	
}
