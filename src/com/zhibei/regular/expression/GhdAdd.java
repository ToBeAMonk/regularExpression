package com.zhibei.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GhdAdd {
	public static void main(String[] args) {
		String  str ="13023629739";
		Pattern p = Pattern.compile("^1[3|4|5|8][0-9][0-9]{8}$");
					Matcher m = p.matcher(str);
					if(m.find() ==true) {
						String replaceAll = str.replaceAll(m.group(), "12345678910");
						System.out.println(replaceAll);
					}
	}
}
