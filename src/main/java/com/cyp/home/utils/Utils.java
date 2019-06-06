package com.cyp.home.utils;

import java.util.Random;

public class Utils {

	public static String getNum(int length) {
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for(int i=0;i<length;i++) {
			sb.append(random.nextInt(9));
		}
		return sb.toString();
	}
}
