package com.zhibei.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 空格是可以出现在正则表达式中的，不一定非要用\s
 * @author Administrator
 *
 */
public class TheBlankSpace {
	public static void main(String[] args) {
		//带有空格的字符串
		String str="welcome to 5G time";
		//为了测试空格，就直接用全\w了，当str中每个单词之间是一个空格时。
		String pattern = "\\w+ ?\\w+ \\w+ \\w+";
		Pattern p=Pattern.compile(pattern);
		Matcher m= p.matcher(str);
		if(m.find()==true) {
			boolean string =m.matches();
			System.out.println(string);//true
		}
	}
}
