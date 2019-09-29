/**
* @Title: PlantVo.java
* @Package com.zhangsan.week.vo
* @Description: (描述该文件做什么)
* @author Alex Lu
* @date 2019年8月30日 下午9:40:13
* @version V1.0
*/
package com.zhangsan.week.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName: PlantVo
 * @Description: 页面展示的数据
 * @author Alex Lu
 * @date 2019年8月30日 下午9:40:13
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class PlantVo {
	private Integer id;

	private String name;

	private String description;

	private String categoryName;
}
