package com.hccake.ballcat.codegen.model.qo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 模板属性配置 查询对象
 *
 * @author hccake
 * @date 2020-06-22 15:46:39
 */
@Data
@ApiModel(value = "模板属性配置查询对象")
public class TemplatePropertyQO {

	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@ApiModelProperty(value = "ID")
	private Integer id;

	/**
	 * 模板组ID
	 */
	@ApiModelProperty(value = "模板组ID")
	private Integer groupId;

}