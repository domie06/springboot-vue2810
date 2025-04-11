package com.entity.view;

import com.entity.FaguiLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 法规留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("fagui_liuyan")
public class FaguiLiuyanView extends FaguiLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 fagui
			/**
			* 法规编号
			*/
			private String faguiUuidNumber;
			/**
			* 法规名称
			*/
			private String faguiName;
			/**
			* 法规封面
			*/
			private String faguiPhoto;
			/**
			* 法规类型
			*/
			private Integer faguiTypes;
				/**
				* 法规类型的值
				*/
				private String faguiValue;
			/**
			* 法规详情
			*/
			private String newsContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public FaguiLiuyanView() {

	}

	public FaguiLiuyanView(FaguiLiuyanEntity faguiLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, faguiLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}













				//级联表的get和set fagui
					/**
					* 获取： 法规编号
					*/
					public String getFaguiUuidNumber() {
						return faguiUuidNumber;
					}
					/**
					* 设置： 法规编号
					*/
					public void setFaguiUuidNumber(String faguiUuidNumber) {
						this.faguiUuidNumber = faguiUuidNumber;
					}
					/**
					* 获取： 法规名称
					*/
					public String getFaguiName() {
						return faguiName;
					}
					/**
					* 设置： 法规名称
					*/
					public void setFaguiName(String faguiName) {
						this.faguiName = faguiName;
					}
					/**
					* 获取： 法规封面
					*/
					public String getFaguiPhoto() {
						return faguiPhoto;
					}
					/**
					* 设置： 法规封面
					*/
					public void setFaguiPhoto(String faguiPhoto) {
						this.faguiPhoto = faguiPhoto;
					}
					/**
					* 获取： 法规类型
					*/
					public Integer getFaguiTypes() {
						return faguiTypes;
					}
					/**
					* 设置： 法规类型
					*/
					public void setFaguiTypes(Integer faguiTypes) {
						this.faguiTypes = faguiTypes;
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
					/**
					* 获取： 法规详情
					*/
					public String getNewsContent() {
						return newsContent;
					}
					/**
					* 设置： 法规详情
					*/
					public void setNewsContent(String newsContent) {
						this.newsContent = newsContent;
					}
















				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
