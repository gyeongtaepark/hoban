package com.naver.eng.appserver.model;

public class Image {

	public Image(int num, String url) {
		super();
		this.num = num;
		this.url = url;
	}

	int num;
	String url;

	public int getNum() {
		return num;
	}

	public String getUrl() {
		return url;
	}


}
