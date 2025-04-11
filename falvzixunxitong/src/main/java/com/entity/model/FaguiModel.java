package com.entity.model;

import com.entity.FaguiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 法规信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FaguiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 法规详情
     */
    private String newsContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：法规编号
	 */
    public String getFaguiUuidNumber() {
        return faguiUuidNumber;
    }


    /**
	 * 设置：法规编号
	 */
    public void setFaguiUuidNumber(String faguiUuidNumber) {
        this.faguiUuidNumber = faguiUuidNumber;
    }
    /**
	 * 获取：法规名称
	 */
    public String getFaguiName() {
        return faguiName;
    }


    /**
	 * 设置：法规名称
	 */
    public void setFaguiName(String faguiName) {
        this.faguiName = faguiName;
    }
    /**
	 * 获取：法规封面
	 */
    public String getFaguiPhoto() {
        return faguiPhoto;
    }


    /**
	 * 设置：法规封面
	 */
    public void setFaguiPhoto(String faguiPhoto) {
        this.faguiPhoto = faguiPhoto;
    }
    /**
	 * 获取：法规类型
	 */
    public Integer getFaguiTypes() {
        return faguiTypes;
    }


    /**
	 * 设置：法规类型
	 */
    public void setFaguiTypes(Integer faguiTypes) {
        this.faguiTypes = faguiTypes;
    }
    /**
	 * 获取：法规详情
	 */
    public String getNewsContent() {
        return newsContent;
    }


    /**
	 * 设置：法规详情
	 */
    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
