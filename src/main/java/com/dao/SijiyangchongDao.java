package com.dao;

import com.entity.SijiyangchongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SijiyangchongVO;
import com.entity.view.SijiyangchongView;


/**
 * 四季养宠
 * 
 * @author 
 * @email 
 * @date 2025-04-25 17:19:24
 */
public interface SijiyangchongDao extends BaseMapper<SijiyangchongEntity> {
	
	List<SijiyangchongVO> selectListVO(@Param("ew") Wrapper<SijiyangchongEntity> wrapper);
	
	SijiyangchongVO selectVO(@Param("ew") Wrapper<SijiyangchongEntity> wrapper);
	
	List<SijiyangchongView> selectListView(@Param("ew") Wrapper<SijiyangchongEntity> wrapper);

	List<SijiyangchongView> selectListView(Pagination page,@Param("ew") Wrapper<SijiyangchongEntity> wrapper);

	
	SijiyangchongView selectView(@Param("ew") Wrapper<SijiyangchongEntity> wrapper);
	

}
