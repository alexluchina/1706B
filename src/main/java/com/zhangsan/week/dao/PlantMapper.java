/**
 * @Title: PlantMapper.java
 * @Package com.zhangsan.week.dao
 * @Description: (描述该文件做什么)
 * @author Alex Lu
 * @date 2019年8月30日 下午8:42:48
 * @version V1.0
 */
package com.zhangsan.week.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.zhangsan.week.domain.Plant;
import com.zhangsan.week.vo.PlantVo;

/**
 * @ClassName: PlantMapper
 * @Description: 植物信息mapper
 * @author Alex Lu
 * @date 2019年8月30日 下午8:42:48
 *
 */
public interface PlantMapper extends BaseMapper<Plant> {
	//两表联合查询，这里实现就不需要去创建mapper.xml文件，Constants.WRAPPER就是sql中的ew
	@Select("SELECT t_plant.id AS id,t_plant.name AS name,t_plant.description AS description,t_category.name AS categoryName FROM t_category left JOIN t_plant ON t_category.id = t_plant.category ${ew.customSqlSegment}")
	public IPage<PlantVo> selectAllPlants(IPage<PlantVo> page, @Param(Constants.WRAPPER) Wrapper<PlantVo> queryWrapper);
	@Select("SELECT t_plant.id AS id,t_plant.name AS name,t_plant.description AS description,t_category.name AS categoryName FROM t_category left JOIN t_plant ON t_category.id = t_plant.category ${ew.customSqlSegment}")
	public PlantVo getPlant(@Param(Constants.WRAPPER) Wrapper<PlantVo> queryWrapper);
}
