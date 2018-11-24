package com.zhibei.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 
 * @author Administrator
 *
 */
public class JsTest {
	public static void main(String[] args) {
		String string="._v(\")hello";
		String pattern="(?<=\\._v\\(\").*?(?=\")";
		Pattern p=Pattern.compile(pattern);
		Matcher m= p.matcher(string);
		if(m.find()==true) {
			boolean str =m.matches();
			System.out.println(str);//true
		}
	}
}
