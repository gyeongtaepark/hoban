package com.naver.eng.appserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naver.eng.appserver.business.MainBusiness;
import com.naver.eng.appserver.business.SubBusiness;
import com.naver.eng.appserver.model.Content;
import com.naver.eng.appserver.model.Feed;
import com.naver.eng.appserver.model.Image;
import com.naver.eng.appserver.model.Param;

@Service
public class MainService {

	@Autowired
	private MainBusiness mainBusiness;

	@Autowired
	private SubBusiness subBusiness;

	public Content getMessageList(Param param) {

		List<Feed> feedList = mainBusiness.getFeedList(param);
		List<Image> imageList = subBusiness.getImageList(param);
		return new Content(feedList, imageList);
	}

}
