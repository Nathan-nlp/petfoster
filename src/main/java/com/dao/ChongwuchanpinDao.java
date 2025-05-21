package com.dao;

import com.entity.ChongwuchanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongwuchanpinVO;
import com.entity.view.ChongwuchanpinView;


/**
 * 宠物产品
 * 
 * @author 
 * @email 
 * @date 2025-04-25 17:19:24
 */
public interface ChongwuchanpinDao extends BaseMapper<ChongwuchanpinEntity> {
	
	List<ChongwuchanpinVO> selectListVO(@Param("ew") Wrapper<ChongwuchanpinEntity> wrapper);
	
	ChongwuchanpinVO selectVO(@Param("ew") Wrapper<ChongwuchanpinEntity> wrapper);
	
	List<ChongwuchanpinView> selectListView(@Param("ew") Wrapper<ChongwuchanpinEntity> wrapper);

	List<ChongwuchanpinView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwuchanpinEntity> wrapper);

	
	ChongwuchanpinView selectView(@Param("ew") Wrapper<ChongwuchanpinEntity> wrapper);
	

}
