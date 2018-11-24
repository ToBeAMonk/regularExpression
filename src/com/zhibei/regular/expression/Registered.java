package com.zhibei.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 注册名匹配
 * @author Administrator
 *
 */
public class Registered {
	public static void main(String[] args) {
		//注册名
		String name = "Ghd_Dxf-1314";
		String name1 = "Ghd_Dxf1314";
		//匹配正则
		String pattern="[a-zA-Z0-9_-]{5,15}";
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(name);
		Matcher m1=p.matcher(name1);
		if(m.find()==true) {
			boolean string=name.matches(pattern);
			System.out.println(string);
		}
		if(m1.find()==true) {
			boolean string=name1.matches(pattern);
			System.out.println(string);
		}
	}
}
