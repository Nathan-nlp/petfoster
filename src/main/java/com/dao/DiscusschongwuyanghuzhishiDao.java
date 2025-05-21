package com.dao;

import com.entity.DiscusschongwuyanghuzhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschongwuyanghuzhishiVO;
import com.entity.view.DiscusschongwuyanghuzhishiView;


/**
 * 宠物养护知识评论表
 * 
 * @author 
 * @email 
 * @date 2025-04-25 17:19:25
 */
public interface DiscusschongwuyanghuzhishiDao extends BaseMapper<DiscusschongwuyanghuzhishiEntity> {
	
	List<DiscusschongwuyanghuzhishiVO> selectListVO(@Param("ew") Wrapper<DiscusschongwuyanghuzhishiEntity> wrapper);
	
	DiscusschongwuyanghuzhishiVO selectVO(@Param("ew") Wrapper<DiscusschongwuyanghuzhishiEntity> wrapper);
	
	List<DiscusschongwuyanghuzhishiView> selectListView(@Param("ew") Wrapper<DiscusschongwuyanghuzhishiEntity> wrapper);

	List<DiscusschongwuyanghuzhishiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschongwuyanghuzhishiEntity> wrapper);

	
	DiscusschongwuyanghuzhishiView selectView(@Param("ew") Wrapper<DiscusschongwuyanghuzhishiEntity> wrapper);
	

}
