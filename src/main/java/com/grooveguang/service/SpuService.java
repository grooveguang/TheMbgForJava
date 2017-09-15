package com.grooveguang.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.grooveguang.bean.MallProduct;
import com.grooveguang.bean.MallProductImage;

@Service
public interface SpuService {

	public void save_spu(MallProduct spu, List<String> img_names) ;

	public List<MallProduct> getProductByFlbh1AndFlbh2(String flbh1, String flbh2);

	public MallProduct getProductById(Integer id);

	public List<MallProductImage> getProductImageByShpId(Integer shpId) ;

}
