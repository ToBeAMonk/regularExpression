package com.zhibei.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 字符串中找到数字
 * @author Administrator
 *
 */
public class FindNum {
	public static void main(String[] args) {
		//等价于String pattern="[0-9]{3}";
		String pattern="[0-9]+";
		String str = "abc123def";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		if(m.find() ==true) {
			String string=m.group();
			System.out.println(string);
		}
	}
}
