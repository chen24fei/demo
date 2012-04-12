package cn.test.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *������
 */
public class Survey implements Serializable{
	private static final long serialVersionUID = 7219339512020955347L;
	private Integer id ;
	/* ���� */
	private String title = "δ����" ;
	/* ��һ����ť��ʾ�ı� */
	private String nextText = "��һ��";
	/* ��ɰ�ť��ʾ�ı� */
	private String doneText = "���";
	/* ��һ����ť��ʾ�ı� */
	private String preText = "��һ��";
	/* �˳���ť��ʾ�ı� */
	private String exitText = "�˳�";
	/* ���鴴������ */
	private Date createDate = new Date() ;
	/* ����ϴ�������ͼƬ��·�� */
	private String logoPath ;
	
	/* �������С��� */
	//private float minOrderNumber ;
	/* ����������� */
	//private float maxOrderNumber ;
	
	/* ����Survey��Page��һ�Զ������ϵ */
	private Set<Page> pages = new HashSet<Page>();
	/* ����Survey��User֮����һ������ϵ */
	private User user ;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNextText() {
		return nextText;
	}
	public void setNextText(String nextText) {
		this.nextText = nextText;
	}
	public String getDoneText() {
		return doneText;
	}
	public void setDoneText(String doneText) {
		this.doneText = doneText;
	}
	public String getPreText() {
		return preText;
	}
	public void setPreText(String preText) {
		this.preText = preText;
	}
	public String getExitText() {
		return exitText;
	}
	public void setExitText(String exitText) {
		this.exitText = exitText;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Set<Page> getPages() {
		return pages;
	}
	public void setPages(Set<Page> pages) {
		this.pages = pages;
	}
//	public float getMinOrderNumber() {
//		return minOrderNumber;
//	}
//	public void setMinOrderNumber(float minOrderNumber) {
//		this.minOrderNumber = minOrderNumber;
//	}
//	public float getMaxOrderNumber() {
//		return maxOrderNumber;
//	}
//	public void setMaxOrderNumber(float maxOrderNumber) {
//		this.maxOrderNumber = maxOrderNumber;
//	}
	public String getLogoPath() {
		return logoPath;
	}
	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}
}