/**
 * @Title: HomeController.java
 * @Package com.zhangsan.week.controller
 * @Description: (描述该文件做什么)
 * @author Alex Lu
 * @date 2019年8月30日 下午8:42:00
 * @version V1.0
 */
package com.zhangsan.week.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhangsan.week.domain.Category;
import com.zhangsan.week.domain.Plant;
import com.zhangsan.week.service.ICategoryService;
import com.zhangsan.week.service.IPlantService;
import com.zhangsan.week.vo.PlantVo;

/**
 * @ClassName: HomeController
 * @Description: (描述这个类的作用)
 * @author Alex Lu
 * @date 2019年8月30日 下午8:42:00
 *
 */
@Controller
public class HomeController {
	@Autowired
	private ICategoryService categoryService;

	@Autowired
	private IPlantService plantService;

	/**
	 * 
	 * @Title: getPlantList
	 * @Description: 植物信息列表的数据，列表的页面
	 * @param name
	 * @param pageNo
	 * @return
	 * @return ModelAndView
	 */
	@RequestMapping({ "/", "/home", "/index" })
	public ModelAndView getPlantList(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "pageNo", required = false) Integer pageNo) {
		// 指定jsp
		ModelAndView mav = new ModelAndView("plant-list");
		// 当前页，假如为空，就传1
		pageNo = pageNo != null ? pageNo : 1;
		// 分页查询，页面无指定每页的条数，自定义为5
		Page<PlantVo> page = new Page<PlantVo>(pageNo, 5);
		// 条件构造器，用于条件查询，类似于sql的where语句
		QueryWrapper<PlantVo> queryWrapper = new QueryWrapper<PlantVo>();
		if (!StringUtils.isEmpty(name)) {
			queryWrapper = queryWrapper.like("t_plant.name", name);
		}
		// 获取植物信息列表，分页+模糊查询
		IPage<PlantVo> pages = plantService.selectAllPlants(page, queryWrapper);
		// 给页面提供数据，pages中包括列表数据，页数
		mav.addObject("plantPages", pages);
		mav.addObject("pages", pages.getPages());
		mav.addObject("currentPage", pages.getCurrent());
		return mav;
	}

	/**
	 * 
	 * @Title: removeMovie
	 * @Description: 批量删除，单条删除，List长度为一就变成单条删除
	 * @param idList
	 * @return
	 * @return ModelAndView
	 */
	@RequestMapping("/remove")
	public ModelAndView removeMovie(@RequestParam("id") List<Integer> idList) {
		ModelAndView mav = new ModelAndView();
		// 批量删除，传一个主键的数组，不需要循环删除
		plantService.removeByIds(idList);
		// 删除后停留在本页面
		mav.setViewName("redirect:/");
		return mav;
	}
	/**
	 * 
	* @Title: showPlant
	* @Description: 植物信息列表详情展示
	* @param id
	* @return
	* @return ModelAndView
	 */
	@RequestMapping("/showPlant")
	public ModelAndView showPlant(@RequestParam(value = "id", required = true) Integer id) {
		ModelAndView mav = new ModelAndView("showPlant");
		QueryWrapper<PlantVo> queryWrapper = new QueryWrapper<PlantVo>();
		queryWrapper = queryWrapper.eq("t_plant.id", id);
		PlantVo plantVo = plantService.getPlant(queryWrapper);
		mav.addObject("plant", plantVo);
		return mav;
	}
	/**
	 * 
	* @Title: updatePlant
	* @Description: 修改页面
	* @param id
	* @return
	* @return ModelAndView
	 */
	@RequestMapping("/updatePlant")
	public ModelAndView updatePlant(@RequestParam(value="id",required=true) Integer id){
		ModelAndView mav= new ModelAndView("updatePlant");
		QueryWrapper<PlantVo> queryWrapper = new QueryWrapper<PlantVo>();
		queryWrapper = queryWrapper.eq("t_plant.id", id);
		PlantVo plantVo = plantService.getPlant(queryWrapper);
		List<Category> categories = categoryService.list();
		mav.addObject("plant",plantVo);
		mav.addObject("categories",categories);
		mav.addObject("id", id);
		return mav;
	}
	/**
	 * 
	* @Title: changePlant
	* @Description: 修改植物
	* @param plant
	* @return
	* @return ModelAndView
	 */
	@RequestMapping("/changePlant")
	public ModelAndView changePlant(Plant plant){
		ModelAndView mav= new ModelAndView("redirect:/");
		plant.setCreateTime(new Date());
		plantService.update(plant, new UpdateWrapper<Plant>().eq("id", plant.getId()));
		return mav;
	}
}
