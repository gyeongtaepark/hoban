package com.naver.eng.appserver.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naver.eng.appserver.model.Feed;
import com.naver.eng.appserver.model.Param;
import com.naver.eng.appserver.repository.HelloWorld;
import com.naver.eng.appserver.repository.Main;

@Service
public class MainBusiness {

	@Autowired
	private Main mainDao;

	@Autowired
	private HelloWorld helloworld;

	public List<Feed> getFeedList(Param param) {
		List<Feed> messageList = mainDao.getMessageList(param);
		messageList.addAll(helloworld.getMessageList(param));

		return messageList;
	}

}
