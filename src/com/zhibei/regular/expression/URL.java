package com.zhibei.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URL {
	public static void main(String[] args) {
		//String url="2000Windows";
		//String pattern="(?<=95|98|NT|2000)Windows";
		String url1="http://www.baidu.com/";
		String pattern="(http://|https://)?(www)\\.(.*)\\.(com|cn|.*)(//)?";
		Pattern p=Pattern.compile(pattern);
		Matcher m= p.matcher(url1);
		boolean string =m.find();
		System.out.println(string);//true
	}
}
