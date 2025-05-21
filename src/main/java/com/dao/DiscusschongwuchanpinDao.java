package com.dao;

import com.entity.DiscusschongwuchanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschongwuchanpinVO;
import com.entity.view.DiscusschongwuchanpinView;


/**
 * 宠物产品评论表
 * 
 * @author 
 * @email 
 * @date 2025-04-25 17:19:25
 */
public interface DiscusschongwuchanpinDao extends BaseMapper<DiscusschongwuchanpinEntity> {
	
	List<DiscusschongwuchanpinVO> selectListVO(@Param("ew") Wrapper<DiscusschongwuchanpinEntity> wrapper);
	
	DiscusschongwuchanpinVO selectVO(@Param("ew") Wrapper<DiscusschongwuchanpinEntity> wrapper);
	
	List<DiscusschongwuchanpinView> selectListView(@Param("ew") Wrapper<DiscusschongwuchanpinEntity> wrapper);

	List<DiscusschongwuchanpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschongwuchanpinEntity> wrapper);

	
	DiscusschongwuchanpinView selectView(@Param("ew") Wrapper<DiscusschongwuchanpinEntity> wrapper);
	

}
