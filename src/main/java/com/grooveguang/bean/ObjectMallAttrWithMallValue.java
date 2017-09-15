package com.grooveguang.bean;

import java.util.List;

public class ObjectMallAttrWithMallValue extends MallAttr{
 
	private List<MallValue> mallValueList;

	public List<MallValue> getMallValueList() {
		return mallValueList;
	}

	public void setMallValueList(List<MallValue> mallValueList) {
		this.mallValueList = mallValueList;
	}
}
