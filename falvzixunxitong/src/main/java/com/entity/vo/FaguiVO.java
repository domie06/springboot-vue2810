package com.entity.vo;

import com.entity.FaguiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 法规信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("fagui")
public class FaguiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
