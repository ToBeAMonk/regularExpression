package com.zhibei.regular.expression;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MethodAppendReplacement {
	public static void main(String[] args) throws Exception {
		Map<String, String> htmlPreHandleMap = new HashMap<String, String>();
		// 生成 Pattern 对象并且编译一个简单的正则表达式"c.{2}"，其匹配字符串中的cat
		Pattern p = Pattern.compile("c.{2}");
		// 用 Pattern 类的 matcher() 方法生成一个 Matcher 对象
		Matcher m = p.matcher("fatcatfatcbtfatfatfatcctfat");
		StringBuffer sb = new StringBuffer();
		int i =0;
		while(m.find()){
			//此时sb为fatdogfatdog，cat被替换为dog,并且将最后匹配到之前的子串都添加到sb对象中
			String context=m.group();
			m.appendReplacement(sb,"{dog"+i+"}");
			htmlPreHandleMap.put("{dog"+i+"}", context);
			i++;
			System.out.println(new String(sb));
		}
		//此时sb为fatdogfatdogfat，将最后匹配到后面的子串添加到sb对象中
		m.appendTail(sb);
		//输出内容为fatdogfatdogfat
		System.out.println("sb:"+sb);
		for (String in : htmlPreHandleMap.keySet()) {
			//map.keySet()返回的是所有key的值
			String str = htmlPreHandleMap.get(in);//得到每个key多对用value的值
			System.out.println(in + "     " + str);
		}
		//从打印结果中可以看出来，这里的集合中存储的是替换过得key 是{dog0} {dog1} value是cat
	}
}
