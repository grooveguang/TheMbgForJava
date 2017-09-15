package com.grooveguang.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grooveguang.bean.MallProduct;
import com.grooveguang.bean.MallProductImage;
import com.grooveguang.mapper.MallProductImageMapper;
import com.grooveguang.mapper.MallProductMapper;
import com.grooveguang.service.SpuService;

@Service
public class SpuServiceImp implements SpuService {
	
	@Autowired
	MallProductMapper mallProductMapper;
	
	@Autowired
	MallProductImageMapper mallProductImageMapper;

	@Override
	public void save_spu(MallProduct spu, List<String> img_names) {
		
		mallProductMapper.insert(spu);
		
		mallProductImageMapper.insertProductImage(spu.getId(),img_names);
	}

	@Override
	public List<MallProduct> getProductByFlbh1AndFlbh2(String flbh1, String flbh2) {
		Integer int_flbh1 = Integer.parseInt(flbh1);
		Integer int_flbh2 = Integer.parseInt(flbh2);
		List<MallProduct> productList = mallProductMapper.selectProductByFlbh1AndFlbh2(int_flbh1,int_flbh2);
		return productList;
	}

	@Override
	public MallProduct getProductById(Integer id) {
		MallProduct mallProduct = mallProductMapper.selectByPrimaryKey(id);
		return mallProduct;
	}

	@Override
	public List<MallProductImage> getProductImageByShpId(Integer shpId) {
		List<MallProductImage> mallProductImageLists = mallProductImageMapper.selectProductImageByShpId(shpId);
		return mallProductImageLists;
	}

}
