package com.dao;

import com.entity.FaguiCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FaguiCollectionView;

/**
 * 法规收藏 Dao 接口
 *
 * @author 
 */
public interface FaguiCollectionDao extends BaseMapper<FaguiCollectionEntity> {

   List<FaguiCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
