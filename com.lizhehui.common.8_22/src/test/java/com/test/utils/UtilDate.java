package com.test.utils;

import org.junit.Test;

public class UtilDate {
	
	@Test
	private void pub() {
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		String first = sql.replaceFirst("{1}", "replacement");
		System.out.println(first);
	}
	public static void main(String[] args) {
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		
		String first = sql.replaceFirst("{1}", "replacement");
		System.out.println(first);
	}
}
