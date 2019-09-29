/**
 * @Title: Plant.java
 * @Package com.zhangsan.week.domain
 * @Description: (描述该文件做什么)
 * @author Alex Lu
 * @date 2019年8月30日 下午8:44:23
 * @version V1.0
 */
package com.zhangsan.week.domain;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName: Plant
 * @Description: 植物信息
 * @author Alex Lu
 * @date 2019年8月30日 下午8:44:23
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@TableName("t_plant")
public class Plant {
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;

	private String name;

	private String description;

	private Integer category;

	private Date createTime;
}
