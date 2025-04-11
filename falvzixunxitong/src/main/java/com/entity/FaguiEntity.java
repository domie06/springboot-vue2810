package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 法规信息
 *
 * @author 
 * @email
 */
@TableName("fagui")
public class FaguiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FaguiEntity() {

	}

	public FaguiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 法规编号
     */
    @TableField(value = "fagui_uuid_number")

    private String faguiUuidNumber;


    /**
     * 法规名称
     */
    @TableField(value = "fagui_name")

    private String faguiName;


    /**
     * 法规封面
     */
    @TableField(value = "fagui_photo")

    private String faguiPhoto;


    /**
     * 法规类型
     */
    @TableField(value = "fagui_types")

    private Integer faguiTypes;


    /**
     * 法规详情
     */
    @TableField(value = "news_content")

    private String newsContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：法规编号
	 */
    public String getFaguiUuidNumber() {
        return faguiUuidNumber;
    }


    /**
	 * 获取：法规编号
	 */

    public void setFaguiUuidNumber(String faguiUuidNumber) {
        this.faguiUuidNumber = faguiUuidNumber;
    }
    /**
	 * 设置：法规名称
	 */
    public String getFaguiName() {
        return faguiName;
    }


    /**
	 * 获取：法规名称
	 */

    public void setFaguiName(String faguiName) {
        this.faguiName = faguiName;
    }
    /**
	 * 设置：法规封面
	 */
    public String getFaguiPhoto() {
        return faguiPhoto;
    }


    /**
	 * 获取：法规封面
	 */

    public void setFaguiPhoto(String faguiPhoto) {
        this.faguiPhoto = faguiPhoto;
    }
    /**
	 * 设置：法规类型
	 */
    public Integer getFaguiTypes() {
        return faguiTypes;
    }


    /**
	 * 获取：法规类型
	 */

    public void setFaguiTypes(Integer faguiTypes) {
        this.faguiTypes = faguiTypes;
    }
    /**
	 * 设置：法规详情
	 */
    public String getNewsContent() {
        return newsContent;
    }


    /**
	 * 获取：法规详情
	 */

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Fagui{" +
            "id=" + id +
            ", faguiUuidNumber=" + faguiUuidNumber +
            ", faguiName=" + faguiName +
            ", faguiPhoto=" + faguiPhoto +
            ", faguiTypes=" + faguiTypes +
            ", newsContent=" + newsContent +
            ", createTime=" + createTime +
        "}";
    }
}
