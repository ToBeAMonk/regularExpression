package com.zhibei.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 出生日期的正则表达式
 * @author Administrator
 *
 */
public class Birthday {
	public static void main(String[] args) {
		String date="1992-02-28";
		String pattern="([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8])))";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(date);
		if(m.find() ==true) {
			String string=m.group(0);
			System.out.println(string);
		}
	}
}
