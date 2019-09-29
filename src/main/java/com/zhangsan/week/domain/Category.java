/**
* @Title: Category.java
* @Package com.zhangsan.week.domain
* @Description: (描述该文件做什么)
* @author Alex Lu
* @date 2019年8月30日 下午8:48:13
* @version V1.0
*/
package com.zhangsan.week.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @ClassName: Category
 * @Description: 分类表信息
 * @author Alex Lu
 * @date 2019年8月30日 下午8:48:13
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@TableName("t_category")
public class Category {
	@TableId(value="id",type=IdType.AUTO)
	private Integer id;
	
	private String name;
	
	private Date createTime;
}
