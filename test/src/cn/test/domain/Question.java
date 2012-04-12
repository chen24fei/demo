package cn.test.domain;

import java.io.Serializable;

/**
 * ����ʵ�� 
 */
public class Question implements Serializable{

	private static final long serialVersionUID = 8235756129521444806L;
	private Integer id ;
	/* ��� */
	private String title ;
	/* ���� */
	private int questionType ;
	/* ����ѡ�,�������ڴ洢����ʽ�����б�ѡ� */
	private String questionOptions ;
	/* ����ѡ������ */
	private String[] questionOptionArr ;

	/* �Ƿ���'����'�� */
	private boolean other ;
	/* ����ѡ�������0:�� 1:�ı��� 2:�����б� */
	private int otherType ;
	/* ��'����'���������б�,�б������� */
	private String otherSelectContent ;
	/* '����'���������б�,�б����������� */
//	private String[] otherSelectContentArr;
	
	/* �б����ǩ�� */
	private String rowTitles ;
	/* �б��⼯���� */
//	private String[] rowTitleArr ;
	
	/* �б�����ǩ�� */
	private String colTitles ;
	/* �б������� */
	private String[] colTitleArr ;
	
	/* ������Question��Page�Ķ��һ���� */
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
	 * ��д�÷�������ַ����������ת��,��ҳ�����ʹ�� 
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
