package com.dao;

import com.entity.ChongwuyanghuzhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongwuyanghuzhishiVO;
import com.entity.view.ChongwuyanghuzhishiView;


/**
 * 宠物养护知识
 * 
 * @author 
 * @email 
 * @date 2025-04-25 17:19:23
 */
public interface ChongwuyanghuzhishiDao extends BaseMapper<ChongwuyanghuzhishiEntity> {
	
	List<ChongwuyanghuzhishiVO> selectListVO(@Param("ew") Wrapper<ChongwuyanghuzhishiEntity> wrapper);
	
	ChongwuyanghuzhishiVO selectVO(@Param("ew") Wrapper<ChongwuyanghuzhishiEntity> wrapper);
	
	List<ChongwuyanghuzhishiView> selectListView(@Param("ew") Wrapper<ChongwuyanghuzhishiEntity> wrapper);

	List<ChongwuyanghuzhishiView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwuyanghuzhishiEntity> wrapper);

	
	ChongwuyanghuzhishiView selectView(@Param("ew") Wrapper<ChongwuyanghuzhishiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChongwuyanghuzhishiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChongwuyanghuzhishiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChongwuyanghuzhishiEntity> wrapper);



}
