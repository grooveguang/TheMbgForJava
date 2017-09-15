package com.grooveguang.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.grooveguang.bean.MallProduct;
import com.grooveguang.bean.MallProductImage;
import com.grooveguang.bean.MallProductWithImage;
import com.grooveguang.service.imp.SpuServiceImp;
import com.grooveguang.util.MyUploadUtil;

@Controller
public class SpuController {
	
	@Autowired
	SpuServiceImp spuServiceImp;
	
	@RequestMapping("goto_spu")
	public String goto_spu(String success,Map<String,Object> map) {
		map.put("success", success);
		return "jsp/spu/goto_spu";
	}
	
	@RequestMapping("get_spu_add")
	public String get_spu_add(Integer flbh1,Integer flbh2,Integer ppId,Map<String,Object> map) {
		map.put("flbh1", flbh1);
		map.put("flbh2", flbh2);
		map.put("ppId", ppId);
		return "jsp/spu/spu_add";
	}
	
	@RequestMapping("get_spu_list")
	public String get_spu_list(String flbh1,String flbh2,Map<String,Object> map) {
		List<MallProduct> productLists = spuServiceImp.getProductByFlbh1AndFlbh2(flbh1,flbh2);
		map.put("productLists", productLists);
		return "jsp/spu/spu_list";
	}
	
	@RequestMapping("spu_update")
	public String spu_update(Integer id,Map<String,Object> map) {
		MallProduct mallProduct = spuServiceImp.getProductById(id);
		List<MallProductImage> mallProductImageLists = spuServiceImp.getProductImageByShpId(mallProduct.getId());
		MallProductWithImage mpi = new MallProductWithImage();
		mpi.setMallProduct(mallProduct);
		mpi.setMallProductImagelists(mallProductImageLists);
		map.put("mpi", mpi);
		return "jsp/spu/spu_update";
	}
	
	@RequestMapping("save_spu")
	public ModelAndView save_spu(MallProduct spu,@RequestParam("files") MultipartFile[] files) {
		List<String> img_names = new ArrayList<String>();
		img_names = MyUploadUtil.upload_image(files);
		
		//商品图片后期修改
		spu.setShpTp(img_names.get(0));
		
		spuServiceImp.save_spu(spu, img_names);
		ModelAndView mv = new ModelAndView("redirect:/goto_spu.do");
		mv.addObject("success", "提交成功");
		return mv;
	}

}
