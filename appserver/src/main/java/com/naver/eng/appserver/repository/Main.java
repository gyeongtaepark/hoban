package com.naver.eng.appserver.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.naver.eng.appserver.model.Feed;
import com.naver.eng.appserver.model.Param;

@Component
public class Main {

	public List<Feed> getMessageList(Param param) {
		List<Feed> list = new ArrayList<Feed>();
		list.add(new Feed(1, param.getText() + "main123"));
		list.add(new Feed(2, param.getText() + "main123"));
		list.add(new Feed(1, param.getText() + "main123"));
		return list;
	}

}
