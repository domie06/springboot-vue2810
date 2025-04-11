package com.entity.view;

import com.entity.FaguiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 法规信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("fagui")
public class FaguiView extends FaguiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 法规类型的值
		*/
		private String faguiValue;



	public FaguiView() {

	}

	public FaguiView(FaguiEntity faguiEntity) {
		try {
			BeanUtils.copyProperties(this, faguiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 法规类型的值
			*/
			public String getFaguiValue() {
				return faguiValue;
			}
			/**
			* 设置： 法规类型的值
			*/
			public void setFaguiValue(String faguiValue) {
				this.faguiValue = faguiValue;
			}











}
