package cn.test.util;

import java.io.Serializable;
import java.util.Collection;

/**
 * 校验工具类
 * @author Administrator
 *
 */
public class ValidateUtil {

	/**
	 * 判断字符串的有效性
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
	 * 判断集合的有效性
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
