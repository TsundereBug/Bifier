package com.tsunderebug.bifier;

public class Bifier {

	public static String bifiy(String input) {
		StringBuilder sb = new StringBuilder();
		for(int c : input.toCharArray()) {
			for(int i = 0; i < c; i++) {
				sb.append("\uD83C\uDD71");
			}
			sb.append(" ");
		}
		return sb.toString();
	}

	public static String unbifiy(String s) {
		StringBuilder sb = new StringBuilder();
		String[] bs = s.split(" ");
		for(String sp : bs) {
			sb.append((char) (sp.length() / 2));
		}
		return sb.toString();
	}
}
