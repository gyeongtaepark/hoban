package com.naver.eng.appserver.model;

public class Feed {

	public Feed(int num, String text) {
		super();
		this.num = num;
		this.text = text;
	}

	int num;
	String text;

	public int getNum() {
		return num;
	}

	public String getText() {
		return text;
	}

}
