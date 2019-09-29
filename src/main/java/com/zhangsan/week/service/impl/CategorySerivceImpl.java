/**
* @Title: CategorySerivceImpl.java
* @Package com.zhangsan.week.service.impl
* @Description: (描述该文件做什么)
* @author Alex Lu
* @date 2019年8月30日 下午9:03:33
* @version V1.0
*/
package com.zhangsan.week.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhangsan.week.dao.CategoryMapper;
import com.zhangsan.week.domain.Category;
import com.zhangsan.week.service.ICategoryService;

/**
 * @ClassName: CategorySerivceImpl
 * @Description: 分类服务实现类，必须继承mybatis-plus的serviceImpl
 * @author Alex Lu
 * @date 2019年8月30日 下午9:03:33
 *
 */
@Service
public class CategorySerivceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
