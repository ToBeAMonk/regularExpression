package com.zhibei.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式模式修饰符
 * @author Administrator
 *
 */
public class PatternXS {
	public static void main(String[] args) {
		/*
		 * 
		 */
		String str="AbC";
//		String pattern="(?i)abc";
		String pattern="(?i)abc";
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(str);
		while(m.find()) {
			boolean b=m.matches();
			System.out.println(b);
		}
	}
}
