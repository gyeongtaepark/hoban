package com.naver.eng.appserver.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

import com.naver.eng.appserver.model.Image;
import com.naver.eng.appserver.model.Param;

@Component
public class Sub {

	private final int MAX_SIZE = 10;
	private final Random rand = new Random();

	public List<Image> getImageList(Param param) {
		List<Image> list = new ArrayList<Image>();
		int size = rand.nextInt(MAX_SIZE);
		for (int index = 0; index < size; index++) {
			list.add(new Image(index, param.getText() + "sub:" + rand.nextInt()));
		}
		return list;
	}

}
