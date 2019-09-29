/**
* @Title: IPlantService.java
* @Package com.zhangsan.week.service
* @Description: (描述该文件做什么)
* @author Alex Lu
* @date 2019年8月30日 下午9:00:14
* @version V1.0
*/
package com.zhangsan.week.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhangsan.week.domain.Plant;
import com.zhangsan.week.vo.PlantVo;

/**
 * @ClassName: IPlantService
 * @Description: 植物信息服务接口，必须继承mybatis-plus的IService
 * @author Alex Lu
 * @date 2019年8月30日 下午9:00:14
 *
 */
public interface IPlantService extends IService<Plant> {
	//按条件分页查询植物信息
	public IPage<PlantVo> selectAllPlants(IPage<PlantVo> page, Wrapper<PlantVo> queryWrapper);
	//根据植物主键ID获取植物信息
	public PlantVo getPlant(Wrapper<PlantVo> queryWrapper);
}
