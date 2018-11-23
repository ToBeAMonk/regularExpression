package com.zhibei.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 匹配文件
 * @author Administrator
 *
 */
public class File {
	public static void main(String[] args) {
		String file1="data.dat";
		String file2="data1.dat";
		String file3="data2.dat";
		String file4="datax.dat";
		String file5="dataN.dat";
		//等效于"data(\\w)*\\.dat"  "data(\\w)?\\.dat"
		String pattern="^data(\\w)*\\.dat$";
		Pattern p=Pattern.compile(pattern);
		Matcher m1=p.matcher(file1);
		Matcher m2=p.matcher(file2);
		Matcher m3=p.matcher(file3);
		Matcher m4=p.matcher(file4);
		Matcher m5=p.matcher(file5);
		//在执行这条输出之后，下面的不再执行，不知什么缘故？
		//System.out.println(m1.matches());
		if(m1.find() ==true) {
			String string = file1.replaceAll(m1.group(), "m1匹配成功");
			System.out.println(string);
		}
		if(m2.find() ==true) {
			String string = file2.replaceAll(m2.group(), "m2匹配成功");
			System.out.println(string);
		}
		if(m3.find() ==true) {
			String string = file3.replaceAll(m3.group(), "m3匹配成功");
			System.out.println(string);
		}
		if(m4.find() ==true) {
			String string = file4.replaceAll(m4.group(), "m4匹配成功");
			System.out.println(string);
		}
		if(m5.find() ==true) {
			String string = file5.replaceAll(m5.group(), "m5匹配成功");
			System.out.println(string);
		}
		
		/**
		 * 测试data.*\\.dat
		 * 等价于data.+\\.dat
		 * 等价于data.{3}\\.dat
		 * 等价于data[a-z]{3}\\.dat
		 * 等价于data[a-z]{0,}\\.dat
		 */
		String pattern1="data[a-z]{0,}\\.dat";
		String file6 ="dataacd.dat";
		Pattern p1=Pattern.compile(pattern1);
		Matcher m6 =p1.matcher(file6);
		if(m6.find()==true) {
			String string = file6.replaceAll(m6.group(), "m6匹配成功");
			System.out.println(string);
		}
	}
}
