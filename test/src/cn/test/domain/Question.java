package cn.test.domain;

import java.io.Serializable;

/**
 * 问题实体 
 */
public class Question implements Serializable{

	private static final long serialVersionUID = 8235756129521444806L;
	private Integer id ;
	/* 题干 */
	private String title ;
	/* 题型 */
	private int questionType ;
	/* 问题选项集,还可用于存储矩阵式下拉列表选项集 */
	private String questionOptions ;
	/* 问题选项数组 */
	private String[] questionOptionArr ;

	/* 是否含有'其他'项 */
	private boolean other ;
	/* 其他选项的类型0:无 1:文本框 2:下拉列表 */
	private int otherType ;
	/* 若'其他'项是下拉列表,列表项内容 */
	private String otherSelectContent ;
	/* '其他'项是下拉列表,列表项内容数组 */
//	private String[] otherSelectContentArr;
	
	/* 行标题标签集 */
	private String rowTitles ;
	/* 行标题集数组 */
//	private String[] rowTitleArr ;
	
	/* 列表标题标签集 */
	private String colTitles ;
	/* 列表题数组 */
	private String[] colTitleArr ;
	
	/* 建立从Question到Page的多对一关联 */
	private Page page ;
	
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
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
	public int getQuestionType() {
		return questionType;
	}
	public void setQuestionType(int questionType) {
		this.questionType = questionType;
	}
	public String getQuestionOptions() {
		return questionOptions;
	}
	
	/**
	 * 重写该方法完成字符串到数组的转换,供页面遍历使用 
	 */
	public void setQuestionOptions(String questionOptions) {
		this.questionOptions = questionOptions;
	//	this.questionOptionArr = StringUtil.str2Arr(questionOptions, "\r\n");
	}
	public boolean isOther() {
		return other;
	}
	public void setOther(boolean other) {
		this.other = other;
	}
	public int getOtherType() {
		return otherType;
	}
	public void setOtherType(int otherType) {
		this.otherType = otherType;
	}
	public String getOtherSelectContent() {
		return otherSelectContent;
	}
	//
	public void setOtherSelectContent(String otherSelectContent) {
		this.otherSelectContent = otherSelectContent;
	//	this.otherSelectContentArr = StringUtil.str2Arr(otherSelectContent, "\r\n");
	}
	public String getRowTitles() {
		return rowTitles;
	}
	public void setRowTitles(String rowTitles) {
		this.rowTitles = rowTitles;
//		this.rowTitleArr = StringUtil.str2Arr(rowTitles, "\r\n");
	}
	public String getColTitles() {
		return colTitles;
	}
	public void setColTitles(String colTitles) {
		this.colTitles = colTitles;
//		this.colTitleArr = StringUtil.str2Arr(colTitles, "\r\n");
	}
	public String[] getQuestionOptionArr() {
		return questionOptionArr;
	}
	public void setQuestionOptionArr(String[] questionOptionArr) {
		this.questionOptionArr = questionOptionArr;
	}
//	public String[] getOtherSelectContentArr() {
//		return otherSelectContentArr;
//	}
//	public void setOtherSelectContentArr(String[] otherSelectContentArr) {
//		this.otherSelectContentArr = otherSelectContentArr;
//	}
//	public String[] getRowTitleArr() {
//		return rowTitleArr;
//	}
//	public void setRowTitleArr(String[] rowTitleArr) {
//		this.rowTitleArr = rowTitleArr;
//	}
	public String[] getColTitleArr() {
		return colTitleArr;
	}
	public void setColTitleArr(String[] colTitleArr) {
		this.colTitleArr = colTitleArr;
	}
}
