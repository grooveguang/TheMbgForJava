package com.grooveguang.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grooveguang.bean.ObjectMallAttrWithMallValue;
import com.grooveguang.mapper.MallAttrMapper;
import com.grooveguang.service.AttrControllerService;

@Service
public class AttrControllerImp implements AttrControllerService {
	
	@Autowired
	MallAttrMapper mallAttrMapper;

	@Override
	public List<ObjectMallAttrWithMallValue> getAttrListByFlbh2(Integer flbh2) {
		List<ObjectMallAttrWithMallValue> attrList = mallAttrMapper.selectAttrListByFlbh2(flbh2);
		return attrList;
	}
	

}
