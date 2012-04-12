package cn.test.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *调查类
 */
public class Survey implements Serializable{
	private static final long serialVersionUID = 7219339512020955347L;
	private Integer id ;
	/* 标题 */
	private String title = "未命名" ;
	/* 下一步按钮显示文本 */
	private String nextText = "下一步";
	/* 完成按钮显示文本 */
	private String doneText = "完成";
	/* 上一步按钮显示文本 */
	private String preText = "上一步";
	/* 退出按钮显示文本 */
	private String exitText = "退出";
	/* 调查创建日期 */
	private Date createDate = new Date() ;
	/* 存放上传上来的图片的路径 */
	private String logoPath ;
	
	/* 调查的最小序号 */
	//private float minOrderNumber ;
	/* 调查的最大序号 */
	//private float maxOrderNumber ;
	
	/* 建立Survey到Page的一对多关联关系 */
	private Set<Page> pages = new HashSet<Page>();
	/* 建立Survey到User之间多对一关联关系 */
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