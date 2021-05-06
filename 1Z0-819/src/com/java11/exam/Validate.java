package com.java11.exam;

public class Validate {
//static float validate3(String s, float min,float max) throws IllegalArgumentException {
//	float f = Float.parseFloat(s);
//	if(!Float.isFinite(f) || f<min || f>max) {
//		throw new IllegalAccessException();
//	}
//	return f;
//}
//	static float validate4(String s, float min,float max) throws IllegalArgumentException {
//		float f = Float.parseFloat(s);
//		if(Float.isFinite(f) && f<min && f>max) {
//			throw new IllegalAccessException();
//		}
//		return f;
//	}
//	static float validate2(String s, float min,float max) throws IllegalArgumentException {
//		float f = Float.parseFloat(s);
//		if(f<min || f>max) {
//			throw new IllegalAccessException();
//		}
//		return f;
//	}
	static float validate1(String s) throws IllegalArgumentException {
		return Float.parseFloat(s);
	}
}
