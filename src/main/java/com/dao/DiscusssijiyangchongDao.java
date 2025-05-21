package com.dao;

import com.entity.DiscusssijiyangchongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusssijiyangchongVO;
import com.entity.view.DiscusssijiyangchongView;


/**
 * 四季养宠评论表
 * 
 * @author 
 * @email 
 * @date 2025-04-25 17:19:25
 */
public interface DiscusssijiyangchongDao extends BaseMapper<DiscusssijiyangchongEntity> {
	
	List<DiscusssijiyangchongVO> selectListVO(@Param("ew") Wrapper<DiscusssijiyangchongEntity> wrapper);
	
	DiscusssijiyangchongVO selectVO(@Param("ew") Wrapper<DiscusssijiyangchongEntity> wrapper);
	
	List<DiscusssijiyangchongView> selectListView(@Param("ew") Wrapper<DiscusssijiyangchongEntity> wrapper);

	List<DiscusssijiyangchongView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusssijiyangchongEntity> wrapper);

	
	DiscusssijiyangchongView selectView(@Param("ew") Wrapper<DiscusssijiyangchongEntity> wrapper);
	

}
