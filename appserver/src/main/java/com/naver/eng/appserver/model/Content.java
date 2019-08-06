package com.naver.eng.appserver.model;

import java.util.List;

public class Content {

	public Content(List<Feed> feedList, List<Image> imageList) {
		super();
		this.feedList = feedList;
		this.imageList = imageList;
	}
	
	List<Feed> feedList;
	List<Image> imageList;
	public List<Feed> getFeedList() {
		return feedList;
	}
	public List<Image> getImageList() {
		return imageList;
	}

}
