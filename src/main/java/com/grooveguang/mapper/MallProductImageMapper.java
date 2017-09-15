package com.grooveguang.mapper;

import com.grooveguang.bean.MallProductImage;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MallProductImageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MallProductImage record);

    MallProductImage selectByPrimaryKey(Integer id);

    List<MallProductImage> selectAll();

    int updateByPrimaryKey(MallProductImage record);

	void insertProductImage(@Param("shpId")Integer shpId,@Param("imgNames") List<String> img_names);

	List<MallProductImage> selectProductImageByShpId(Integer shpId);
}