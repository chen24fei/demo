package cn.test.domain;

import java.io.Serializable;
import java.util.Date;
/**
 * �û�ʵ��
 * @author Administrator
 *
 */
public class User implements Serializable{
	private static final long serialVersionUID = 8501484303051899870L;
	/**id*/
	private Integer id;
	/**email*/
	private String email;
	/**����*/
	private String password;
	/**�ǳ�*/
	private String nickName;
	/** ע��ʱ�� */
	private Date regDate = new Date();
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
}
