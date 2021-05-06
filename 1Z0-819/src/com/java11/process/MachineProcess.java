package com.java11.process;

import java.lang.ProcessHandle.Info;
//ProcessBuilder
public class MachineProcess {
public static void main(String[] args) {
	ProcessHandle process=ProcessHandle.current();
	System.out.println(process.pid());
	Info info = process.info();
	System.out.println(info);
	System.out.println(info.user().get());
}
}
