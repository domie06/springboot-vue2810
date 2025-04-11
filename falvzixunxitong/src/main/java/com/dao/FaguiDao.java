package com.dao;

import com.entity.FaguiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FaguiView;

/**
 * 法规信息 Dao 接口
 *
 * @author 
 */
public interface FaguiDao extends BaseMapper<FaguiEntity> {

   List<FaguiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
