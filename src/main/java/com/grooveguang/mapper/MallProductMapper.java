package com.grooveguang.mapper;

import com.grooveguang.bean.MallProduct;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MallProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MallProduct record);

    MallProduct selectByPrimaryKey(Integer id);

    List<MallProduct> selectAll();

    int updateByPrimaryKey(MallProduct record);

	List<MallProduct> selectProductByFlbh1AndFlbh2(@Param("flbh1") Integer intflbh1, @Param("flbh2") Integer intflbh2);
}