/**
* @Title: PlantServiceImpl.java
* @Package com.zhangsan.week.service.impl
* @Description: (描述该文件做什么)
* @author Alex Lu
* @date 2019年8月30日 下午9:00:44
* @version V1.0
*/
package com.zhangsan.week.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhangsan.week.dao.PlantMapper;
import com.zhangsan.week.domain.Plant;
import com.zhangsan.week.service.IPlantService;
import com.zhangsan.week.vo.PlantVo;

/**
 * @ClassName: PlantServiceImpl
 * @Description: 植物表的服务实现类，需要继承mybatis-plus的ServiceImpl
 * @author Alex Lu
 * @date 2019年8月30日 下午9:00:44
 *
 */
@Service
public class PlantServiceImpl extends ServiceImpl<PlantMapper, Plant>implements IPlantService{

	@Override
	public IPage<PlantVo> selectAllPlants(IPage<PlantVo> page, Wrapper<PlantVo> queryWrapper) {
		
		return this.baseMapper.selectAllPlants(page, queryWrapper);
	}

	/* (非 Javadoc)
	* <p>Title: getPlant</p>
	* <p>Description:根据植物表主键ID获取植物信息 </p>
	* @param queryWrapper
	* @return
	* @see com.zhangsan.week.service.IPlantService#getPlant(com.baomidou.mybatisplus.core.conditions.Wrapper)
	*/
	@Override
	public PlantVo getPlant(Wrapper<PlantVo> queryWrapper) {

		return this.baseMapper.getPlant(queryWrapper);
	}

}
