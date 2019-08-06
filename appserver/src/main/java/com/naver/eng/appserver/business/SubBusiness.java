package com.naver.eng.appserver.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naver.eng.appserver.model.Image;
import com.naver.eng.appserver.model.Param;
import com.naver.eng.appserver.repository.Sub;

@Service
public class SubBusiness {

	
	@Autowired
	private Sub sub;
	
	public List<Image> getImageList(Param param){
		
		return sub.getImageList(param);
	}
	
}
