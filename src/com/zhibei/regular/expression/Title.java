package com.zhibei.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * IP正则表达式的使用
 * @author Administrator
 *
 */
public class Title {
	public static void main(String[] args) {
		String title="<title>hello</title>";
		/*
		 * 使用"<(title)>.*</\\1>"，会出现nogroup2的异常，\1在这里是一个函数表达第一（title），理解为一个引用
		 */
		//String pattern = "<(title)>.*</\\1>";
		String pattern = "<(title)>.*</(title)>";
		Pattern p=Pattern.compile(pattern);
		//Pattern p=Pattern.compile(pattern1);
		Matcher m=p.matcher(title);

		if(m.find()==true) {
			boolean b=m.matches();
			System.out.println(b);
			System.out.println(m.group(0));
			System.out.println(m.group(1));
			System.out.println(m.group(2));
		}
	}
}
