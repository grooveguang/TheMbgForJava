package com.grooveguang.mapper;

import com.grooveguang.bean.MallAttr;
import com.grooveguang.bean.ObjectMallAttrWithMallValue;

import java.util.List;

public interface MallAttrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MallAttr record);

    MallAttr selectByPrimaryKey(Integer id);

    List<MallAttr> selectAll();

    int updateByPrimaryKey(MallAttr record);

	List<ObjectMallAttrWithMallValue> selectAttrListByFlbh2(Integer flbh2);
}