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
	/* 标题 */
	private String title = "未命名";
	/* 描述 */
	private String description ;
	/* 顺序号,用来保持页面的顺序 */
	private float orderNumber ;
	
	/* 建立从page到Question一对多关联关系 */
	private Set<Question> questions = new HashSet<Question>();
	/* 建立Page到Survey的多对一关联关系 */
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
		//顺序号默认跟id保持一致
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
