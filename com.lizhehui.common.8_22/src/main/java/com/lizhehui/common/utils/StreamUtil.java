package com.lizhehui.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * <br>流处理工具类  类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:李哲辉(1989773396@qq.com)
 * <br>Date:2019年8月22日
 */
public class StreamUtil { 
	/*
	* 方法1：批量关闭流，参数能传入无限个。(10分)
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭，并且参数个数不限。
	*/
	public static void closeAll(FileInputStream... stream ){
	for (FileInputStream files : stream) {
		try {
			files.notify();
			files.close();
			System.out.println("已关闭");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(10分)，要求方法内部调用上面第1个方法关闭流(5分)
	*/
	public static String readTextFile(InputStream src,FileInputStream stream) throws IOException{
		
		byte[] byt=new byte[1024];//定义读取字节
		String str="";
		stream.read();
		int i = src.read(byt);
		
		closeAll(stream);
		return null;
	}
	/*
	* 方法3：传入文本文件对象，返回该文件内容(10分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	*/
	public static String readTextFile(File txtFile) throws FileNotFoundException{
		String string = readTextFile(txtFile);
		closeAll(new FileInputStream(txtFile));
		return string;
	}
	
}
