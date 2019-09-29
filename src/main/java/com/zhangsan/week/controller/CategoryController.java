/**
* @Title: CategoryController.java
* @Package com.zhangsan.week.controller
* @Description: (描述该文件做什么)
* @author Alex Lu
* @date 2019年8月30日 下午11:57:21
* @version V1.0
*/
package com.zhangsan.week.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.zhangsan.week.domain.Category;
import com.zhangsan.week.domain.Plant;
import com.zhangsan.week.service.ICategoryService;
import com.zhangsan.week.service.IPlantService;

/**
 * @ClassName: CategoryController
 * @Description: (描述这个类的作用)
 * @author Alex Lu
 * @date 2019年8月30日 下午11:57:21
 *
 */
@Controller
public class CategoryController {
	@Autowired
	private ICategoryService categoryService;
	@Autowired
	private IPlantService plantService;
	/**
	 * 
	* @Title: showCategory
	* @Description: 添加页面的展示，主要用于跳转页面
	* @return
	* @return ModelAndView
	 */
	@RequestMapping("/showAdd")
	public ModelAndView showCategory(){
		ModelAndView mav = new ModelAndView("addPlant");
		Plant plant = new Plant(); 
		mav.addObject("plant",plant);
		return mav;
	}
	/**
	 * 
	* @Title: getCategory
	* @Description: 获取分类信息，用于下拉列表(用ajax实现，转成json，写入response)
	* @param response
	* @return void
	 */
	@RequestMapping(value="/getCategories",method = RequestMethod.POST)
	public void getCategory(HttpServletResponse response){
		List<Category> list = categoryService.list();
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		String json = "";
		PrintWriter out = null;
		try {
			json = mapper.writeValueAsString(list);
			out = response.getWriter();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.write(json.toString());
	}
	/**
	 * 
	* @Title: addPlant
	* @Description: 添加保存，返回到主页面
	* @param plant
	* @return
	* @return ModelAndView
	 */
	@RequestMapping(value="/addPlant",method = RequestMethod.POST)
	public ModelAndView addPlant(Plant plant){
		ModelAndView mav = new ModelAndView();
		plant.setCreateTime(new Date());
		plantService.saveOrUpdate(plant);
		mav.setViewName("redirect:/");
		return mav;
	}
}
