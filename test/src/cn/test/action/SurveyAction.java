package cn.test.action;

import cn.test.domain.Survey;

public class SurveyAction extends BaseAction<Survey> {
	private static final long serialVersionUID = 1303842348519015254L;
	/**µ÷²é*/
	private Survey survey = new Survey();
	
	@Override
	public Survey getModel() {
		return survey;
	}

}
