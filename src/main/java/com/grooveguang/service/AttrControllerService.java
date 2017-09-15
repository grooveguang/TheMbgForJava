package com.grooveguang.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.grooveguang.bean.ObjectMallAttrWithMallValue;

@Service
public interface AttrControllerService {
	
	public List<ObjectMallAttrWithMallValue> getAttrListByFlbh2(Integer flbh2);

}
