package com.zhibei.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 简单电话号码的匹配，^意味着开始，$意思是结束
 * @author Administrator
 *
 */
public class PhoneNumber {
	public static void main(String[] args) {
		String  str ="13023629739";
		Pattern p = Pattern.compile("^1[3|4|5|8][0-9][0-9]{8}$");
					Matcher m = p.matcher(str);
					if(m.find() ==true) {
						String replaceAll = str.replaceAll(m.group(), "12345678910");
						System.out.println(replaceAll);
					}
	}
}
