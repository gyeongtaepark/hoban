package com.naver.eng.appserver.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.naver.eng.appserver.model.Feed;
import com.naver.eng.appserver.model.Param;

@Component
public class HelloWorld {

	public List<Feed> getMessageList(Param param) {
		List<Feed> list = new ArrayList<Feed>();
		list.add(new Feed(1, param.getText() + "helloWorld"));
		list.add(new Feed(3, param.getText() + "helloWorld2"));
		list.add(new Feed(5, param.getText() + "helloWorld3"));
		list.add(new Feed(4, param.getText() + "helloWorld4"));
		return list;
	}

}
