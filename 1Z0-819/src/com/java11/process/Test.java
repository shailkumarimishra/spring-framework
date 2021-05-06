package com.java11.process;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		ProcessBuilder process=new ProcessBuilder("notepad.exe","helloMishra");
		process.start();
	}

}
