package com.zhibei.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestTable {
	//<td class ?= ?\"form-text\".*?td>
	public static void main(String[] args) {
		//带有空格的字符串
				String str="<td class = \"form-text\"atd>";
				//为了测试空格，就直接用全\w了，当str中每个单词之间是一个空格时。
				String pattern = "<td class ?= ?\"form-text\".*?td>";
				Pattern p=Pattern.compile(pattern);
				Matcher m= p.matcher(str);
				if(m.find()==true) {
					boolean string =m.matches();
					System.out.println(string);//true
				}
				
				
	}
}
