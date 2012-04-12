package cn.test.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Page
 */
public class Page implements Serializable{
	private static final long serialVersionUID = -7271780711896367879L;
	private Integer id ;
	/* ���� */
	private String title = "δ����";
	/* ���� */
	private String description ;
	/* ˳���,��������ҳ���˳�� */
	private float orderNumber ;
	
	/* ������page��Questionһ�Զ������ϵ */
	private Set<Question> questions = new HashSet<Question>();
	/* ����Page��Survey�Ķ��һ������ϵ */
	private Survey survey ;
	
	public Survey getSurvey() {
		return survey;
	}
	public void setSurvey(Survey survey) {
		this.survey = survey;
	}
	public Set<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
		//˳���Ĭ�ϸ�id����һ��
		if(id != null){
			setOrderNumber(id);
		}
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(float orderNumber) {
		this.orderNumber = orderNumber;
	}
}
