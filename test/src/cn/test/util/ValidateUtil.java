package cn.test.util;

import java.io.Serializable;
import java.util.Collection;

/**
 * У�鹤����
 * @author Administrator
 *
 */
public class ValidateUtil {

	/**
	 * �ж��ַ�������Ч��
	 * @param str
	 * @return
	 */
	public static boolean isValid(String str){
		if(str != null && str.trim().length() >0){
			return true;
		}
		return false;
	}
	/**
	 * �жϼ��ϵ���Ч��
	 * @param col
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static boolean isValid(Collection col){
		if(col != null && !col.isEmpty()){
			return true;
		}
		return false;
	}
}
