package com.zhibei.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseGhd {
	public static void main(String[] args) {
		//(?<=(href=")).{1,200}(?=(">))
		String s="<br/>您好，非常好，很开心认识你\r\n" + 
				"<br/><a target=_blank href=\"www.baidu.com\">百度一下</a>百度才知道\r\n" + 
				"<br/><a target=_blank href=\"/view/fafa.htm\">发发</ a>最佳帅哥\r\n" + 
				"<br/><a target=_blank href=\"/view/lili.htm\">丽丽</ a>最佳美女\r\n" + 
				"<br/>";
		String pattern="(?<=(href=\")).*(?=(\">))";
		Pattern p=Pattern.compile(pattern);
		//Pattern p=Pattern.compile(pattern1);
		Matcher m=p.matcher(s);
		while(m.find()) {
			//System.out.println(m);
			System.out.println(m.group(0));
//			System.out.println(m.group(1));
//			System.out.println(m.group(2));
		}
		String s1="dog";
		String pattern1="((.)(.(.)))";
		Pattern p1=Pattern.compile(pattern1);
		Matcher m1=p1.matcher(s1);
		while(m1.find()) {
			//System.out.println(m);
			System.out.println(m1.group(0));
			System.out.println(m1.group(1));
			System.out.println(m1.group(2));
			System.out.println(m1.group(3));
			System.out.println(m1.group(4));
		}
		
	}
}
