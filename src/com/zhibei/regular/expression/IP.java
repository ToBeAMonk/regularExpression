package com.zhibei.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * IP正则表达式的使用
 * @author Administrator
 *
 */
public class IP {
	public static void main(String[] args) {
		String ip="225.225.225.225";
//		String pattern = "(\\d{1,3})(\\.(\\d{1,3})){3}";
//		String pattern1 = "(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})";
		
		String pattern2 = "(\\d{1,3})(\\.\\1){3}";
		Pattern p=Pattern.compile(pattern2);
		Matcher m=p.matcher(ip);
		
		if(m.find()==true) {
			boolean b=m.matches();
			System.out.println(b);
			System.out.println(m.group(0));
		}
		
	}
}
