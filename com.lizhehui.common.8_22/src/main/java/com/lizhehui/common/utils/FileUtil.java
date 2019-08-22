package com.lizhehui.common.utils;

/**
 * <br>文件工具类 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:李哲辉(1989773396@qq.com)
 * <br>Date:2019年8月22日
 */
public class FileUtil {
	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(10分)
	*/
	public static String getExtendName(String fileName){
		//TODO 实现代码
		String a =fileName.substring(fileName.indexOf("."));
		return a;
	}
	
	public static void main(String[] args) {
		System.out.println(getExtendName("aa.jsp"));
	}
}
