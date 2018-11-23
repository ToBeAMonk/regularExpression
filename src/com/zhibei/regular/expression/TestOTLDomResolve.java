package com.zhibei.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *总结：
 *1.出现?=  不一定是正向预查
 *2.需要真正理解每一个字符的含意，比如*   这个字符也是可以匹配前面的表达式的。
 * @author Administrator
 *
 */
public class TestOTLDomResolve {
	public static void main(String[] args) {
		String name = "inputer         = 'hello'";
		//匹配正则
		String pattern="inputer *= ?'.*?'";
		
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(name);
		
		if(m.find()==true) {
			boolean string=name.matches(pattern);
			System.out.println(string);
		}
		String name1 = "hello";
		//匹配正则
		//String pattern1=".*?";//true
		//String pattern1=".....";//true
		String pattern1=".*+";//true
		Pattern p1=Pattern.compile(pattern1);
		Matcher m1=p1.matcher(name1);
		if(m1.find()==true) {
			boolean string=name1.matches(pattern1);
			System.out.println(string);
		}
		String name2 = "(hello)";
		//匹配正则
		//String pattern2=".*?";//true
		//String pattern2=".....";//true
		String pattern2="\\(.*?\\)";//true
		Pattern p2=Pattern.compile(pattern2);
		Matcher m2=p2.matcher(name2);
		if(m2.find()==true) {
			boolean string=name2.matches(pattern2);
			System.out.println(string);
		}
	}
}
